# 🌳 Projeto: Árvore Binária de Pesquisa com Leitura e Escrita de Arquivos

Este projeto implementa uma Árvore Binária de Pesquisa (ABP) a partir da leitura de um arquivo `.txt`. A aplicação realiza todos os caminhamentos da árvore, busca uma chave específica e gera arquivos com os resultados.

## 📁 Estrutura de Arquivos

```
📂 arvorebinariapesquisa
 ├── App.java
 ├── ArvoreBinariaPesquisa.java
 ├── Arquivo.java
 └── frutas.txt (arquivo de entrada)
```

---

## 🚀 O que o programa faz

1. **Lê um arquivo .txt**
   - Cada linha é um número.
   - Todos os números, menos o último, são inseridos na árvore.
   - O último número é a **chave a ser buscada**.

2. **Constrói a árvore na ordem lida**

3. **Faz os caminhamentos:**
   - Pré-ordem → `preordem.txt`
   - Pós-ordem → `posordem.txt`
   - Central → `central.txt`
   - Largura → `largura.txt`

4. **Faz a busca da última chave**
   - Gera `resultado.txt` com o caminho de busca
   - Informa se encontrou ou não a chave
   - Mostra quantos nodos foram visitados

---

## 📄 Arquivos explicados

### ✅ App.java
Classe principal que:
- Lê o arquivo usando `Arquivo.ler`
- Constrói a árvore com `adicionar()`
- Executa todos os caminhamentos
- Chama o método de busca com rastreamento
- Salva todos os resultados usando `Arquivo.gravar`

### ✅ ArvoreBinariaPesquisa.java
Classe da árvore binária com:
- `adicionar(int chave)`
- `caminharPreOrdem()`
- `caminharPosOrdem()`
- `caminharCentral()`
- `caminharLargura()`
- `buscarComRastro(int chave)`

### ✅ Arquivo.java
Classe que:
- Lê arquivos `.txt` usando `Scanner`
- Grava arquivos `.txt` com `PrintStream`
- Usa só ferramentas simples que vimos na aula

---

## 🧾 Exemplo de frutas.txt
```txt
30
20
50
10
25
70
25
```

- Os primeiros valores são inseridos na árvore.
- O último (`25`) é o número a ser procurado.

---

## 📤 Saídas geradas
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

---

## 💡 Observações

- O código não usa nada avançado como `BufferedReader` ou `try/catch`.
- Tudo foi feito com base nas aulas e exemplos vistos.
- Comentários e estrutura facilitam a leitura e entendimento.
- O código está pronto para ser testado, adaptado e evoluído.

---

## 👨‍🏫 Entrega
Suba o projeto no GitHub e envie **apenas o link do repositório no Moodle**, garantindo que o professor tem acesso.

