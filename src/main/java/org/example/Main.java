package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Pessoa> pessoas = extracted(Path.of("67fdd982-9281-4bb3-bf89-f7c4b157b8f8.txt"));
        pessoas.forEach(System.out::println);
    }

    private static List<Pessoa> extracted(Path path) throws IOException {
        List<Pessoa> pessoas = new ArrayList<>();
        List<String> stringList = Files.readAllLines(path).stream().filter(s -> s.indexOf("NOME                              DATA NASC      CIDADE                        UF") < 0).collect(Collectors.toList());

        for (String s :
                stringList) {
            String nome = s.substring(0, 34).trim();
            String dataNascimento = s.substring(34, 15+34).trim();
            String cidade = s.substring(49, 30+49).trim();
            String uf = s.substring(79);
            pessoas.add(new PessoaIml(nome, LocalDate.parse(dataNascimento), cidade, uf));
        }

        return pessoas;
    }
}