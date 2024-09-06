package br.com.api_dfe.api_dfe.service;

import br.com.api_dfe.api_dfe.entity.NotaEntrada;
import br.com.api_dfe.api_dfe.exception.SistemaException;
import br.com.api_dfe.api_dfe.repository.NotaEntradaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotaEntradaService {

    private final NotaEntradaRepository notaEntradaRepository;

    public NotaEntradaService(NotaEntradaRepository notaEntradaRepository) {
        this.notaEntradaRepository = notaEntradaRepository;
    }

    private NotaEntrada salvar(NotaEntrada notaEntrada) {
        validar(notaEntrada);
        return notaEntradaRepository.save(notaEntrada);
    }

    private List<NotaEntrada> listar() {
        return notaEntradaRepository.findAll();
    }

    private void deletar(Long notaEntradaId) {
        notaEntradaRepository.deleteById(notaEntradaId);
    }

    private void validar(NotaEntrada notaEntrada) {
        Optional.ofNullable(notaEntrada.getChave()).orElseThrow( () -> new SistemaException("Campo chave obrigatório"));
    }
}
