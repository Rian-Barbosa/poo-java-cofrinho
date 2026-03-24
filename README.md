# 💰 Cofrinho em Java (Console)

Aplicação simples desenvolvida em Java que simula um cofrinho no terminal, permitindo armazenar moedas de diferentes tipos e calcular o valor total convertido.

## 📌 Descrição

O sistema funciona como um cofrinho digital onde é possível adicionar moedas de diferentes moedas (Real, Dólar e Euro), remover valores e visualizar o total convertido para uma moeda padrão.

O projeto foi desenvolvido com foco em praticar **Programação Orientada a Objetos (POO)** em Java.

## 🧠 Funcionalidades

- 💵 Adicionar moedas (Real, Dólar, Euro)
    
- ❌ Remover moedas
    
- 📋 Listar moedas armazenadas
    
- 💱 Converter valores para uma moeda padrão
    
- 💰 Calcular total do cofrinho

## 🏗️ Estrutura do Projeto
<img width="193" height="263" alt="image" src="https://github.com/user-attachments/assets/b9d1965d-b328-4d0d-b825-4e9cdd63dd04" />

## 🧩 Arquitetura

- **Principal.java** → Classe principal com o menu e interação com o usuário
    
- **Cofrinho.java** → Gerencia a lista de moedas e operações (adicionar, remover, total)
    
- **Moeda.java** → Classe abstrata/base para diferentes tipos de moeda
    
- **Real.java / Dolar.java / Euro.java** → Implementações específicas de moedas

## 🎯 Objetivo do Projeto

Este projeto tem como objetivo reforçar conceitos como:

- Herança
    
- Polimorfismo
    
- Classes abstratas
    
- Encapsulamento

## 🛠️ Tecnologias Utilizadas

- Java
    
- Programação Orientada a Objetos (POO)
    
- Execução via terminal

## 📦 Como executar

### Pré-requisitos

- Java JDK 8 ou superior

### Passos

#### Clone o repositório
`git clone https://github.com/seu-usuario/cofrinho-java.git`

#### Entre na pasta src
`cd cofrinho-java/src`

#### Compile os arquivos
`javac cofrinho/*.java`

#### Execute o programa
`java cofrinho.Principal`

## ▶️ Uso
Ao executar, o sistema exibirá um menu no console com opções para:

```
1 - Adicionar moeda
2 - Remover moeda
3 - Listar moedas
4 - Calcular total convertido
0 - Sair
```
