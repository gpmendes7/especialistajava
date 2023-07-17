package com.algaworks.agencia;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class CadastroHotel {

//    private final ArrayList<Hotel> hoteis = new ArrayList<>();

    private final LinkedList<Hotel> hoteis = new LinkedList<>();

    public void adicionar(String nome, String cidade, double precoDiaria) {
        Hotel hotel = new Hotel(nome, cidade, precoDiaria);

        if(hoteis.contains(hotel)) {
            throw new HotelJaExistenteException("Hotel já foi adicionado");
        }

        hoteis.add(hotel);
    }

    public LinkedList<Hotel> obterTodos() {
        return hoteis;
    }

    public void removerPorCidade(String cidade) {

        Iterator<Hotel> hotelIterator = hoteis.iterator();
//        System.out.println(hotelIterator.next());
//        System.out.println(hotelIterator.next());

        while(hotelIterator.hasNext()) {
            Hotel hotel = hotelIterator.next();
            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
        }

        ArrayList<Hotel> hoteisParaRemocao = new ArrayList<>();

        for(int i = 0; i <  hoteis.size(); i++) {
            Hotel hotel = hoteis.get(i);
            if(hotel.getCidade().equals(cidade)) {
                hoteisParaRemocao.add(hotel);
//                hoteis.remove(i);
//                i--;
            }
        }

        hoteis.removeAll(hoteisParaRemocao);
    }

    public void remover(Hotel hotel) {
        boolean removido = hoteis.remove(hotel);

        if(!removido) {
            throw new HotelNaoEncontradoException("Hotel não encontrado para remoção");
        }
    }

    public void removerTodos() {
        hoteis.clear();
    }

}
