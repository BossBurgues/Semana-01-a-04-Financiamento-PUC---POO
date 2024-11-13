package modelo;

public class Financiamento {
    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public double calcularPagamentoMensal() {
        double taxaMensal = taxaJurosAnual / 12 / 100;
        int prazoMeses = prazoFinanciamento * 12;
        return (valorImovel / prazoMeses) * (1 + taxaMensal);
    }

    public double calcularTotalPagamento() {
        return calcularPagamentoMensal() * prazoFinanciamento * 12;
    }

    public void exibirDetalhesFinanciamento() {
        System.out.printf("Valor do Imóvel: R$ %.2f%n", valorImovel);
        System.out.printf("Prazo do Financiamento: %d anos%n", prazoFinanciamento);
        System.out.printf("Taxa de Juros Anual: %.2f%%%n", taxaJurosAnual);
        System.out.printf("Pagamento Mensal: R$ %.2f%n", calcularPagamentoMensal());
        System.out.printf("Total do Pagamento: R$ %.2f%n", calcularTotalPagamento());
    }

    // Getters para os atributos, caso seja necessário acesso futuro
    public double getValorImovel() {
        return valorImovel;
    }

    public int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }
}