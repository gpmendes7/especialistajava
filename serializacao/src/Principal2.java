import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Principal2 {

    public static void main(String[] args) {
        Path path = Path.of("objetos/joao.ser");

        try(var inputStream = new ObjectInputStream(Files.newInputStream(path, StandardOpenOption.READ))) {
            Funcionario funcionario = (Funcionario) inputStream.readObject();
            System.out.println(funcionario);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch(ClassNotFoundException e) {
            throw new RuntimeException(e);
         }
    }
}
