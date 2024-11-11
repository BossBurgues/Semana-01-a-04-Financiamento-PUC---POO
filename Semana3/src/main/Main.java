package main;

import modelo.Financiamento;
import util.InterfaceUsuario;

public class Main {
    public static void main(String[] args) {
        // Instancia a InterfaceUsuario para obter os dados do usuário
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();

        // Lê os dados do financiamento
        double valorImovel = interfaceUsuario.pedirValorImovel();
        int prazoFinanciamento = interfaceUsuario.pedirPrazoFinanciamento();
        double taxaJuros = interfaceUsuario.pedirTaxaJuros();

        // Cria o financiamento com os dados fornecidos
        Financiamento financiamento = new Financiamento(valorImovel, prazoFinanciamento, taxaJuros);

        // Exibe os detalhes do financiamento
        financiamento.exibirDetalhesFinanciamento();
    }
}
