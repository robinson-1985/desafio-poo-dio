import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javaScript");
        curso2.setDescricao("descricao curso javaScript");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição Mentoria java");
        mentoria.setData(LocalDate.now());


       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Camila" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("---------");

        Dev devRobinson = new Dev();
        devRobinson.setNome("Robinson");
        devRobinson.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Robinson" + devRobinson.getConteudosInscritos());
        devRobinson.progredir();
        devRobinson.progredir();
        devRobinson.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Robinson" + devRobinson.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Robinson" + devRobinson.getConteudosConcluidos());
        System.out.println("XP:" + devRobinson.calcularTotalXp());
    }
}
