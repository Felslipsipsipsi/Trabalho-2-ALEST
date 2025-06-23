package arvorebinariapesquisa;

public class ArvoreBinariaPesquisa {
    class Nodo {
        int chave;
        Nodo esquerda, direita, pai;

        public Nodo(int chave) {
            this.chave = chave;
        }
    }

    private Nodo raiz;

    public void adicionar(int chave) {
        Nodo n = new Nodo(chave);
        if (raiz == null) {
            raiz = n;
        } else {
            adicionarRec(n, raiz);
        }
    }

    private void adicionarRec(Nodo n, Nodo atual) {
        if (n.chave <= atual.chave) {
            if (atual.esquerda == null) {
                atual.esquerda = n;
                n.pai = atual;
            } else {
                adicionarRec(n, atual.esquerda);
            }
        } else {
            if (atual.direita == null) {
                atual.direita = n;
                n.pai = atual;
            } else {
                adicionarRec(n, atual.direita);
            }
        }
    }

    public String caminharPreOrdem() {
        return preOrdem(raiz).trim();
    }

    private String preOrdem(Nodo n) {
        if (n == null) return "";
        return n.chave + " " + preOrdem(n.esquerda) + preOrdem(n.direita);
    }

    public String caminharPosOrdem() {
        return posOrdem(raiz).trim();
    }

    private String posOrdem(Nodo n) {
        if (n == null) return "";
        return posOrdem(n.esquerda) + posOrdem(n.direita) + n.chave + " ";
    }

    public String caminharCentral() {
        return central(raiz).trim();
    }

    private String central(Nodo n) {
        if (n == null) return "";
        return central(n.esquerda) + n.chave + " " + central(n.direita);
    }

    public String caminharLargura() {
        Fila f = new Fila();
        String s = "";
        f.enfileirar(raiz);
        while (!f.estaVazia()) {
            Nodo n = f.desenfileirar();
            s += n.chave + " ";
            if (n.esquerda != null) f.enfileirar(n.esquerda);
            if (n.direita != null) f.enfileirar(n.direita);
        }
        return s.trim();
    }

    public String pesquisarComCaminho(int chave) {
        Nodo atual = raiz;
        String caminho = "";
        int visitados = 0;

        while (atual != null) {
            caminho += atual.chave + " ";
            visitados++;
            if (atual.chave == chave) {
                caminho += "
" + visitados + " visitados
Achou";
                return caminho;
            } else if (chave < atual.chave) {
                atual = atual.esquerda;
            } else {
                atual = atual.direita;
            }
        }

        caminho += "
" + visitados + " visitados
Não Achou";
        return caminho;
    }
}
