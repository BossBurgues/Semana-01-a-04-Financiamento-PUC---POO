package util;

import modelo.Financiamento;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class InterfaceUsuario {
    private Scanner scanner;

    public InterfaceUsuario() {
        scanner = new Scanner(System.in);
    }

    private double pedirEntradaPositiva(String mensagem) {
        double valor = -1;
        while (true) {
            System.out.print(mensagem);
            try {
                String entrada = scanner.next().replace(",", "."); // Substitui vírgulas por pontos
                valor = Double.parseDouble(entrada);

                if (valor > 0) {
                    break;
                } else {
                    System.out.println("Erro: O valor deve ser positivo. Tente novamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: Entrada inválida. Digite um número positivo com vírgula ou ponto para casas decimais.");
            }
        }
        return valor;
    }

    public double pedirValorImovel() {
        return pedirEntradaPositiva("Digite o valor do imóvel (positivo): ");
    }

    public int pedirPrazoFinanciamento() {
        int prazo = -1;
        while (prazo <= 0) {
            try {
                System.out.print("Digite o prazo do financiamento em anos (positivo): ");
                prazo = scanner.nextInt();
                if (prazo <= 0) {
                    System.out.println("Erro: O prazo deve ser um número positivo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Digite um número inteiro positivo.");
                scanner.next(); // Limpa o scanner em caso de erro
            }
        }
        return prazo;
    }

    public double pedirTaxaJuros() {
        return pedirEntradaPositiva("Digite a taxa de juros anual (positiva): ");
    }

    public Financiamento criarNovoFinanciamento() {
        double valorImovel = pedirValorImovel();
        int prazoFinanciamento = pedirPrazoFinanciamento();
        double taxaJuros = pedirTaxaJuros();

        return new Financiamento(valorImovel, prazoFinanciamento, taxaJuros);
    }

    public void exibirFinanciamentos(List<Financiamento> financiamentos) {
        if (financiamentos.isEmpty()) {
            System.out.println("Nenhum financiamento cadastrado.");
        } else {
            System.out.println("\nDetalhes dos Financiamentos Cadastrados:");
            for (Financiamento financiamento : financiamentos) {
                financiamento.exibirDetalhesFinanciamento();
                System.out.println("------------------------------");
            }
        }
    }
}