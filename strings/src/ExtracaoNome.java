public class ExtracaoNome {

    public static void main(String[] args) {
        String nome = "João Silva Souza";

        System.out.println(nome.indexOf(" ")); // 4
        System.out.println(nome.substring(5));

        System.out.println(nome.substring(5,10)); // 4

        System.out.println(obterSobrenome(nome));
        System.out.println(obterSegundonome(nome));
    }

    private static String obterSobrenome(String nome) {
        int posicaoPrimeiroEspaco = nome.indexOf(" ");

        if(posicaoPrimeiroEspaco < 0) {
            throw new RuntimeException("Não é um nome completo");
        }

        return nome.substring(posicaoPrimeiroEspaco + 1);
    }

    private static String obterSegundonome(String nome) {
        int posicaoPrimeiroEspaco = nome.indexOf(" ");
        int posicaoSegundoEspaco = nome.indexOf(" ", posicaoPrimeiroEspaco + 1);

        if(posicaoPrimeiroEspaco < 0) {
            throw new RuntimeException("Não é um nome completo");
        }

        return nome.substring(posicaoPrimeiroEspaco + 1,
                posicaoSegundoEspaco < 0 ? nome.length() : posicaoSegundoEspaco);
    }


}
