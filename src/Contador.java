import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Recebendo os dois números inteiros via terminal
            System.out.print("Digite o primeiro número inteiro: ");
            int num1 = scanner.nextInt();

            System.out.print("Digite o segundo número inteiro: ");
            int num2 = scanner.nextInt();

            // Verificando se o primeiro número é maior que o segundo
            if (num1 >= num2) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
            }

            // Calculando a quantidade de iterações para imprimir os números
            int iteracoes = num2 - num1;

            // Realizando a impressão dos números incrementados
            for (int i = 1; i <= iteracoes; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        } catch (ParametrosInvalidosException e) {
            // Capturando a exceção de parâmetros inválidos e exibindo a mensagem de erro
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // Capturando outras exceções que possam ocorrer
            System.out.println("Ocorreu um erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
