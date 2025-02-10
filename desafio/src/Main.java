import br.com.lucasbenfatti.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Curso sobre a linguagem Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de React");
        curso2.setDescricao("Curso sobre a linguagem Reac");
        curso2.setCargaHoraria(7);

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria m1 = new Mentoria();
        m1.setTitulo("Mentoria Java");
        m1.setDescricao("Mentoria sobre POO em Java");
        m1.setData(LocalDate.now());

        System.out.println(m1);

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java");
        bootcamp1.setDescricao("Bootcamp sobre a linguagem Java");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(m1);

        Dev dev1 = new Dev();
        dev1.setNome("Lucas");
        dev1.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos inscritos LUCAS: " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteúdos inscritos LUCAS: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos LUCAS: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());

        System.out.println("----------------------------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Benfatti");
        dev2.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos inscritos BENFATTI: " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteúdos inscritos BENFATTI: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluídos BENFATTI: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());


    }
}
