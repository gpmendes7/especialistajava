package com.algaworks.agenda;

public class Principal2 {

    public static void main(String[] args) {
        Horario horario = new Horario(19, 30);
        Agendamento agendamentoCabelo = new Agendamento(horario, "Corte de cabelo");

        Horario novoHorario = CalculadoraHorario.somarDuasHoras(horario);

        System.out.println(agendamentoCabelo.getHorarioFormatado());
        System.out.println(novoHorario.formatar());

    }

}
