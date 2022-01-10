package br.com.tqi.credito.model;


import javax.persistence.*;

@Entity
@Table (name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cliente_id;

    @Column (nullable = false)
    private String cpf;

    @Column (nullable = false)
    private String nome;

    @Column (nullable = false)
    private String rg;

    @Column (nullable = false)
    private String email;

    @Column (nullable = false)
    private Double renda;

    @Column (nullable = false)
    private String senha;

    @Column (nullable = false)
    private String rua;

    @Column (nullable = false)
    private String numero;

    @Column (nullable = false)
    private String bairro;

    private String cep;

    private String cidade;

    private String estado;

    public Long getCliente_id() { return cliente_id; }

    public void setCliente_id(Long cliente_id) { this.cliente_id = cliente_id; }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getRenda() {
        return renda;
    }

    public void setRenda(Double renda) {
        this.renda = renda;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


}
