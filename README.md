# Simulação em UML de um Iphone

### [Diagrama em UML](https://github.com/GuillermoIacovonePereira/Simulacao-em-UML-de-um-Iphone/blob/main/Diagrama%20em%20UML.png)


## Código Utilizado como Exemplo:
### Classe Iphone
~~~
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
~~~

### Interface ReprodutorMusical

~~~
package Funcionalidades;

public interface ReprodutorMusical {
    public void tocar();
    public void pausar();
    public void selecionarMusica();
}
~~~

### Interface AparelhoTelefonico

~~~
package Funcionalidades;

public interface AparelhoTelefonico {
    public void ligar();
    public void atender();
    public void iniciarCorreioVoz();
}
~~~

### Interface NavegadorInternet

~~~
package Funcionalidades;

public interface NavegadorInternet {
    public void exibirPagina();
    public void adicionarNovaAba();
    public void atualizarPagina();
}
~~~