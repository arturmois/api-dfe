package br.com.api_dfe.api_dfe.repository;

import br.com.api_dfe.api_dfe.entity.NotaEntrada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotaEntradaRepository extends JpaRepository<NotaEntrada, Long> {

}
