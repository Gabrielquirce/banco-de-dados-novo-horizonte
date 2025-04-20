package com.exemple.escola_projeto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.exemple.escola_projeto.model.Aluno;
import com.exemple.escola_projeto.repository.AlunoRepository;

@Service
public class AlunoService {

    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public List<Aluno> listarTodos() {
        return alunoRepository.findAll();
    }

    public Optional<Aluno> buscarPorId(Long id) {
        return alunoRepository.findById(id);
    }

    public Aluno salvar(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public void deletar(Long id) {
        alunoRepository.deleteById(id);
    }

    public Aluno atualizar(Long id, Aluno novoAluno) {
        return alunoRepository.findById(id)
            .map(aluno -> {
                aluno.setNome(novoAluno.getNome());
                aluno.setIdade(novoAluno.getIdade());
                aluno.setDataNascimento(novoAluno.getDataNascimento());
                aluno.setNaturalidade(novoAluno.getNaturalidade());
                aluno.setNacionalidade(novoAluno.getNacionalidade());
                aluno.setSexo(novoAluno.getSexo());
                aluno.setCpf(novoAluno.getCpf());
                aluno.setRg(novoAluno.getRg());
                aluno.setAnoLetivo(novoAluno.getAnoLetivo());
                aluno.setTermo(novoAluno.getTermo());
                aluno.setFolha(novoAluno.getFolha());
                aluno.setLivro(novoAluno.getLivro());
                aluno.setMatricula(novoAluno.getMatricula());
                aluno.setTurno(novoAluno.getTurno());
                aluno.setTipoSanguineo(novoAluno.getTipoSanguineo());
                aluno.setRaca(novoAluno.getRaca());
                aluno.setResideCom(novoAluno.getResideCom());
                return alunoRepository.save(aluno);
            }).orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
    }
}
