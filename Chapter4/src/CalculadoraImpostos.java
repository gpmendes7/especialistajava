public class CalculadoraImpostos {
    public static void main(String[] args) {
        char tipoNotaFiscal = 'S';
        double totalFaturado = 1200.30;

        double aliquota;

        if (tipoNotaFiscal == 'S') {
            aliquota = 0.16;
        } else {
            aliquota = 0.35;
        }

        double valorImpostos = totalFaturado * aliquota;

        System.out.printf("Total faturado: R$%.2f%n", totalFaturado);
        System.out.printf("Valor dos impostos: R$%.2f%n", valorImpostos);

    }

}
