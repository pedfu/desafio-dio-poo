import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de React");
        mentoria1.setDescricao("Descrição mentoria React");
        mentoria1.setData(LocalDate.now());

        Curso curso3 = new Curso();
        curso3.setTitulo("Curso React");
        curso3.setDescricao("Novo curso, increva-se ja");
        curso3.setCargaHoraria(60);

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp React");
        bootcamp1.setDescricao("Descrição Bootcamp React Developer");
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria1);

        Dev devPed = new Dev();
        devPed.setNome("Pedro");
        devPed.inscreverBootcamp(bootcamp);
        devPed.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos Inscritos Pedro:" + devPed.getConteudosInscritos());

        devPed.progredir();
        devPed.progredir();

        System.out.println();
        System.out.println("Conteúdos Inscritos Pedro:" + devPed.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Pedro:" + devPed.getConteudosConcluidos());
        System.out.println("XP:" + devPed.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
    }
}
