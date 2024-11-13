package main;

import modelo.Financiamento;
import util.InterfaceUsuario;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final InterfaceUsuario interfaceUsuario = new InterfaceUsuario();
    private static final List<Financiamento> financiamentos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            exibirMenu();
            int opcao = lerOpcao(scanner);

            switch (opcao) {
                case 1 -> adicionarFinanciamento();
                case 2 -> verificarFinanciamentos();
                case 3 -> {
                    sair = true;
                    System.out.println("Saindo do sistema...");
                }
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n--- Menu ---");
        System.out.println("1. Adicionar novo financiamento");
        System.out.println("2. Verificar financiamentos cadastrados");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static int lerOpcao(Scanner scanner) {
        int opcao = -1;
        try {
            opcao = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Digite um número entre 1 e 3.");
            scanner.next(); // Limpa a entrada inválida
        }
        return opcao;
    }

    private static void adicionarFinanciamento() {
        Financiamento novoFinanciamento = interfaceUsuario.criarNovoFinanciamento();
        financiamentos.add(novoFinanciamento);
        System.out.println("Financiamento adicionado com sucesso!");
    }

    private static void verificarFinanciamentos() {
        interfaceUsuario.exibirFinanciamentos(financiamentos);
    }
}