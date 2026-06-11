# ScreenMatch - Listas e Coleções

Projeto de gerenciamento de catálogo de filmes e séries, demonstrando o uso de listas e coleções em Java.

## 📋 Descrição

Este projeto é uma aplicação de gerenciamento de catálogo audiovisual (ScreenMatch) que implementa conceitos avançados de listas e coleções em Java, incluindo ArrayList, LinkedList, ordenação e polimorfismo.

## 🏗️ Estrutura do Projeto

```
src/
└── br/
    └── com/
        └── alura/
            └── screenmatch/
                ├── calculos/
                │   ├── CalculadoraDeTempo.java
                │   ├── Classificavel.java
                │   └── FiltroRecomendacao.java
                ├── modelos/
                │   ├── Episodio.java
                │   ├── Filme.java
                │   ├── Serie.java
                │   └── Titulo.java
                └── principal/
                    ├── Principal.java
                    └── PrincipalComListas.java
```

## 🎯 Funcionalidades

### Classes Principais

- **Titulo**: Classe base para títulos audiovisuais com avaliação e metadados
- **Filme**: Extende Titulo, representa filmes com diretor e classificação
- **Serie**: Extende Titulo, representa séries com temporadas e episódios
- **Episodio**: Representa episódios individuais de séries

### Utilitários

- **CalculadoraDeTempo**: Calcula tempo total de maratona
- **FiltroRecomendacao**: Filtra conteúdo baseado em classificação
- **Classificavel**: Interface para classificação de conteúdo

## 🚀 Conceitos Demonstrados

- **ArrayList**: Armazenamento dinâmico de filmes e séries
- **LinkedList**: Lista encadeada para títulos
- **Ordenação**: Uso de Collections.sort() e Comparator
- **Polimorfismo**: Uso de interfaces e herança
- **Comparable**: Implementação de ordenação customizada
- **instanceof**: Verificação de tipos em tempo de execução
- **Streams API**: Processamento de coleções

## 📝 Exemplos de Uso

### Principal.java
```java
// Criação e gerenciamento de filmes
Filme meuFilme = new Filme("O poderoso chefão", 1970);
meuFilme.setDuracaoEmMinutos(180);
meuFilme.avalia(8);

// Uso de ArrayList
ArrayList<Filme> listaDeFilmes = new ArrayList<>();
listaDeFilmes.add(meuFilme);
```

### PrincipalComListas.java
```java
// Polimorfismo com List<Titulo>
List<Titulo> lista = new LinkedList<>();
lista.add(filmeDoPaulo);
lista.add(lost);

// Ordenação customizada
Collections.sort(lista);
lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
```

## 🔧 Tecnologias

- Java
- Collections Framework (ArrayList, LinkedList)
- Interfaces (Comparable, Classificavel)
- Herança e Polimorfismo

## 📚 Conceitos Aprendidos

Este projeto faz parte do curso "Java: Trabalhando com Listas e Coleções de Dados" da Alura, abordando:
- Estruturas de dados em Java
- Collections Framework
- Ordenação e comparação de objetos
- Boas práticas de programação orientada a objetos
