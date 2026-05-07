# 📦 Controle de Estoque

O **Controle de Estoque** é um sistema interativo desenvolvido para o terminal (console) em Java. Ele atua como um gerenciador de produtos, focado em nivelamento de Programação Orientada a Objetos (POO), garantindo o controle seguro de dados de estoque através de validações e lógica de encapsulamento.

Este projeto foi construído para demonstrar conceitos fundamentais e consolidados em Java puro, ressaltando o uso eficaz de coleções, tratamento de exceções e geração de estatísticas instantâneas a partir da memória.

---

## 🏗️ Arquitetura do Projeto

O sistema adota uma estrutura em linha de comando (CLI) simplificada, focada em Orientação a Objetos:

* **Domínio de Dados (`Produto`)**: Mapeia as propriedades e o estado do produto, possuindo validações embutidas (Business Rules) que protegem a integridade do estoque (evitando quantidades ou preços negativos) e calculam dinamicamente categorias de status de estoque (Alto, Normal, Baixo ou Sem Estoque).
* **Orquestração e Fluxo (`ControleEstoque`)**: Classe executável principal que gerencia o loop de interação com o usuário, coletando inputs via `Scanner`, inserindo em um `ArrayList` e avaliando as estatísticas finais.

---

## 🚀 Tecnologias Utilizadas

### Core
* **Java** (JDK base)
* **Programação Orientada a Objetos** (Encapsulamento, Construtores, Métodos de negócio)
* **Java Collections Framework** (`List`, `ArrayList`)
* **Tratamento de Exceções** (Validações robustas contra inputs de console via `try-catch`)

---

## 🧠 Como o Fluxo do Sistema Funciona?

A aplicação assegura confiabilidade de ponta a ponta na experiência do console:

1. **Inicialização Interativa:** O usuário informa a quantidade inicial de produtos a serem geridos dentro da execução atual do software.
2. **Validação Rigorosa (Fail-safe):** O módulo de entrada é encapsulado em loops condicionais protegidos caso o usuário digite texto no lugar de números, exigindo entrada válida antes de avançar.
3. **Registro e Encapsulamento:** Ao inserir o Produto, suas regras definem seu estado (cálculo de preço total do lote x quantidade em tela).
4. **Relatório Analítico:** Após completar os inputs definidos, o loop é finalizado e o sistema iterage pelos dados em memória para definir estatísticas, como item com mais quantidade armazenada e produto de maior valor agregado total.

---

## ⚙️ Como executar o projeto localmente

### Pré-requisitos
* **Java (JDK) 11** ou superior configurado nas variáveis de ambiente (`PATH`).

### 1. Compilando as Classes
Abra o terminal dentro do diretório do projeto (`controle-estoque-main`):

```bash
javac ControleEstoque.java Produto.java
```

### 2. Rodando o Sistema
Uma vez compilado (com os arquivos `.class` criados na pasta), inicie o aplicativo interagindo pelo painel:

```bash
java ControleEstoque
```
O sistema abrirá no próprio terminal e guiará você com as instruções para inserção dos dados do seu estoque.