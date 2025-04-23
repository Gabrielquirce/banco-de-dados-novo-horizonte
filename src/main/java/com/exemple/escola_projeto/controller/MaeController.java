package com.exemple.escola_projeto.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.exemple.escola_projeto.dto.MaeDto;
import com.exemple.escola_projeto.model.Mae;
import com.exemple.escola_projeto.service.MaeService;

@RestController
@RequestMapping("/maes")
public class MaeController {

    private final MaeService maeService;

    public MaeController(MaeService maeService) {
        this.maeService = maeService;
    }

    @GetMapping
    public List<Mae> listar() {
        return maeService.listarTodas();
    }

    @GetMapping("/{id}")
    public Mae buscar(@PathVariable Long id) {
        return maeService.buscarPorId(id);
    }

    @GetMapping("dto/{id}")
    public ResponseEntity<MaeDto> buscarMaeResumo(@PathVariable Long id) {
        try {
            MaeDto dto = maeService.buscarMaeDto(id);
            return ResponseEntity.ok(dto);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Mae criar(@RequestBody Mae mae) {
        return maeService.salvar(mae);
    }

    @PutMapping("/{id}")
    public Mae atualizar(@PathVariable Long id, @RequestBody Mae mae) {
        return maeService.atualizar(id, mae);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        maeService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
