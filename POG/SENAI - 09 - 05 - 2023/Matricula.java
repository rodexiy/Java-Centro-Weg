/*
 * Classe para representar a Matricula 
 * @author Daniel
 */

public class Matricula {
    private String codigo;
    private UnidadesCurriculares unidadesCurriculares;
    private Aluno aluno;

    public Matricula(Aluno aluno, UnidadesCurriculares unidadesCurriculares){
        setAluno(aluno);
        setUnidadesCurriculares(unidadesCurriculares);
    }

    /* atribui o numero da matricula à classe Matricula */
    public boolean setCodigo(String codigo){
        boolean codigoValido = true;
        String[] codigoSplit = codigo.split("0");
        String instituicao = codigoSplit[0];
        String numero = "0" + codigoSplit[1];

        if (numero.length() != 5) {
            codigoValido = false;
        }

        if (instituicao.length() < 0) {
            codigoValido = false;
        }

        if (codigoValido) {
            this.codigo = codigo;
            return true;
        }else{
            System.out.println("Codigo Inválido");
            return false;
        }
    }


    /* retorna o numero da matricula à classe Matricula */
    public String getCodigo(){
        return this.codigo;
    }

    public boolean setAluno(Aluno aluno){
        if (aluno.getClass().getSimpleName() == "Aluno"){
            this.aluno = aluno;
            return true;
        }else{
            System.out.println("Aluno inválido!");
            return false;
        }
    }


    public Aluno getAluno(){
        return this.aluno;
    }


    public boolean setUnidadesCurriculares(UnidadesCurriculares unidadesCurriculares){
        if (unidadesCurriculares.getClass().getSimpleName() == "UnidadesCurriculares"){
            this.unidadesCurriculares = unidadesCurriculares;
            return true;
        }else{
            System.out.println("unidades Curriculares inválidas!");
            return false;
        }
    }

    public UnidadesCurriculares getUnidadesCurriculares(){
        return this.unidadesCurriculares;
    }    


}
