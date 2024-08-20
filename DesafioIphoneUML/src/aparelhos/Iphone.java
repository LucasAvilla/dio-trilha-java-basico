package aparelhos;

import funcoes.AparelhoMusical;
import funcoes.NavegadorInternet;
import funcoes.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoMusical, NavegadorInternet {

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: https://web.dio.me/home");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("+ Nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar pagina");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: 4191234567");
    }

    @Override
    public void atender() {
        System.out.println("Atender telefone.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Deixe seu recado após o sinal.");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica selecionada");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar musica");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: Amor e Fé, Hungria");
    }
}
