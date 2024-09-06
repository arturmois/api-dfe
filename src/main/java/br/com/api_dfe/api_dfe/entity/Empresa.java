package br.com.api_dfe.api_dfe.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "empresa")
@SequenceGenerator(name = "EmpresaSeq", sequenceName = "SEQ_EMPRESA", allocationSize = 1)
@Data
public class Empresa {

    @Id
    @GeneratedValue(generator = "EmpresaSeq", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String cnpj;
    private String razaoSocial;
    private byte[] certificado;
    private String senhaCertificado;
    private String nsu;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
