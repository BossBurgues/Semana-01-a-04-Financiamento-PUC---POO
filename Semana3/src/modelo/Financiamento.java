
package modelo;

public class Financiamento {
    // Atributos privados
    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

    // Construtor
    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    // Métodos públicos para obter os valores dos atributos
    public double getValorImovel() {
        return valorImovel;
    }

    public int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    // Método para calcular o pagamento mensal
    public double calcularPagamentoMensal() {
        double prazoEmMeses = prazoFinanciamento * 12;
        double taxaMensal = taxaJurosAnual / 12 / 100;
        return (valorImovel / prazoEmMeses) * (1 + taxaMensal);
    }

    // Método para calcular o total do pagamento
    public double calcularTotalPagamento() {
        return calcularPagamentoMensal() * prazoFinanciamento * 12;
    }

    // Método público para exibir os detalhes do financiamento
    public void exibirDetalhesFinanciamento() {
        System.out.printf("Valor do Imóvel: R$ %.2f%n", valorImovel);
        System.out.printf("Prazo do Financiamento: %d anos%n", prazoFinanciamento);
        System.out.printf("Taxa de Juros Anual: %.2f%%%n", taxaJurosAnual);
        System.out.printf("Pagamento Mensal: R$ %.2f%n", calcularPagamentoMensal());
        System.out.printf("Total do Pagamento: R$ %.2f%n", calcularTotalPagamento());
    }
}