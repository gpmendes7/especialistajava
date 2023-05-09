import java.util.Arrays;
import java.util.Objects;

public class ServicoDeCobranca {

//     void pagar(Fatura fatura, String[] emailsCobranca) {
//         System.out.printf("Fatura %d, no valor total de R$%.2f, foi paga!%n",
//                 fatura.numero, fatura.valorTotal);
//
//         for(String email : emailsCobranca) {
//             System.out.printf("Fatura %d enviada para %s%n", fatura.numero, email);
//         }
//     }

    void pagar(Fatura fatura, String emailCobranca, String... emailsAdicionais) {
        Objects.requireNonNull(fatura, "Informa a fatura");
        Objects.requireNonNull(emailCobranca, "Informa  e-mail cobrança");

        System.out.println(Arrays.toString(emailsAdicionais));

        System.out.printf("Fatura %d, no valor total de R$%.2f, foi paga!%n",
                fatura.numero, fatura.valorTotal);

        enviarNotificao(fatura, emailCobranca);

        for(String email : emailsAdicionais) {
            enviarNotificao(fatura, email);
        }
    }

    private void enviarNotificao(Fatura fatura, String email) {
        System.out.printf("Fatura %d enviada para %s%n", fatura.numero, email);
    }
}
