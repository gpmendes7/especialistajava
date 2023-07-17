package com.algaworks.pagamento;

import javax.print.Doc;

public interface MetodoPagamento {

    void pagar(DocumentoPagavel documento);

}
