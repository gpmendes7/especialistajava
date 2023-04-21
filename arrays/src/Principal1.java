import java.util.ArrayList;
import java.util.Arrays;

public class Principal1 {
    public static void main(String[] args) {
//        int[] notas = new int[5];

//        int[] notas;
//        notas = new int[]{8, 5, 4, 9, 10};

//        int[] notas = new int[]{8, 5, 4, 9, 10};

//        int[] notas = {8, 5, 4, 9, 10};

//        notas[0] = 10;
//        notas[1] = 9;
//
//        System.out.println(notas[0]);
//        System.out.println(notas[1]);
//        System.out.println(notas[3]);
//
//        int totalNotas = notas[0] + notas[1] + notas[3] + notas[3]+ notas[4];
//        System.out.println(totalNotas);
//
//        int posicao = 2;
//
//        System.out.println(notas[posicao]);

//        double media = Calculadora.calcularMedia(notas);
//
//        System.out.println(media);

//        String notasEmString = Arrays.toString(notas);
//
//        System.out.println(notasEmString);

//        Integer[] notas = {8, 5, 4, 9, 10};
//
//        Arrays.sort(notas);
//        Arrays.sort(notas, Comparator.reverseOrder());
//
//        System.out.println(Arrays.toString(notas));

//        Turma turmaB = new Turma();
//        turmaB.identificacao = "Material B";
//        turmaB.nomeProfessora = "Tia Professora";
//        turmaB.alunos = new Aluno[3];
//
//        turmaB.alunos[0] = new Aluno();
//        turmaB.alunos[0].nome = "João";
//        turmaB.alunos[0].idade = 3;
//
//        Aluno aluno1 = new Aluno();
//        aluno1.nome = "Laura";
//        aluno1.idade = 4;
//
//        turmaB.alunos[1] = aluno1;
//
//        turmaB.imprimirListaDeAlunos();

//        for (int i = 0; i < turmaB.alunos.length; i++) {
//            Aluno aluno = turmaB.alunos[i];
//
//            if (aluno != null) {
//                System.out.printf("%d - %s (%d anos)%n", i, aluno.nome, aluno.idade);
//            } else {
//                System.out.printf("%d - vago%n", i);
//            }
//        }

//        int[] numerosJogo1 = {25, 11, 8, 46, 37, 14};
//        int[] numerosJogo2 = Arrays.copyOf(numerosJogo1, numerosJogo1.length + 1);
//        numerosJogo2[numerosJogo2.length - 1] = 44;
//
//        System.out.println(Arrays.toString(numerosJogo1));
//        System.out.println(Arrays.toString(numerosJogo2));

//        int[] numerosJogoAtual = {25, 11, 8, 46, 37, 14, 55};
//        int[] numerosNovoJogo = new int[numerosJogoAtual.length - 1];

//        [25, 11, 8, 46, 37, 14, 55]
//        [0, 0, 0, 0, 0, 0]

//        int indiceExclusao = 2;
//
//        System.arraycopy(numerosJogoAtual, 0, numerosNovoJogo, 0, indiceExclusao);
//
//        System.arraycopy(numerosJogoAtual, indiceExclusao + 1, numerosNovoJogo, indiceExclusao, numerosNovoJogo.length - indiceExclusao);
//
//        System.out.println(Arrays.toString(numerosJogoAtual));
//        System.out.println(Arrays.toString(numerosNovoJogo));

        ArrayList<String> alunos = new ArrayList<>();
        alunos.add("João");
        alunos.add("Maria");

//        for (int i = 0; i < alunos.size(); i++) {
//            String aluno = alunos.get(i);
//            System.out.println(aluno);
//        }

        for (String aluno : alunos) {
            System.out.println(aluno);
        }
    }
}