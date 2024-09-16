package desafio_controle_fluxo;

import java.util.Scanner;

public class DesafioControleFluxo {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();  // Lê o primeiro número inteiro
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();  // Lê o segundo número inteiro

        try {
            // Chamando o método contendo a lógica de contagem
            Contador.contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // Imprime a mensagem da exceção
            System.out.println(exception.getMessage());
        }
    }

    // Classe interna para exceção personalizada
    public static class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException(String mensagem) {
            super(mensagem);
        }
    }

    // Classe interna para lógica de contagem
    public static class Contador {
        public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
            // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
            if (parametroUm >= parametroDois) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }

            int contagem = parametroDois - parametroUm;
            // Realizar o for para imprimir os números com base na variável contagem
            for (int i = 1; i <= contagem; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        }
    }
}
