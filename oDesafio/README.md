# O Desafio - Sistema de Compras

Projeto interativo de gerenciamento de compras com limite de cartão de crédito.

## 📋 Descrição

Este projeto é um sistema interativo de compras que simula uma experiência de e-commerce, onde o usuário define um limite de cartão de crédito e realiza compras dentro desse limite, com validação de saldo e ordenação de compras.

## 🏗️ Estrutura do Projeto

```
src/
├── Main.java
└── models/
    └── Compra.java
```

## 🎯 Funcionalidades

### Classe Compra

- **Implementa**: Comparable<Compra>
- **Atributos**:
  - `descricao`: String - Descrição da compra
  - `valor`: double - Valor da compra

- **Métodos**:
  - Construtor que recebe descrição e valor
  - Getters para descrição e valor
  - `toString()`: Representação formatada da compra
  - `compareTo()`: Implementação para ordenação por valor

### Classe Main

Sistema interativo que:
1. Define um limite de cartão de crédito
2. Apresenta um catálogo de produtos disponíveis
3. Permite seleção de produtos pelo número
4. Valida saldo disponível antes da compra
5. Atualiza saldo após cada compra
6. Remove produtos comprados do catálogo
7. Permite continuar comprando ou encerrar
8. Exibe lista de compras realizadas

## 🚀 Fluxo do Sistema

1. **Inicialização**: Sistema carrega catálogo de produtos
2. **Definição de Limite**: Usuário informa limite do cartão
3. **Loop de Compras**:
   - Exibe saldo disponível
   - Pergunta se deseja continuar
   - Apresenta catálogo numerado
   - Usuário seleciona produto
   - Valida saldo disponível
   - Realiza compra ou informa saldo insuficiente
4. **Encerramento**: Exibe compras realizadas

## 📝 Exemplo de Uso

```java
// Criação de compras
Compra pera = new Compra("Pera pra comer", 2.50);
Compra banana = new Compra("Banana pra comer", 1.75);

// Sistema interativo
System.out.println("Qual o seu limite do cartão?");
double saldoDisponivel = scanner.nextDouble();

// Validação de saldo
if (listaCompras.get(produtoDesejado).getValor() > saldoDisponivel) {
    System.out.println("Saldo indisponível!");
} else {
    saldoDisponivel -= listaCompras.get(produtoDesejado).getValor();
    comprasRealizadas.add(listaCompras.get(produtoDesejado));
}
```

## 🔧 Tecnologias

- Java
- ArrayList
- Interface Comparable
- Scanner para entrada de dados
- Collections.sort()
- Estruturas de controle (while, switch)
- Validação de negócio

## 📚 Objetivo de Aprendizado

Este projeto demonstra:
- **Interatividade**: Uso de Scanner para entrada do usuário
- **Validação**: Verificação de saldo disponível antes de compras
- **Gerenciamento de Estado**: Atualização de saldo e listas
- **Ordenação**: Ordenação de compras por valor
- **Lógica de Negócio**: Regras de validação e fluxo de compra
- **Estruturas de Controle**: Uso de loops e condicionais
- **Manipulação de Listas**: Adição e remoção de elementos
