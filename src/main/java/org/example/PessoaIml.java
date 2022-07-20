package org.example;

import java.time.LocalDate;

public class PessoaIml implements Pessoa {
    String nome;
    LocalDate dataNascimento;
    String cidade;
    String uf;

    public PessoaIml(String nome, LocalDate dataNascimento, String cidade, String uf) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cidade = cidade;
        this.uf = uf;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public String getCidade() {
        return cidade;
    }

    @Override
    public String getUf() {
        return uf;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", cidade='" + cidade + '\'' +
                ", uf='" + uf + '\'' +
                '}';
    }
}
