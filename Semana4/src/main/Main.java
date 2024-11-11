package main;

import modelo.Financiamento;
import util.InterfaceUsuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();
        List<Financiamento> financiamentos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            System.out.println("\n Sistema de Financiamento PUCPR - Aluno: Gustavo Miguel Nicolodi - ADS");
            System.out.println("\nXD--- Menu ---XD");
            System.out.println("1. Adicionar novo financiamento");
            System.out.println("2. Verificar financiamentos cadastrados");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Financiamento novoFinanciamento = interfaceUsuario.criarNovoFinanciamento();
                    financiamentos.add(novoFinanciamento);
                    System.out.println("Financiamento adicionado com sucesso!");
                    break;
                case 2:
                    interfaceUsuario.exibirFinanciamentos(financiamentos);
                    break;
                case 3:
                    sair = true;
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}
