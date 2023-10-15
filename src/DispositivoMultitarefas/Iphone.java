package DispositivoMultitarefas;

import Funcionalidades.AparelhoTelefonico;
import Funcionalidades.NavegadorInternet;
import Funcionalidades.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    
    public static void main(String[] args){
        
        ReprodutorMusical musica = new Iphone();
        System.out.println("------REPRODUTOR MUSICAL------");
        musica.tocar();
        musica.pausar();
        musica.selecionarMusica();

        AparelhoTelefonico tel = new Iphone();
        System.out.println("------APARELHO TELEFONICO------");
        tel.ligar();
        tel.atender();
        tel.iniciarCorreioVoz();

        NavegadorInternet web = new Iphone();
        System.out.println("------NAVEGADOR INTERNET------");
        web.exibirPagina();
        web.adicionarNovaAba();
        web.atualizarPagina();

    }

    public void exibirPagina() {
        System.out.println("Exibindo pagina...");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando pagina...");
    }

    public void ligar() {
        System.out.println("Ligando...");
    }

    public void atender() {
        System.out.println("Recebendo chamada...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    public void tocar() {
        System.out.println("Tocando musica...");
    }
        
    public void pausar() {
        System.out.println("Musica pausada...");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando musica...");
    }

}
