package com.exemple.escola_projeto.service;

import com.exemple.escola_projeto.model.Observacoes;
import com.exemple.escola_projeto.repository.ObservacoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import com.exemple.escola_projeto.dto.ObservacoesDto;

@Service
public class ObservacoesService {

    @Autowired
    private ObservacoesRepository observacoesRepository;

    public List<Observacoes> listarTodos() {
        return observacoesRepository.findAll();
    }

    public Optional<Observacoes> buscarPorId(Long id) {
        return observacoesRepository.findById(id);
    }

    public ObservacoesDto buscarObservacoesDto(Long id) {
        Observacoes observacoes = observacoesRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Observações não encontradas"));
        return observacoesDto(observacoes);
    }

    public Observacoes salvar(Observacoes observacoes) {
        return observacoesRepository.save(observacoes);
    }

    public Observacoes atualizar(Long id, Observacoes updatedObservacoes) {
        return observacoesRepository.findById(id).map(observacoes -> {
            observacoes.setTemIrmao(updatedObservacoes.getTemIrmao());
            observacoes.setTemAcompanhamento(updatedObservacoes.getTemAcompanhamento());
            observacoes.setTemAlergia(updatedObservacoes.getTemAlergia());
            observacoes.setTemMedicamento(updatedObservacoes.getTemMedicamento());
            observacoes.setPessoasAutorizadas(updatedObservacoes.getPessoasAutorizadas());
            return observacoesRepository.save(observacoes);
        }).orElseThrow(() -> new RuntimeException("Observações não encontradas com o id " + id));
    }

    public void deletar(Long id) {
        observacoesRepository.deleteById(id);
    }

    private ObservacoesDto observacoesDto(Observacoes observacoes) {
        return new ObservacoesDto(
                observacoes.getTemAcompanhamento(),
                observacoes.getTemAlergia(),
                observacoes.getTemMedicamento(),
                observacoes.getPessoasAutorizadas(),
                observacoes.getResponsavelFinancereiro(),
                observacoes.getTelefoneResponsavelFinancereiro()
        );
    }
}
