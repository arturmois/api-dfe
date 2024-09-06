package br.com.api_dfe.api_dfe.service;

import br.com.api_dfe.api_dfe.entity.Empresa;
import br.com.api_dfe.api_dfe.exception.SistemaException;
import br.com.api_dfe.api_dfe.repository.EmpresaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EmpresaService {

    private final EmpresaRepository empresaRepository;

    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    private Empresa salvar(Empresa empresa) {
        validar(empresa);
        return empresaRepository.save(empresa);
    }

    private List<Empresa> listar() {
        return empresaRepository.findAll();
    }

    private void deletar(Long empresaId) {
        empresaRepository.deleteById(empresaId);
    }

    private void validar(Empresa empresa) {
        Optional.ofNullable(empresa.getCnpj()).orElseThrow(() -> new SistemaException("Campo cnpj obrigatório"));
    }
}
