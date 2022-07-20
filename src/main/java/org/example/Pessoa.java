package org.example;

import java.time.LocalDate;

public interface Pessoa {
    String getNome();

    LocalDate getDataNascimento();

    String getCidade();

    String getUf();

    void setNome(String nome);

    void setDataNascimento(LocalDate dataNascimento);

    void setCidade(String cidade);

    void setUf(String uf);

    @Override
    String toString();
}
