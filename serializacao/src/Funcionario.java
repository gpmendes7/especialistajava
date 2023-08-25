import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario implements Serializable {

    @Serial
    private static final long serialVersionUID = 1;

    private String nome;
    private LocalDate dataNascimento;

    private BigDecimal salario;

//    private transient BigDecimal salario;

    public String getNome() {
        return nome;
    }

    public Funcionario(String nome, LocalDate dataNascimento, BigDecimal salario) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", salario=" + salario +
                '}';
    }
}
