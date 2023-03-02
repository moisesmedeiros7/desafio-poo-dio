import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Bootcamp Dio Java Banco PAN");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Bootcamp Javascript Spotiffy.");
        curso2.setCargaHoraria(5);

        //exemplo de Polimorfismo
        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Estruturas de Dados em Java");
        mentoria.setData(LocalDate.now());

        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println(devCamila.getNome()+" - Conteúdos inscritos: "+ devCamila.getConteudosInscritos());
        System.out.println("XP: "+devCamila.calcularXp());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("--");
        System.out.println(devCamila.getNome()+" - Conteúdos inscritos: "+ devCamila.getConteudosInscritos());
        System.out.println(devCamila.getNome()+" - Conteúdos concluídos: "+ devCamila.getConteudosConcluidos());
        System.out.println("XP: "+devCamila.calcularXp());
        System.out.println("--");

        Dev devMoises = new Dev();
        devMoises.setNome("Moisés");
        devMoises.inscreverBootcamp(bootcamp);
        System.out.println(devMoises.getNome()+" - Conteúdos inscritos: "+ devMoises.getConteudosInscritos());
        System.out.println("XP: "+devMoises.calcularXp());
        devMoises.progredir();
        devMoises.progredir();
        devMoises.progredir();
        System.out.println("--");
        System.out.println(devMoises.getNome()+" - Conteúdos inscritos: "+ devMoises.getConteudosInscritos());
        System.out.println(devMoises.getNome()+" - Conteúdos concluídos: "+ devMoises.getConteudosConcluidos());
        System.out.println("XP: "+devMoises.calcularXp());
        System.out.println("--");


    }
}