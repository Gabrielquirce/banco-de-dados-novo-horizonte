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

import com.exemple.escola_projeto.dto.AlunoDto;
import com.exemple.escola_projeto.model.Aluno;
import com.exemple.escola_projeto.service.AlunoService;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping
    public List<Aluno> listar() {
        return alunoService.listarTodos();
    }

    @GetMapping("/{id}")
    public Aluno buscar(@PathVariable Long id) {
        return alunoService.buscarPorId(id)
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
    }

    @GetMapping("dto/{id}")
    public ResponseEntity<AlunoDto> buscarAlunoResumo(@PathVariable Long id) {
        try {
            AlunoDto dto = alunoService.buscarAlunoDto(id);
            return ResponseEntity.ok(dto);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Aluno criar(@RequestBody Aluno aluno) {
        return alunoService.salvar(aluno);
    }

    @PutMapping("/{id}")
    public Aluno atualizar(@PathVariable Long id, @RequestBody Aluno aluno) {
        return alunoService.atualizar(id, aluno);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        alunoService.deletar(id);
    }
}
