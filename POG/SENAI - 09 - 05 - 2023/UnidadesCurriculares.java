/*
 * Classe para representar as Unidades Curriculares
 * @author Daniel
 */

public class UnidadesCurriculares {
    private String nome;
    private Curso curso;

    public UnidadesCurriculares(String nome, Curso curso){
        setNome(nome);
        setCurso(curso);
    }
    
    public boolean setNome(String nome){
        if (nome.length() > 0 && nome.matches("[A-Za-z]*")){
            this.nome = nome;
            return true;
        }else{
            System.out.println("Nome inválido!");
            return false;
        }
    }

    public String getNome(){
        return this.nome;
    }

    public boolean setCurso(Curso curso){
        if (curso.getClass().getSimpleName() == "Curso"){
            this.curso = curso;
            return true;
        }else{
            return false;
        }
    }


    public Curso getCurso(){
        return this.curso;
    }


}
