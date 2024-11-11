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

        // Calcula e exibe o pagamento mensal e o total do pagamento
        double pagamentoMensal = financiamento.calcularPagamentoMensal();
        double totalPagamento = financiamento.calcularTotalPagamento();

        System.out.printf("O pagamento mensal será de: R$ %.2f%n", pagamentoMensal);
        System.out.printf("O total do pagamento será de: R$ %.2f%n", totalPagamento);
    }
}