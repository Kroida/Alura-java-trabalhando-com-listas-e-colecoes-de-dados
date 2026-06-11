# Modelo 1 - Desafio Hora Prática

Projeto demonstrando o uso básico de ArrayList com uma classe Pessoa.

## 📋 Descrição

Este projeto é um exemplo simples de implementação de ArrayList em Java, utilizando uma classe Pessoa para demonstrar conceitos fundamentais de coleções.

## 🏗️ Estrutura do Projeto

```
src/
├── Main.java
└── Pessoa.java
```

## 🎯 Funcionalidades

### Classe Pessoa

- **Atributos**:
  - `nome`: String - Nome da pessoa
  - `idade`: int - Idade da pessoa

- **Métodos**:
  - Construtor que recebe nome e idade
  - `toString()` para representação textual

### Classe Main

Demonstra:
- Criação de objetos Pessoa
- Uso de ArrayList para armazenar múltiplas pessoas
- Iteração com for-each
- Acesso a elementos por índice

## 🚀 Conceitos Demonstrados

- **ArrayList**: Lista dinâmica para armazenar objetos
- **For-each**: Iteração simplificada sobre coleções
- **Encapsulamento**: Atributos privados com construtor
- **toString**: Sobrescrita para representação de objetos

## 📝 Exemplo de Uso

```java
// Criação de pessoas
var pessoa1 = new Pessoa("Luís", 20);
var pessoa2 = new Pessoa("Isabely", 13);
var pessoa3 = new Pessoa("Laura", 6);

// Uso de ArrayList
ArrayList<Pessoa> listaPessoas = new ArrayList<>();
listaPessoas.add(pessoa1);
listaPessoas.add(pessoa2);
listaPessoas.add(pessoa3);

// Iteração
for (Pessoa pessoa : listaPessoas) {
    System.out.println(pessoa);
}
```

## 🔧 Tecnologias

- Java
- ArrayList
- POO (Programação Orientada a Objetos)

## 📚 Objetivo de Aprendizado

Este projeto introduz os conceitos básicos de:
- Criação e uso de ArrayList
- Manipulação de coleções de objetos
- Iteração sobre listas
