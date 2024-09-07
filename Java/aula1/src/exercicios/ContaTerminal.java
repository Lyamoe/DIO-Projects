package exercicios;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numero = scanner.nextInt();
        System.out.print("Digite o número da agencia que está: ");
        String agencia = scanner.nextLine();
        System.out.print("Digite o seu nome: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Digite o valor do 1° depósito: ");
        double saldo = scanner.nextInt();

        System.out.println("Olá " + nomeCliente +
        ", obrigado por criar uma conta em nosso banco! Sua agÊncia é " + agencia +
        ", conta " + numero + " e seu saldo " + saldo + " já está disponível.");

        scanner.close();
    }
}
