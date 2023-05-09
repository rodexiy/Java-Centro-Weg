public class Matricula {
    private int numero;
    private Curso curso;
    private String turma;

    public void setNumero(int numero){
        if (numero >= 0){
            this.numero = numero;
        }else{
            System.out.println("Número inválido!");
        }
    }

    public int getNumero(){
        return this.numero;
    }

    public void setCurso(Curso curso){
        this.curso = curso;
    }

    public Curso getCurso(){
        return this.curso;
    }

    public void setTurma(String turma){
        if (turma.matches("[A-Za-z]*")){
            this.turma = turma;
        }else{
            System.out.println("Turma inválida!");
        }
    }

    public String getTurma(){
        return this.turma;
    }
    
}
