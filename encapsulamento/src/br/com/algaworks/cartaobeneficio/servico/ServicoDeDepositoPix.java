package br.com.algaworks.cartaobeneficio.servico;

import br.com.algaworks.cartaobeneficio.Cartao;
import br.com.algaworks.cartaobeneficio.Recibo;

public class ServicoDeDepositoPix {

    public Recibo efetuarDeposito(Cartao cartao, double valorDeposito) {
        cartao.depositar(valorDeposito);

        return new Recibo(cartao.getTitular(), "Depósito", valorDeposito);
    }

}
