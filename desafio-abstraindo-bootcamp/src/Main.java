import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso");
        curso1.setCargaHoraria(76);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso SQL");
        curso2.setDescricao("Descrição do curso");
        curso2.setCargaHoraria(75);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição da mentoria");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("DIO Java Developer", "Descrição do bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devJuninho = new Dev("Juninho");
        devJuninho.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devJuninho.getConteudosInscritos());
        devJuninho.progredir();
        devJuninho.progredir();
        devJuninho.progredir();
        System.out.println("Conteúdos inscritos: " + devJuninho.getConteudosInscritos());
        System.out.println("Conteúdos concluídos" + devJuninho.getConteudosConcluidos());
        System.out.println("XP " + devJuninho.calcularTotalXp());

        System.out.println();

        Dev devSandy = new Dev("Sandy");
        devSandy.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devSandy.getConteudosInscritos());
        devSandy.progredir();
        System.out.println("Conteúdos inscritos: " + devSandy.getConteudosInscritos());
        System.out.println("Conteúdos concluídos" + devSandy.getConteudosConcluidos());
        System.out.println("XP: " + devSandy.calcularTotalXp());

    }
}
