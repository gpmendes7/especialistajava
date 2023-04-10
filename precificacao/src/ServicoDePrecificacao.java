public class ServicoDePrecificacao {

     void definirPrecoVenda(Produto produto, double percentualMargemLucro) {
         double precoVendoCalculado = Matematica.calcularAcrescimo(produto.precoCusto, percentualMargemLucro);
         precoVendoCalculado += Produto.custoEmbalagem;

         produto.precoVenda = precoVendoCalculado;
     }

}
