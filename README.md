# 📦 Sistema de Controle de Estoque

Projeto de **Nivelamento Java - POO (Programação Orientada a Objetos)**.
Este é um sistema de terminal (console) desenvolvido em Java para simular o controle de estoque de produtos, permitindo cadastros dinâmicos e geração de relatórios estatísticos.

## 🚀 Funcionalidades

- **Cadastro Dinâmico:** Defina quantos produtos deseja adicionar no início do programa.
- **Validação de Dados:** O sistema evita que o programa quebre com erros por entradas inválidas (ex: não aceita letras onde deveriam ser números, e valida números negativos).
- **Encapsulamento Seguro:** A classe `Produto` protege seus dados garantindo que preço e quantidade não fiquem abaixo de zero.
- **Cálculos Automáticos:** Exibe o valor total financeiro investido em cada tipo de produto no estoque.
- **Status Inteligente do Estoque:** Retorna se o produto está "Sem estoque", com "Estoque baixo" (<= 5), "Estoque normal" (<= 20) ou "Estoque alto" (> 20).
- **Estatísticas Globais:** Ao final, o sistema avalia toda a lista cadastrada e compara os itens para mostrar qual produto tem a maior quantidade física e qual soma o maior valor monetário.

## 🛠️ Tecnologias e Conceitos Utilizados

- **Java** (Scanner, List, ArrayList)
- **Programação Orientada a Objetos** (Classes, Objetos, Métodos, Construtores, Encapsulamento)
- **Tratamento de Exceções** (`try...catch` para `NumberFormatException`)
- **Laços de Repetição** (`while`, `for`, `for-each`)

## 🏃 Como Executar

1. Certifique-se de ter o **Java (JDK)** instalado em sua máquina.
2. Acesse a pasta do projeto via terminal/CMD.
3. Compile as classes Java:
   ```bash
   javac ControleEstoque.java Produto.java
   ```
4. Execute a aplicação inicializando pela classe Main (`ControleEstoque`):
   ```bash
   java ControleEstoque
   ```
5. Siga as instruções que aparecerão na tela do terminal.
