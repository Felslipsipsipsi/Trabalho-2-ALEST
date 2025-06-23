# Trabalho Árvore Binária de Pesquis com Leitura e Escrita de Arquivos

Nesse trabalho, foi criado uma árvore de pesquisa , com uma implementação que funciona a partir de leitura de arquivo `.txt`. Também realiza os caminhamentos requisitados.

## Função do programa

**Leitura de arquivo .txt**

As linhas é um número. Todos os números menos o último, são inseridos na árvore e o número final é a **chave a ser buscada**.

**Faz os caminhamentos:**
   - Pré-ordem → `preordem.txt`
   - Pós-ordem → `posordem.txt`
   - Central → `central.txt`
   - Largura → `largura.txt`

**Faz a busca da última chave**

Gera o `resultado.txt`, informando se encontrou ou não a chave e quantos nodos foram visitados.

---

## Arquivos

### App.java
Constrói a árvore, lê o arquivo e executa, além de salvar resultados.

### ArvoreBinariaPesquisa.java
Classe da árvore binária com adicionar, pré/pós-ordem, central e largura.

### Arquivo.java
Lê os arquivos e grava o `.txt` com no geral coisas ensinadas na aula.
---

##  Exemplo.txt
```txt
30
20
50
10
25
70
25
```

---

## Saídas geradas
- `preordem.txt`
- `posordem.txt`
- `central.txt`
- `largura.txt`
- `resultado.txt`

Exemplo de `resultado.txt`:
```
30 20 25
3 nodos visitados
Achou
```


