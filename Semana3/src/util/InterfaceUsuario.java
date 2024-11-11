package util;

import java.util.Scanner;

public class InterfaceUsuario {
    private Scanner scanner;

    // Construtor
    public InterfaceUsuario() {
        scanner = new Scanner(System.in);
    }

    // Método para pedir o valor do imóvel com validação
    public double pedirValorImovel() {
        double valor;
        do {
            System.out.print("Digite o valor do imóvel (positivo): ");
            valor = scanner.nextDouble();
            if (valor <= 0) {
                System.out.println("Erro: O valor do imóvel deve ser positivo.");
            }
        } while (valor <= 0);
        return valor;
    }

    // Método para pedir o prazo do financiamento em anos com validação
    public int pedirPrazoFinanciamento() {
        int prazo;
        do {
            System.out.print("Digite o prazo do financiamento (em anos, positivo): ");
            prazo = scanner.nextInt();
            if (prazo <= 0) {
                System.out.println("Erro: O prazo do financiamento deve ser positivo.");
            }
        } while (prazo <= 0);
        return prazo;
    }

    // Método para pedir a taxa de juros anual com validação
    public double pedirTaxaJuros() {
        double taxa;
        do {
            System.out.print("Digite a taxa de juros anual (positiva): ");
            taxa = scanner.nextDouble();
            if (taxa <= 0) {
                System.out.println("Erro: A taxa de juros deve ser positiva.");
            }
        } while (taxa <= 0);
        return taxa;
    }
}