package com.exemple.escola_projeto.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import com.exemple.escola_projeto.dto.PaiDto;
import com.exemple.escola_projeto.model.Pai;
import com.exemple.escola_projeto.repository.PaiRepository;

@Service
public class PaiService {

    private final PaiRepository PaiRepository;

    public PaiService(PaiRepository PaiRepository) {
        this.PaiRepository = PaiRepository;
    }

    public List<Pai> listarTodos() {
        return PaiRepository.findAll();
    }

    public Pai buscarPorId(Long id) {
        return PaiRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Mãe não encontrada"));
    }

    public PaiDto buscarPaiDto(Long id) {
        Pai pai = PaiRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pai não encontrado"));
        return paiDto(pai);
    }

    public List<PaiDto> listarTodosPaisDto() {
        return PaiRepository.findAll().stream()
                .map(this::paiDto)
                .collect(Collectors.toList());
    }

    public Pai salvar(Pai Pai) {
        return PaiRepository.save(Pai);
    }

    public Pai atualizar(Long id, Pai novaPai) {
        return PaiRepository.findById(id)
                .map(pai -> {

                    pai.setNomePai(novaPai.getNomePai());
                    pai.setDataNascimentoPai(novaPai.getDataNascimentoPai());
                    pai.setEnderecoPai(novaPai.getEnderecoPai());
                    pai.setCepPai(novaPai.getCepPai());
                    pai.setCpfPai(novaPai.getCpfPai());
                    pai.setRgPai(novaPai.getRgPai());
                    pai.setProfissaoPai(novaPai.getProfissaoPai());
                    pai.setTelefonePai(novaPai.getTelefonePai());
                    pai.setEmailPai(novaPai.getEmailPai());
                    pai.setLocalTrabalhoPai(novaPai.getLocalTrabalhoPai());
                    pai.setTelefoneTrabalhoPai(novaPai.getTelefoneTrabalhoPai());
                    return PaiRepository.save(pai);
                })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Mãe não encontrada"));
    }

    public void deletar(Long id) {
        if (!PaiRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Pai não encontrada");
        }
        PaiRepository.deleteById(id);
    }

    private PaiDto paiDto(Pai pai) {
        return new PaiDto(
                pai.getIdPai(),
                pai.getNomePai(),
                pai.getEnderecoPai(),
                pai.getCpfPai(),
                pai.getRgPai(),
                pai.getTelefonePai(),
                pai.getEmailPai(),
                pai.getLocalTrabalhoPai(),
                pai.getTelefoneTrabalhoPai()
        );
    }
}
