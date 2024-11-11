package main;

import modelo.Financiamento;
import util.InterfaceUsuario;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();

        // Obtém a lista de financiamentos
        List<Financiamento> financiamentos = interfaceUsuario.adicionarFinanciamentos();

        // Exibe os detalhes de cada financiamento
        System.out.println("\nDetalhes dos Financiamentos Cadastrados:");
        for (Financiamento financiamento : financiamentos) {
            financiamento.exibirDetalhesFinanciamento();
            System.out.println("------------------------------");
        }
    }
}
