import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.Month;

public class Principal {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("João",
                LocalDate.of(2005, Month.MARCH, 2),
        new BigDecimal(25000));

        System.out.println(funcionario);

        Path path = Path.of("objetos/joao.ser");

//        try(var outputStream = new ObjectOutputStream(new FileOutputStream(path.toFile()))) {
//            outputStream.writeObject(funcionario);
//        } catch(IOException e) {
//
//        }

        try(var outputStream = new ObjectOutputStream(Files.newOutputStream(path, StandardOpenOption.WRITE, StandardOpenOption.CREATE))) {
            outputStream.writeObject(funcionario);
        } catch(IOException e) {

        }
    }
}