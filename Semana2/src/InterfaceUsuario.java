import java.util.Scanner;

public class InterfaceUsuario {
    private Scanner scanner;

    // Construtor
    public InterfaceUsuario() {
        scanner = new Scanner(System.in);
    }

    // Método para pedir o valor do imóvel
    public double pedirValorImovel() {
        System.out.print("Digite o valor do imóvel: ");
        return scanner.nextDouble();
    }

    // Método para pedir o prazo do financiamento em anos
    public int pedirPrazoFinanciamento() {
        System.out.print("Digite o prazo do financiamento (em anos): ");
        return scanner.nextInt();
    }

    // Método para pedir a taxa de juros anual
    public double pedirTaxaJuros() {
        System.out.print("Digite a taxa de juros anual (%): ");
        return scanner.nextDouble();
    }
}