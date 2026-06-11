# Java: Trabalhando com Listas e Coleções de Dados

Repositório contendo projetos práticos do curso da Alura sobre listas e coleções em Java.

## 📚 Sobre o Curso

Este repositório contém 6 projetos desenvolvidos durante o curso "Java: Trabalhando com Listas e Coleções de Dados" da Alura, que aborda conceitos fundamentais e avançados de coleções em Java.

## 🎯 Objetivos de Aprendizado

- Compreender o funcionamento de ArrayList e LinkedList
- Implementar ordenação com Comparable e Comparator
- Aplicar herança e polimorfismo em coleções
- Utilizar Streams API para processamento de dados
- Desenvolver sistemas interativos com Scanner
- Dominar o Collections Framework

## 📁 Estrutura dos Projetos

### 1. [2914-java-screenmatch-listas-colecoes](./2914-java-screenmatch-listas-colecoes/)
Aplicação completa de gerenciamento de catálogo audiovisual (ScreenMatch).

**Conceitos**: ArrayList, LinkedList, Comparable, Polimorfismo, Herança, Streams API

**Principais Classes**: Titulo, Filme, Serie, Episodio, CalculadoraDeTempo, FiltroRecomendacao

### 2. [modelo1DesafioHoraPratica](./modelo1DesafioHoraPratica/)
Introdução básica ao uso de ArrayList com classe Pessoa.

**Conceitos**: ArrayList, For-each, Encapsulamento, toString()

**Principais Classes**: Pessoa, Main

### 3. [modelo2DesafioHoraPratica](./modelo2DesafioHoraPratica/)
Sistema de produtos demonstrando herança com Produto e ProdutoPerecivel.

**Conceitos**: Herança, Polimorfismo, Sobrescrita de métodos, ArrayList

**Principais Classes**: Produto, ProdutoPerecivel, Main

### 4. [modelo3DesafioHoraPratica](./modelo3DesafioHoraPratica/)
Desafio abrangente com múltiplos pacotes demonstrando diversos conceitos de POO.

**Conceitos**: Herança, Interfaces, Streams API, Arrays, instanceof, Polimorfismo

**Principais Classes**: Animal, Cachorro, ContaBancaria, Forma, Circulo, Quadrado, Produto

### 5. [modulo4DesafioHoraPratica](./modulo4DesafioHoraPratica/)
Foco em ordenação de coleções e diferentes implementações de List.

**Conceitos**: Comparable, Collections.sort(), ArrayList vs LinkedList, Polimorfismo

**Principais Classes**: Titulo, Main

### 6. [oDesafio](./oDesafio/)
Sistema interativo de compras com validação de limite de cartão de crédito.

**Conceitos**: Interatividade com Scanner, Validação, Gerenciamento de Estado, Ordenação

**Principais Classes**: Compra, Main

## 🛠️ Tecnologias Utilizadas

- Java
- Collections Framework (ArrayList, LinkedList, List)
- Interfaces (Comparable, Classificavel)
- Streams API
- Scanner para entrada de dados
- POO (Herança, Polimorfismo, Encapsulamento)

## 🚀 Como Executar

Cada projeto pode ser executado individualmente:

1. Navegue até a pasta do projeto desejado
2. Compile os arquivos Java:
   ```bash
   javac src/**/*.java
   ```
3. Execute a classe Main:
   ```bash
   java src/Main.java
   ```

## 📖 Sequência Recomendada de Estudo

1. **modelo1DesafioHoraPratica** - Fundamentos de ArrayList
2. **modelo2DesafioHoraPratica** - Herança e polimorfismo
3. **modelo3DesafioHoraPratica** - Múltiplos conceitos integrados
4. **modulo4DesafioHoraPratica** - Ordenação e Comparable
5. **oDesafio** - Sistema interativo completo
6. **2914-java-screenmatch-listas-colecoes** - Aplicação completa integrando todos os conceitos

## 🎓 Conceitos Principais Abordados

### Collections Framework
- **ArrayList**: Lista dinâmica baseada em array
- **LinkedList**: Lista encadeada para operações frequentes de inserção/remoção
- **List**: Interface para listas ordenadas

### Ordenação
- **Comparable**: Interface para ordenação natural
- **Comparator**: Interface para ordenação customizada
- **Collections.sort()**: Método utilitário para ordenação

### POO Avançado
- **Herança**: Extensão de classes com `extends`
- **Polimorfismo**: Tratamento uniforme de diferentes tipos
- **Interfaces**: Contratos de comportamento com `implements`
- **Encapsulamento**: Proteção de dados com modificadores de acesso

### Streams API
- **filter()**: Filtragem de elementos
- **count()**: Contagem de elementos
- **map()**: Transformação de elementos

## 📝 Notas

- Todos os projetos foram desenvolvidos como parte do curso da Alura
- Cada projeto possui seu próprio README com detalhes específicos
- Os projetos demonstram evolução progressiva dos conceitos
- Recomenda-se estudar na sequência indicada para melhor aprendizado

## 🔗 Recursos Adicionais

- [Documentação Java Collections](https://docs.oracle.com/javase/8/docs/technotes/guides/collections/)
- [Curso Alura - Java: Trabalhando com Listas e Coleções de Dados](https://www.alura.com.br/curso-java-listas-colecoes)
