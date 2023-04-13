package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso Java = new Curso();
        Java.setTitulo("Banco Pan Java Developer");
        Java.setDescricao("Curso de desenvolvimento Java");
        Java.setCargaHoraria(114);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("TDD e BDD");
        mentoria.setDescricao("Explicação sobre piramides de teste");
        mentoria.setData(LocalDate.now());

        System.out.println(Java);
        System.out.println(mentoria);
    }
}