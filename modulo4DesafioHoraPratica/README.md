# Módulo 4 - Desafio Hora Prática

Projeto demonstrando ordenação de coleções e diferentes implementações de List.

## 📋 Descrição

Este projeto foca em conceitos avançados de ordenação e coleções em Java, demonstrando o uso de ArrayList, LinkedList, interface Comparable e polimorfismo com List.

## 🏗️ Estrutura do Projeto

```
src/
├── Main.java
└── Titulo.java
```

## 🎯 Funcionalidades

### Classe Titulo

- **Implementa**: Comparable<Titulo>
- **Atributos**:
  - `nome`: String - Nome do título

- **Métodos**:
  - Construtor que recebe nome
  - `getNome()`: Retorna o nome
  - `toString()`: Representação textual
  - `compareTo()`: Implementação de Comparable para ordenação alfabética

### Classe Main

Demonstra:
1. Ordenação de ArrayList de inteiros
2. Ordenação de ArrayList de objetos Titulo
3. Comparação entre ArrayList e LinkedList
4. Polimorfismo com interface List

## 🚀 Conceitos Demonstrados

### 1. Ordenação com Collections.sort()
```java
ArrayList<Integer> lista = new ArrayList();
for (int i = 10; i > 0; i--) {
    lista.add(i);
}
Collections.sort(lista); // Ordena crescente
```

### 2. Comparable com Objetos
```java
ArrayList<Titulo> listaTitulo = new ArrayList<>();
listaTitulo.add(titulo1);
listaTitulo.add(titulo2);
Collections.sort(listaTitulo); // Ordena por nome
```

### 3. ArrayList vs LinkedList
```java
List<Integer> listaList = new ArrayList<>();
List<Integer> listaLinked = new LinkedList<>();
// Ambos implementam List, comportamento similar
```

### 4. Polimorfismo com List
```java
List<String> listaPolimorfica;
listaPolimorfica = new ArrayList<>(); // Pode ser ArrayList
listaPolimorfica = new LinkedList<>(); // Ou LinkedList
```

## 🔧 Tecnologias

- Java
- Collections Framework
- Interface Comparable
- ArrayList
- LinkedList
- Polimorfismo
- Interface List

## 📚 Objetivo de Aprendizado

Este projeto demonstra:
- **Ordenação**: Uso de Collections.sort() para primitivos e objetos
- **Comparable**: Implementação de ordenação customizada
- **ArrayList vs LinkedList**: Diferentes implementações de List
- **Polimorfismo**: Uso da interface List para referenciar diferentes implementações
- **Collections**: Classe utilitária para operações em coleções
