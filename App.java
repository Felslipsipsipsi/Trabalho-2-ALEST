package arvorebinariapesquisa;

public class App {
    public static void main(String[] args) {
        ArvoreBinariaPesquisa abp = new ArvoreBinariaPesquisa();
        String[] dados = Arquivo.ler("entrada.txt");
        int chaveBusca = Integer.parseInt(dados[dados.length - 1]);

        for (int i = 0; i < dados.length - 1; i++) {
            abp.adicionar(Integer.parseInt(dados[i]));
        }

        Arquivo.gravar("preordem.txt", abp.caminharPreOrdem());
        Arquivo.gravar("posordem.txt", abp.caminharPosOrdem());
        Arquivo.gravar("central.txt", abp.caminharCentral());
        Arquivo.gravar("largura.txt", abp.caminharLargura());

        String resultadoBusca = abp.pesquisarComCaminho(chaveBusca);
        Arquivo.gravar("resultado.txt", resultadoBusca);
    }
}
