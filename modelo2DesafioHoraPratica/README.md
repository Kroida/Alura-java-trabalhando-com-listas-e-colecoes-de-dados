# Modelo 2 - Desafio Hora Prática

Projeto demonstrando herança com classes de produtos e produtos perecíveis.

## 📋 Descrição

Este projeto demonstra o uso de herança em Java através de um sistema de gerenciamento de produtos, com uma classe base `Produto` e uma classe derivada `ProdutoPerecivel`.

## 🏗️ Estrutura do Projeto

```
src/
├── Main.java
└── models/
    ├── Produto.java
    └── ProdutoPerecivel.java
```

## 🎯 Funcionalidades

### Classe Produto (Base)

- **Atributos**:
  - `nome`: String - Nome do produto
  - `preco`: double - Preço do produto
  - `quantidade`: int - Quantidade em estoque

- **Métodos**:
  - Getters para todos os atributos
  - `toString()` para representação formatada

### Classe ProdutoPerecivel (Derivada)

- **Herda de**: Produto
- **Atributo adicional**:
  - `dataValidade`: String - Data de validade do produto

- **Métodos**:
  - Construtor que chama o construtor da classe base
  - `toString()` sobrescrito para incluir data de validade

### Classe Main

Demonstra:
- Criação de objetos Produto
- Uso de ArrayList para armazenar produtos
- Criação de objetos ProdutoPerecivel (herança)
- Polimorfismo através da herança

## 🚀 Conceitos Demonstrados

- **Herança**: Extensão de classe base para criar classe derivada
- **Encapsulamento**: Atributos privados com getters
- **Polimorfismo**: Uso de subclasses através da classe base
- **ArrayList**: Armazenamento de objetos em lista dinâmica
- **Sobrescrita de métodos**: Override de toString()

## 📝 Exemplo de Uso

```java
// Criação de produtos base
Produto maca = new Produto("Maçã", 2.50, 12);
Produto pera = new Produto("Pera", 3, 20);

// Uso de ArrayList
ArrayList<Produto> listaProduto = new ArrayList<>();
listaProduto.add(maca);
listaProduto.add(pera);

// Criação de produto perecível (herança)
ProdutoPerecivel uva = new ProdutoPerecivel("Uva", 15, 51, "23/06/2026");
System.out.println(uva); // Inclui data de validade
```

## 🔧 Tecnologias

- Java
- Herança e Polimorfismo
- ArrayList
- POO (Programação Orientada a Objetos)

## 📚 Objetivo de Aprendizado

Este projeto demonstra:
- Conceitos de herança em Java
- Criação de classes derivadas
- Uso da palavra-chave `extends`
- Sobrescrita de métodos
- Reutilização de código através de herança
