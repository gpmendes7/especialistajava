import com.algaworks.banco.Conta;
import com.algaworks.banco.ContaEspecial;
import com.algaworks.banco.Titular;

public class Principal6 {

    public static void main(String[] args) {
        Titular titular = new Titular("João da Silva", "12312322300");
        Conta conta1 = new Conta(titular, 1234, 99999);
        Conta conta2 = new Conta(titular, 1234, 99999);
        ContaEspecial contaEspecial = new ContaEspecial(titular, 1234, 99999, 90);

        System.out.println(conta1.equals(titular));
        System.out.println(conta1.equals(conta1));
        System.out.println(conta1.equals(conta2));
        System.out.println(conta1.equals(contaEspecial));
    }
}
