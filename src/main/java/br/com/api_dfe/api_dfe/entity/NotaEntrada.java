package br.com.api_dfe.api_dfe.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;

@Entity
@Table(name = "nota_entrada")
@SequenceGenerator(name = "NotaEntradaSeq", sequenceName = "SEQ_NOTA_ENTRADA", allocationSize = 1)
@Data
public class NotaEntrada {

    @Id
    @GeneratedValue(generator = "NotaEntradaSeq", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String cnpj;
    private String schema;
    private String chave;
    private String nomeEmitente;
    private String cnpjEmitente;
    private BigDecimal valor;
    private byte[] xml;

    @ManyToOne
    @JoinColumn(name="empresa_id")
    private Empresa empresa;

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }
}
