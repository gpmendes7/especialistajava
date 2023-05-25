import com.algaworks.banco.ContaEspecial;
import com.algaworks.banco.Titular;

public class Principal4 {

    public static void main(String[] args) {
        Titular titular = new Titular("João da Silva", "12312322300");
//        Conta conta1 = new Conta( titular,1234, 999999)
//        ContaInvestimento conta1 = new ContaInvestimento( titular,1234, 999999);
        ContaEspecial conta1 = new ContaEspecial(titular, 1234, 999999, 90);

        System.out.println(conta1);
    }

}
