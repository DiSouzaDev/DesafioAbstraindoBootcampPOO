package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("JavaScript");
        curso1.setDescricao("Curso de desenvolvimento JavaScript");
        curso1.setCargaHoraria(14);

        Curso curso2 = new Curso();
        curso2.setTitulo("Java");
        curso2.setDescricao("Curso de desenvolvimento Java");
        curso2.setCargaHoraria(28);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("TDD e BDD");
        mentoria.setDescricao("Explicação sobre piramides de teste");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Banco Pan Java Developer");
        bootcamp.setDescricao("Curso de desenvolvimento Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Ricardo");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXP());

        System.out.println("---------");

        Dev dev2 = new Dev();
        dev2.setNome("Giovana");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXP());
    }
}