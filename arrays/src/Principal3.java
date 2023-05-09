import java.util.Arrays;

public class Principal3 {
    public static void main(String[] args) {
        String[][] todasCidades = new String[3][];
        todasCidades[0] = new String[3];
        todasCidades[0][0] = "Uberlândia";
        todasCidades[0][1] = "Uberaba";
        todasCidades[0][1] = "Belo Horizonte";

        todasCidades[1] = new String[2];
        todasCidades[1][0] = "São Paulo";
        todasCidades[1][1] = "Ribeirão Preto";

        todasCidades[2] = new String[1];
        todasCidades[2][0] = "Fortaleza";

//        for (int i = 0; i < cidades.length; i++) {
//            System.out.println(Arrays.toString(cidades[i]));
//        }

//        for (int i = 0; i < cidades.length; i++) {
//            for (int j = 0; j < cidades[i].length; j++) {
//                System.out.println(cidades[i][j]);
//                System.out.printf("[%d][%d] = %s%n", i, j, cidades[i][j]);
//            }
//        }

        for (String[] cidadesPorEstado : todasCidades) {
            for (String cidade : cidadesPorEstado) {
                System.out.println(cidade);
            }
        }

    }

}
