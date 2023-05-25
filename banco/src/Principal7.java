import com.algaworks.banco.Conta;
import com.algaworks.banco.ContaEspecial;
import com.algaworks.banco.ContaInvestimento;
import com.algaworks.banco.Titular;

public class Principal7 {

    public static void main(String[] args) {
        Titular titular = new Titular("João da Silva", "12312322300");
        ContaEspecial contaEspecial = new ContaEspecial(titular, 1234, 99999, 90);
        contaEspecial.setLimiteChequeEspecial(1000);
        contaEspecial.depositar(100);

        Conta conta = contaEspecial;

        System.out.println(contaEspecial.getClass().getName());
        System.out.println(conta.getClass().getName());

        System.out.println(contaEspecial == conta);
    }

}
