package arvorebinariapesquisa;

public class Fila {
    private class Elemento {
        Nodo valor;
        Elemento proximo;

        public Elemento(Nodo valor) {
            this.valor = valor;
        }
    }

    private Elemento inicio, fim;

    public void enfileirar(Nodo valor) {
        Elemento e = new Elemento(valor);
        if (fim != null) fim.proximo = e;
        fim = e;
        if (inicio == null) inicio = e;
    }

    public Nodo desenfileirar() {
        if (inicio == null) return null;
        Nodo v = inicio.valor;
        inicio = inicio.proximo;
        if (inicio == null) fim = null;
        return v;
    }

    public boolean estaVazia() {
        return inicio == null;
    }
}
