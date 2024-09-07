package celular.funcionalidades;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class AparelhoTelefonico {
    public void ligar(int numero) throws InterruptedException {
        Random random = new Random();
        System.out.println("Ligando para " + numero);
        
        for (int i = 0; i < 30; i++) {
            int resultado = random.nextInt(10);
            if (resultado == 0) {
                System.out.println("Chamada em andamento...");
                TimeUnit.MINUTES.sleep(1);
                break;
            } else {
                if (i < 10) {
                    System.out.println("Chamando 00:0" + i);
                } else {
                    System.out.println("Chamando 00:" + i);
                }
                TimeUnit.SECONDS.sleep(1);
            }
        }
        System.out.println("Chamada encerrada");
    }

    public void atender() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(10000000);
        int numero = numeroAleatorio + 90000000;
        //* define um número de telefone comum
        System.out.println("O número " + numero + " está te ligando");
        System.out.println("Digite 'y' para atender ou 'n' para desligar");
        String resposta = scanner.nextLine();
        while (!resposta.equals("y") && !resposta.equals("n")) {
            System.out.println("Digite 'y' para atender ou 'n' para desligar");
            resposta = scanner.nextLine();
        }

        if (resposta.equals("y")) {
            System.out.println("Chamada em andamento...");
            TimeUnit.MINUTES.sleep(1);
            System.out.println("Chamada encerrada");
        } else {
            System.out.println("Chamada recusada");
        }

        scanner.close();
    }

    public void iniciarCorreioVoz() throws InterruptedException {
        Random random = new Random();
        int resultado = random.nextInt(11);

        if (resultado == 0) {
            System.out.println("Você não tem mensagens.");
        } else {
            System.out.println("Você tem " + resultado + " mensagens.");
            for (int mensagem = 1; mensagem <= resultado; mensagem++) {
                    System.out.println("Ouvindo " + mensagem + "° mensagem...");
                    TimeUnit.SECONDS.sleep(10);
            }
            System.out.println("Todas as mensagens foram ouvidas.");
        }
    }
}
