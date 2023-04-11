import java.util.Objects;

public class CarrinhoDeCompra {

    static final double TAXA_SERVICO_PADRAO = 0.10;
    int quantidadeItens;

    Produto produto;

    void realizarCompra(String numeroCartao) {
        double valorTotal = calcularValorTotal();

        boolean pagamentoAutorizado = GatewayPagamento.autorizarPagamento(numeroCartao, valorTotal);

        if (pagamentoAutorizado) {
            imprimirRecibo(valorTotal);
        }
    }

    static void imprimirRecibo(double valorTotal) {
        System.out.println("RECIBO DE PAGAMENTO");
        System.out.printf("Valor total: R$%.2f%n", valorTotal);
    }

    double calcularValorTotal() {
        double subTotal = calcularSubTotal();
        double taxaServico = calcularTaxaServico(subTotal);
        double valorTotal = subTotal + taxaServico;

        return valorTotal;
    }

    static double calcularTaxaServico(double subTotal) {
        return subTotal * TAXA_SERVICO_PADRAO;
    }

    double calcularSubTotal() {
        return produto.precoUnitario * quantidadeItens;
    }

    void adicionarItem(String nomeProduto, double precoUnitario, int quantidade) {
    }

    void adicionarItem(Produto produto, int quantidade) {
        Objects.requireNonNull(produto, "Produto deve ser informado");

        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser maior que 0");
        }

        System.out.printf("Produto: %s%n", produto.nome);
    }

    void gerarPedido(Endereco enderecoEntrega) {
        Objects.requireNonNull(enderecoEntrega, "Enderreço de entrega deve ser informado")

        criarNovoPedido(enderecoEntrega);
    }

    void gerarPedido() {
        criarNovoPedido(null);
    }

    private void criarNovoPedido(Endereco enderecoEntrega) {

    }
}
