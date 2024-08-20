import aparelhos.Iphone;

public class Iphone7 {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.selecionarMusica("Música selecionada: Amor e Fé, Hungria");
        iphone.tocar();
        iphone.pausar();

        iphone.ligar("Ligando para: 4191234567");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("Exibindo página: https://web.dio.me/home");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
