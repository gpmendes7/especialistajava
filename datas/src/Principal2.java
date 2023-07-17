import java.util.Date;

public class Principal2 {
    public static void main(String[] args) {
        Date hoje = new Date();
        Date ontem = new Date(System.currentTimeMillis() - (24 * 60 * 60 * 1000));

        long diferencaMillis = hoje.getTime() - ontem.getTime();
        System.out.println(diferencaMillis);

        double diferencaHoras = diferencaMillis / 1000 / 60 / 60 / 24;

        System.out.printf("Diferença em horas: %.2f%n", diferencaHoras);

        System.out.printf("Depois: %b%n", hoje.after(ontem));
        System.out.printf("Antes: %b%n", hoje.before(ontem));

    }
}