# Projeto - Árvore Binária de Pesquisa (ABP)

Este projeto implementa uma Árvore Binária de Pesquisa (ABP) em Java para leitura, inserção, caminhamento e busca de chaves a partir de um arquivo `.txt`.

## Objetivo

- Ler um arquivo `entrada.txt` contendo:
  - Um conjunto de números inteiros (um por linha) que serão inseridos na árvore.
  - A última linha é o número que será pesquisado na árvore.

- Gerar os seguintes arquivos:
  - `preordem.txt`: resultado do caminhamento em pré-ordem.
  - `posordem.txt`: resultado do caminhamento em pós-ordem.
  - `central.txt`: resultado do caminhamento central (em ordem).
  - `largura.txt`: resultado do caminhamento em largura.
  - `resultado.txt`: nodos visitados na pesquisa da chave final e o resultado da busca.

## Como executar

1. Coloque os valores no arquivo `entrada.txt`, sendo a última linha a chave a ser pesquisada.

2. Compile o projeto:

```bash
javac -d bin src/aula28_arvorebinariapesquisa/*.java
```

3. Execute o programa:

```bash
java -cp bin aula28_arvorebinariapesquisa.App
```

## Exemplo do `entrada.txt`

```
30
20
50
10
25
70
100
```

> Nesse exemplo, os valores são inseridos na árvore, e a chave `100` será pesquisada.

## Autor

Trabalho realizado como atividade prática da disciplina de Estrutura de Dados.