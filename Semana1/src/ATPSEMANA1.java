import java.util.Scanner;

public class ATPSEMANA1 {
    public static void main(String[] args) {
        // Criando um Scanner para capturar dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o valor do imóvel: ");
        double valorImovel = scanner.nextDouble();

        System.out.print("Digite a duração do financiamento (em meses): ");
        int duracao = scanner.nextInt();

        // Saída de dados
        System.out.println("Você está simulando o financiamento de um imóvel no valor de: R$ " + valorImovel);
        System.out.println("Com duração de: " + duracao + " meses.");

        // Fechando o scanner
        scanner.close();
    }
}