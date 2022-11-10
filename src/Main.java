import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

   Curso curso1 = new Curso();
   curso1.setTitulo("curso java");
   curso1.setDescricao("descrição curso java");
   curso1.setCargaHoraria(8);

   Curso curso2 = new Curso();
   curso2.setTitulo("curso jS");
   curso2.setDescricao("descrição curso jS");
   curso2.setCargaHoraria(4);



   Mentoria mentoria = new Mentoria();
   mentoria.setTitulo("mentoria java");
   mentoria.setDescricao("descrição mnetoria java");
   mentoria.setData(LocalDate.now());



        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java Developer");
        bootcamp.setDescricao("Descrição Bootcamp java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAlexandre = new Dev();
        devAlexandre.setNome("Alexandre");
        devAlexandre.increverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Alexandre:" + devAlexandre.getConteudosIscritos());
        devAlexandre.progredir();
        devAlexandre.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Alexandre:" + devAlexandre.getConteudosIscritos());
        System.out.println("Conteúdos Concluidos Alexandre:" + devAlexandre.getConteudosConcluidos());
        System.out.println("XP" + devAlexandre.calcularTotalXp());

        System.out.println("----------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.increverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos João:"+ devAlexandre.getConteudosIscritos());
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos João:"+ devAlexandre.getConteudosIscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP" + devJoao.calcularTotalXp());




    }
}