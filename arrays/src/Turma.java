import java.util.ArrayList;

public class Turma {

    String identificacao;
    String nomeProfessora;
    ArrayList<Aluno> alunos = new ArrayList<>();

//        String[] nomesAlunos;
//        int[] idadesAlunos;

    void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
//        this.alunos = Arrays.copyOf(this.alunos, this.alunos.length + 1);
//        alunos[alunos.length - 1] = aluno;
    }

    void removerAluno(int indice) {
//        Aluno[] novosAlunos = new Aluno[alunos.length - 1];
//
//        System.arraycopy(alunos, 0, novosAlunos, 0, indice);
//        System.arraycopy(alunos, indice + 1, novosAlunos, indice, novosAlunos.length - indice);
//
//        alunos = novosAlunos;
        alunos.remove(indice);
    }

    void imprimirListaDeAlunos() {
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                System.out.printf("%s (%d anos)%n", aluno.nome, aluno.idade);
            } else {
                System.out.println("vago");
            }
        }
    }

}
