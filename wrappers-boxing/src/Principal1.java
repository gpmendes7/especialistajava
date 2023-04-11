public class Principal1 {
    public static void main(String[] args) {
        //        int idade = 20;
//
//        Integer diasEntrega = Integer.valueOf(30);
//        Short diasEntregaShort = Short.valueOf(diasEntrega.shortValue());
//        Long diasEntregaLong = Long.valueOf(diasEntrega.longValue());
//
//        Double valorTotal = Double.valueOf(1500.2);
//        int valorTotalInt = valorTotal.intValue();
//        System.out.println(valorTotalInt);

//        Integer diasEntrega = 30;
//        int diasEntregaInt = diasEntrega;

        Integer numero1 = 128;
        Integer numero2 = 128;
        Short numero3 = 128;

        // Errado
        System.out.println(numero1 == numero2);

        // Certo
        System.out.println(numero1.equals(numero2));

        System.out.println(numero1.intValue() == numero3.intValue());

        // Certo
        System.out.println(numero1.compareTo(numero2) == 0);
    }
}