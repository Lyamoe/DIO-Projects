<<<<<<< HEAD
package exercicios;
import java.util.Scanner;

public class ControleDeFluxo {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
        terminal.close();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		}catch (Exception e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}

    public static class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException(String message) {
            super(message);
        }
    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("parametroUm não pode ser maior que parametroDois");
        }
        int contagem = parametroDois - parametroUm;
        for (int i = 0; i <= contagem; i++) {
            System.out.println(parametroUm + i);
        }
    }
=======
package exercicios;
import java.util.Scanner;

public class ControleDeFluxo {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
        terminal.close();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		}catch (Exception e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}

    public static class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException(String message) {
            super(message);
        }
    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("parametroUm não pode ser maior que parametroDois");
        }
        int contagem = parametroDois - parametroUm;
        for (int i = 0; i <= contagem; i++) {
            System.out.println(parametroUm + i);
        }
    }
>>>>>>> a08ed086f8fe493d68fcdbd466828880bfc9f97e
}