package com.exemple.escola_projeto.controller;

import com.exemple.escola_projeto.model.Observacoes;
import com.exemple.escola_projeto.service.ObservacoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

import com.exemple.escola_projeto.dto.ObservacoesDto;

@RestController
@RequestMapping("/observacoes")
public class ObservacoesController {

    @Autowired
    private ObservacoesService observacoesService;

    @GetMapping
    public List<Observacoes> getAllObservacoes() {
        return observacoesService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Observacoes> buscarObservacoesPorId(@PathVariable Long id) {
        Optional<Observacoes> observacoes = observacoesService.buscarPorId(id);
        return observacoes.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("dto/{id}")
    public ResponseEntity<ObservacoesDto> buscarObservacoesResumo(@PathVariable Long id) {
        try {
            ObservacoesDto dto = observacoesService.buscarObservacoesDto(id);
            return ResponseEntity.ok(dto);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Observacoes criarObservacoes(@RequestBody Observacoes observacoes) {
        return observacoesService.salvar(observacoes);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Observacoes> atualizarObservacoes(@PathVariable Long id, @RequestBody Observacoes updatedObservacoes) {
        try {
            Observacoes observacoes = observacoesService.atualizar(id, updatedObservacoes);
            return ResponseEntity.ok(observacoes);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarObservacoes(@PathVariable Long id) {
        observacoesService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
