package com.algaworks.crm;

import com.algaworks.crm.entidade.Cliente;
import com.algaworks.csv.GeradorCSV;

import java.time.LocalDate;
import java.util.Arrays;

public class Principal1 {

    public static void main(String[] args) {
        var clientes = Arrays.asList(
                new Cliente(1L, "João", LocalDate.parse("1992-01-01")),
                new Cliente(2L, "Pedro", LocalDate.parse("1992-01-01")),
                new Cliente(3L, "Maria", LocalDate.parse("1992-01-01")));

        GeradorCSV.imprimir(Cliente.class, clientes);
    }
}
