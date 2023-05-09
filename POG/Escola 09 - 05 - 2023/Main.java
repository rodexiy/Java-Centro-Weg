public class Main {

    /*
     * Codigo principal onde é executado
    */
    public static void main(String[] args){
        Aluno aluno = new Aluno();
        aluno.setNome("Matheus");
        aluno.setCPF("12343234416");
        aluno.setDataDeNascimento(2000, 5, 1);
        aluno.setEmail("Aluno.email@legal.com");
        aluno.setEndereco("Rua maneira");
        aluno.setResponsavel("Roberto");
        aluno.setTelefone("554512331231");

        Matricula matricula = new Matricula();
        matricula.setNumero(1234);
        matricula.setTurma("MI");

        Curso curso = new Curso();
        curso.setCargaHoraria(1800);
        curso.setNome("Programador");

        UnidadesCurriculares unidadesCurriculares = new UnidadesCurriculares();
        unidadesCurriculares.setFrequencia(40.0);

        Professor professor = new Professor();
        professor.setNome("Pedro");
        professor.setCPF("12345678901");
        professor.setDataDeNascimento(1992, 12, 4);
        professor.setEndereco("Rua do prof");
        professor.setEmail("Email@profe");
        professor.setTelefone("4812392138");
        unidadesCurriculares.setProfessor(professor);

        Avaliacao avaliacao = new Avaliacao();
        avaliacao.setNotas(3.4);
        unidadesCurriculares.setAvaliacao(avaliacao);
        curso.setUnidadesCurriculares(unidadesCurriculares);
        
        matricula.setCurso(curso);
        aluno.setMatricula(matricula);

        System.out.println("Aluno: ");
        System.out.println(aluno.getNome());
        System.out.println(aluno.getCPF());
        System.out.println(aluno.getEmail());
        System.out.println(aluno.getEndereco());
        System.out.println(aluno.getResponsavel());
        System.out.println(aluno.getTelefone());
        System.err.println(aluno.getDataDeNascimento());

        System.out.println("Matricula");
        System.err.println(aluno.getMatricula().getNumero());
        System.err.println(aluno.getMatricula().getTurma());

        System.out.println("Unidades Curriculares: ");
        System.out.println(unidadesCurriculares.getfrequencia());
        
        System.out.println("Avaliação: ");
        System.out.println(avaliacao.getNotas());

        System.out.println("Professor: ");
        System.out.println(professor.getNome());
        System.out.println(professor.getCPF());
        System.out.println(professor.getEmail());
        System.out.println(professor.getEndereco());
        System.out.println(professor.getTelefone());
        System.err.println(professor.getDataDeNascimento());
    }
}