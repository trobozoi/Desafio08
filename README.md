# Desafio08
[Desafio] BE-JV-005 TÉCNICAS DE PROGRAMAÇÃO - 8

Questão #1

Vale 100

Enunciado

A partir de um arquivo TXT posicional com o seguinte conteudo:

https://s3-sa-east-1.amazonaws.com/lcpi/67fdd982-9281-4bb3-bf89-f7c4b157b8f8.txt

Faça a leitura do arquivo (utilizando a api NIO 2) e faça a transformaçao para uma lista de objetos Pessoa (utilizando stream):

class Pessoa {
String nome;
LocalDate dataNascimento;
String cidade;
String uf;
}