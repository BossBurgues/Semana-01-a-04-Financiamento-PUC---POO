package util;

import modelo.Financiamento;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InterfaceUsuario {
    private Scanner scanner;

    public InterfaceUsuario() {
        scanner = new Scanner(System.in);
    }

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

    // Novo método para adicionar múltiplos financiamentos
    public List<Financiamento> adicionarFinanciamentos() {
        List<Financiamento> financiamentos = new ArrayList<>();
        String resposta;

        do {
            double valorImovel = pedirValorImovel();
            int prazoFinanciamento = pedirPrazoFinanciamento();
            double taxaJuros = pedirTaxaJuros();

            Financiamento financiamento = new Financiamento(valorImovel, prazoFinanciamento, taxaJuros);
            financiamentos.add(financiamento);

            System.out.print("Deseja adicionar outro financiamento? (s/n): ");
            resposta = scanner.next().toLowerCase();
        } while (resposta.equals("s"));

        return financiamentos;
    }
}
