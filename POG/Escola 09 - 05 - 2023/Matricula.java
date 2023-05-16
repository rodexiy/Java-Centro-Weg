/*
 * Classe para representar a Matricula 
 * @author Daniel
 */

public class Matricula {
    private int numero;
    private Curso curso;
    private String turma;

    

    /* atribui o numero da matricula à classe Matricula */
    public void setNumero(int numero){
        if (numero >= 0){
            this.numero = numero;
        }else{
            System.out.println("Número inválido!");
        }
    }

    
    /* retorna o numero da matricula à classe Matricula */
    public int getNumero(){
        return this.numero;
    }

    /* atribui o curso à classe */
    public void setCurso(Curso curso){
        this.curso = curso;
    }

    /* retorna o curso da classe Matricula */
    public Curso getCurso(){
        return this.curso;
    }

    /* atribui a turma à classe Matricula */
    public void setTurma(String turma){
        if (turma.matches("[A-Za-z]*")){
            this.turma = turma;
        }else{
            System.out.println("Turma inválida!");
        }
    }

    

    /* retorna a turma da classe Matricula */
    public String getTurma(){
        return this.turma;
    }
    
}
