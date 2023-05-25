import com.algaworks.banco.*;

public class Principal8 {
    public static void main(
            String[] args) {
        Titular titular = new Titular("João da Silva", "12312322300");
        Conta conta = new ContaSalario(titular, 1234, 99999, 18000);

    }
}
