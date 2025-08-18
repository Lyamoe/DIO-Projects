<<<<<<< HEAD
package celular;
import java.util.Scanner;

import celular.funcionalidades.AparelhoTelefonico;
import celular.funcionalidades.Navegador;
import celular.funcionalidades.ReprodutorMusical;

public class Iphone {
    //? Música
    ReprodutorMusical reprodutorMusical = new ReprodutorMusical();

    //? Telefone
    AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();

    public void ligar() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número para ligar");
        int numero = scanner.nextInt();
        scanner.close();
        aparelhoTelefonico.ligar(numero);
    }

    public void atender() throws InterruptedException {
        aparelhoTelefonico.atender();
    }

    public void iniciarCorreioVoz() throws InterruptedException {
        aparelhoTelefonico.iniciarCorreioVoz();
    }

    //? Internet
    Navegador navegador = new Navegador();
}
=======
package celular;
import java.util.Scanner;

import celular.funcionalidades.AparelhoTelefonico;
import celular.funcionalidades.Navegador;
import celular.funcionalidades.ReprodutorMusical;

public class Iphone {
    //? Música
    ReprodutorMusical reprodutorMusical = new ReprodutorMusical();

    //? Telefone
    AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();

    public void ligar() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número para ligar");
        int numero = scanner.nextInt();
        scanner.close();
        aparelhoTelefonico.ligar(numero);
    }

    public void atender() throws InterruptedException {
        aparelhoTelefonico.atender();
    }

    public void iniciarCorreioVoz() throws InterruptedException {
        aparelhoTelefonico.iniciarCorreioVoz();
    }

    //? Internet
    Navegador navegador = new Navegador();
}
>>>>>>> a08ed086f8fe493d68fcdbd466828880bfc9f97e
