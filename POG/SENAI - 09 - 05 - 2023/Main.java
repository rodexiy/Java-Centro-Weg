public class Main {

    
    /*
     * Codigo principal onde é executado
    */
    public static void main(String[] args){
        Aluno aluno = new Aluno("Matheus");
        aluno.setCPF("123.432.344-16");
        aluno.setEmail("Aluno.email@legal.com");
        aluno.setEndereco("Rua maneira");
        aluno.setResponsavel("Roberto");
        aluno.setTelefone("554512331231");

        Curso curso = new Curso("POG");
        UnidadesCurriculares unidadesCurriculares = new UnidadesCurriculares("Matemática", curso);
        Matricula matricula = new Matricula(aluno, unidadesCurriculares);
        Avaliacao avaliacao = new Avaliacao(aluno.getNome(), unidadesCurriculares);
        Double nota_nota = 9.0;
        Notas nota = new Notas(aluno, avaliacao, nota_nota);
        // matricula.setCodigo("S00000");


    }
}