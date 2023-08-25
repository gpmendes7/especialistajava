package org.example;

import java.math.BigDecimal;
import java.sql.*;
import java.util.Scanner;

public class Principal2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pesquisa por nome: ");
        String nomePesquisa = scanner.nextLine();

        try (Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/comercial", "root", "root");
             Statement comando = conexao.createStatement();
             ResultSet resultado = comando.executeQuery("select * from venda where nome_cliente like '%" + nomePesquisa + "%'");) {
            
            System.out.println("Conexão aberta!");

            while (resultado.next()) {
                Long id = resultado.getLong("id");
                String nomeCliente = resultado.getString("nome_cliente");
                BigDecimal valorTotal = resultado.getBigDecimal("valor_total");
                Date dataPagamento = resultado.getDate("data_pagamento");
                System.out.println("---");
                System.out.printf("%d - %s - R$%.2f - %s%n", id, nomeCliente, valorTotal, dataPagamento);
            }

        } catch (SQLException e) {
            System.out.println("Erro de banco de dados");
            e.printStackTrace();
        }

    }
}