package br.com.tqi.credito.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "emprestimo")
public class Emprestimo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column (nullable = false)
    private String cpf;

    @Column (nullable = false)
    private Double valor;

    @Column (nullable = false)
    private Date primeiraParcela;

    @Column (nullable = false)
    private Integer quantidadeParcelas;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getPrimeiraParcela() { return primeiraParcela;}

    public void setPrimeiraParcela(Date primeiraParcela) {
        this.primeiraParcela = primeiraParcela;
    }

    public Integer getQuantidadeParcelas() {
        return quantidadeParcelas;
    }

    public void setQuantidadeParcelas(Integer quantidadeParcelas) {
        this.quantidadeParcelas = quantidadeParcelas;
    }

    public int getQuantidadeDias(Date dataemprestimo) {

        Date dataatual = new Date();
        return  (int)( (dataemprestimo.getTime() - dataatual.getTime()) / (1000 * 60 * 60 * 24));
    }
}
