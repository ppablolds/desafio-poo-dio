
import br.com.dio.desafios.dominio.Bootcamp;
import br.com.dio.desafios.dominio.Curso;
import br.com.dio.desafios.dominio.Dev;
import br.com.dio.desafios.dominio.Mentoria;
import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescricao("Descrição do curso de JavaScript");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria de Java");
        mentoria.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("mentoria de JavaScript");
        mentoria2.setDescricao("Descrição da mentoria de JavaScript");
        mentoria2.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(mentoria2);

        Dev devPablo = new Dev();
        devPablo.setNome("Pablo");
        devPablo.inscreverBootcamp(bootcamp);
        devPablo.progredir();
        devPablo.progredir();
        devPablo.progredir();
        devPablo.progredir();
        devPablo.progredir();
        devPablo.progredir();
        System.out.println("Conteudos Inscritos de Pablo: " + devPablo.getConteudosInscritos());
        System.out.println("Conteudos Concluidos de Pablo: " + devPablo.getConteudosConcluidos());
        System.out.println("XP: " + devPablo.calcularTotalXp());

        System.out.println("--------------------------------------");

        Dev devBiano = new Dev();
        devBiano.setNome("Biano");
        devBiano.inscreverBootcamp(bootcamp);
        devBiano.progredir();
        devBiano.progredir();
        devBiano.progredir();
        System.out.println("Conteudos Inscritos de Biano: " + devBiano.getConteudosInscritos());
        System.out.println("Conteudos Concluidos de Biano: " + devBiano.getConteudosConcluidos());
        System.out.println("XP: " + devBiano.calcularTotalXp());

    }
}
