package com.exemple.escola_projeto.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.exemple.escola_projeto.dto.PaiDto;
import com.exemple.escola_projeto.model.Pai;
import com.exemple.escola_projeto.service.PaiService;

@RestController
@RequestMapping("/pais")
public class PaiController {

    private final PaiService paiService;

    public PaiController(PaiService paiService) {
        this.paiService = paiService;
    }

    @GetMapping
    public List<Pai> listar() {
        return paiService.listarTodos();
    }

    @GetMapping("/{id}")
    public Pai buscar(@PathVariable Long id) {
        return paiService.buscarPorId(id);
    }

    @GetMapping("dto/{id}")
    public ResponseEntity<PaiDto> buscarPaiResumo(@PathVariable Long id) {
        try {
            PaiDto dto = paiService.buscarPaiDto(id);
            return ResponseEntity.ok(dto);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("dto")
    public ResponseEntity<List<PaiDto>> listarTodosPaisDto() {
        List<PaiDto> listaDto = paiService.listarTodosPaisDto();
        return ResponseEntity.ok(listaDto);
    }

    @PostMapping
    public Pai criar(@RequestBody Pai pai) {
        return paiService.salvar(pai);
    }

    @PutMapping("/{id}")
    public Pai atualizar(@PathVariable Long id, @RequestBody Pai pai) {
        return paiService.atualizar(id, pai);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        paiService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
