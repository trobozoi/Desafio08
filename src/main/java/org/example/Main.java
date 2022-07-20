package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> stringList = Files.readAllLines(Path.of("67fdd982-9281-4bb3-bf89-f7c4b157b8f8.txt"));
        for (String s :
                stringList) {
            Pessoa pessoa = new Pessoa("", LocalDate.now(), "", "");
        }
    }
}