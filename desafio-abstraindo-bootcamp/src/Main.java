import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso("Curso Java", "Descrição do curso", 76);

        Curso curso2 = new Curso("Curso SQL", "Descrição do curso", 75);

        Mentoria mentoria1 = new Mentoria("Mentoria de Java", "Descrição da mentoria", LocalDate.now());

        Mentoria mentoria2 = new Mentoria("Mentoria de SQL", "Descrição da mentoria", LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        System.out.println(mentoria2);
    }
}
