public class Financiamento {
    // Atributos
    private double valorImovel;
    private int prazoFinanciamento; // em anos
    private double taxaJurosAnual;

    // Construtor
    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
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
}
