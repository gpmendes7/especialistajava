import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());

        Date data = new Date(System.currentTimeMillis());
        System.out.println(data);

        System.out.println(data.getMonth());
        System.out.println(data.getYear());
    }
}