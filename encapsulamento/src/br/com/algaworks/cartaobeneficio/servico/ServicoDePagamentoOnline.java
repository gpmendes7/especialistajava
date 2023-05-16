package br.com.algaworks.cartaobeneficio.servico;

import br.com.algaworks.cartaobeneficio.Cartao;
import br.com.algaworks.cartaobeneficio.Estabelecimento;
import br.com.algaworks.cartaobeneficio.Recibo;

public class ServicoDePagamentoOnline {

    public Recibo efetuarPagamento(Estabelecimento estabelecimento,
                                   Cartao cartao, double valor) {
        cartao.debitar(valor);

        return new Recibo(cartao.getTitular(), "Pagamento", valor);
    }

}
