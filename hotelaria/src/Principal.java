import com.algaworks.agencia.CadastroHotel;
import com.algaworks.agencia.Hotel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Principal {
    public static void main(String[] args) {
        CadastroHotel  cadastro = new CadastroHotel();

        cadastro.adicionar("Jaguaribe Lodge", "Fortim/CE", 1300);
        cadastro.adicionar("Vila Selvagem", "Fortim/CE", 1400);
        cadastro.adicionar("Hotel Fazenda Dona Carolina", "Itatiba/SP", 2200);
        cadastro.adicionar("Tivolti Ecoresort", "Praia do Forte/BA", 2000);
        cadastro.adicionar("Mercure ", "Uberlândia/MG", 400);

//        cadastro.remover(new Hotel("Vila Selvagem", "Fortim/CE", 0));

      // cadastro.adicionar("Vila Selvagem", "Fortim/CE", 1400);

//        cadastro.removerPorCidade("Fortim/CE");

//        cadastro.removerTodos();

//        ArrayList hoteis = cadastro.obterTodos();

        LinkedList hoteis = cadastro.obterTodos();

//        int indice = hoteis.indexOf(new Hotel("Vila Selvagem", "Fortim/CE", 0));
//        int indice = hoteis.lastIndexOf(new Hotel("Vila Selvagem", "Fortim/CE", 0));
//        System.out.println(indice);

//        System.out.println(hoteis.get(indice));

        imprimirHoteis(hoteis);
    }

    private static void imprimirHoteis(LinkedList<Hotel> hoteis) {
        for (Hotel hotel : hoteis) {
            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
        }
//        ListIterator<Hotel> hotelIterator = hoteis.listIterator(hoteis.size());
//
//        while(hotelIterator.hasPrevious()) {
//            Hotel hotel = hotelIterator.previous();
//            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
//        }

//        Iterator<Hotel> hotelIterator = hoteis.iterator();
//        System.out.println(hotelIterator.next());
//        System.out.println(hotelIterator.next());

//        while(hotelIterator.hasNext()) {
//            Hotel hotel = hotelIterator.next();
//            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
//        }

       /* for (int i = 0; i < hoteis.size(); i++) {
            Hotel hotel =  hoteis.get(i);
            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
        }*/
    }
}