# Modelo 3 - Desafio Hora Prática

Projeto demonstrando múltiplos conceitos de POO incluindo herança, interfaces, streams e polimorfismo.

## 📋 Descrição

Este projeto é um desafio prático abrangente que demonstra diversos conceitos de programação orientada a objetos e coleções em Java através de diferentes pacotes e cenários.

## 🏗️ Estrutura do Projeto

```
src/
├── Main.java
├── animais/
│   ├── Animal.java
│   └── Cachorro.java
├── banco/
│   └── ContaBancaria.java
├── formas/
│   ├── Forma.java
│   ├── Circulo.java
│   └── Quadrado.java
└── produtos/
    └── Produto.java
```

## 🎯 Funcionalidades por Pacote

### Pacote animais
- **Animal**: Classe base com atributo nome
- **Cachorro**: Subclasse que herda de Animal

### Pacote banco
- **ContaBancaria**: Classe para representar contas bancárias com número e saldo

### Pacote formas
- **Forma**: Interface com método `calcularArea()`
- **Circulo**: Implementação de Forma para cálculo de área de círculo
- **Quadrado**: Implementação de Forma para cálculo de área de quadrado

### Pacote produtos
- **Produto**: Classe para representar produtos com nome e preço

## 🚀 Conceitos Demonstrados

### 1. Arrays e Iteração
```java
String[] lista = {"Asi", "Mingau", "bob"};
for (String sla : lista) {
    System.out.println(sla);
}
```

### 2. Herança e instanceof
```java
Cachorro cachorro = new Cachorro("berimbau");
var casting = cachorro instanceof Animal ? (Animal) cachorro : null;
```

### 3. Streams API
```java
double qtdProduto = listaProdutos.stream()
    .filter(p -> p.getNome().equals(produto.getNome()))
    .count();
```

### 4. Interfaces e Polimorfismo
```java
ArrayList<Forma> listaFormas = new ArrayList<>();
listaFormas.add(quadrado);
listaFormas.add(circulo);
for (Forma forma : listaFormas) {
    forma.calcularArea();
}
```

### 5. Busca em ArrayList
```java
ContaBancaria contaMaiorSaldo = listaContas.get(0);
for (ContaBancaria conta : listaContas) {
    if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
        contaMaiorSaldo = conta;
    }
}
```

## 🔧 Tecnologias

- Java
- Herança e Polimorfismo
- Interfaces
- Streams API
- ArrayList
- Arrays
- Operador instanceof

## 📚 Objetivo de Aprendizado

Este projeto abrange múltiplos conceitos:
- **Arrays**: Uso de arrays estáticos e iteração
- **Herança**: Extensão de classes e uso de instanceof
- **Streams API**: Processamento funcional de coleções
- **Interfaces**: Definição e implementação de contratos
- **Polimorfismo**: Tratamento uniforme de diferentes tipos
- **ArrayList**: Busca e manipulação de listas dinâmicas
- **Cálculos**: Implementação de lógica de negócio em diferentes domínios
