public class Principal {

    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.anoFabricacao = 2021;
        meuCarro.cor = "Preto";
        meuCarro.fabricante = "Honda";
        meuCarro.modelo = "HR-V";

        System.out.println("Meu carro");
        System.out.println("--------");
        System.out.printf("Modelo: %S%n", meuCarro.modelo);
        System.out.printf("Ano: %d%n", meuCarro.anoFabricacao);

        System.out.println();

        Carro seuCarro = new Carro();
        seuCarro.anoFabricacao = 2022;
        seuCarro.cor = "Branco";
        seuCarro.fabricante = "BMW";
        seuCarro.modelo = "X6";

        System.out.println("Seu carro");
        System.out.println("--------");
        System.out.printf("Modelo: %S%n", seuCarro.modelo);
        System.out.printf("Ano: %d%n", seuCarro.anoFabricacao);
    }

}
