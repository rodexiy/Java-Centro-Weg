
/**
 * Classe Main onde o código é executado
 * 
 * @author Daniel
 */

public class Main {

    /**
     * Static void onde o código é executado para testes
     * 
     * @param args (String[])
     */

    public static void main(String[] args) {
        Aluno aluno = new Aluno("Santiago da Silva");
        aluno.setCPF("123.432.344-16");
        aluno.setEmail("Aluno.email@legal.com");
        aluno.setEndereco("Rua maneira");
        aluno.setResponsavel("Pedro da silva");
        aluno.setTelefone("554512331231");

        Curso curso = new Curso("Programacao de sistemas");
        UnidadesCurriculares unidadesCurriculares = new UnidadesCurriculares("Matematica", curso);
        Matricula matricula = new Matricula(aluno, unidadesCurriculares);
        Avaliacao avaliacao = new Avaliacao("Prova de redes", unidadesCurriculares);
        Double nota_nota = 9.0;
        Notas nota = new Notas(aluno, avaliacao, nota_nota);
        matricula.setCodigo("S12345");

        // output

        System.out.println("------- Aluno -------");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("CPF: " + aluno.getCPF());
        System.out.println("Email: " + aluno.getEmail());
        System.out.println("Endereco: " + aluno.getEndereco());
        System.out.println("Responsavel: " + aluno.getResponsavel());
        System.out.println("");

        System.out.println("------- Curso -------");
        System.out.println("Nome: " + curso.getNome());
        System.out.println("");

        System.out.println("------- UnidadesCurriculares -------");
        System.out.println("Nome: " + unidadesCurriculares.getNome());
        System.out.println("");

        System.out.println("------- Matricula -------");
        System.out.println("Codigo: " + matricula.getCodigo());
        System.out.println("");

        System.out.println("------- Avaliação -------");
        System.out.println("Nome: " + avaliacao.getNome());
        System.out.println("");

        System.out.println("------- nota -------");
        System.out.println("Nota: " + nota.getNota());
        System.out.println("");
    }
}