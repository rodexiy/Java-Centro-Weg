/*
 * Classe sobre o curso
 */

public class Curso {
    private String nome;
    private int cargaHoraria;
    private UnidadesCurriculares unidadesCurriculares;

    /* Método que atribui o nome do curso, contem verificação de tamanho e caracteres*/
    public void setNome(String nome){
        if (nome.length() >= 3 && nome.matches("[A-Za-z]*")){
            this.nome = nome;
        }else{
            System.out.println("Nome inválido!");
        }
    }

    /* Retorna o nome do curso */
    public String getNome(){
        return this.nome;
    }

    /* Atribui a carga horária ao curso, não pode ser menor que 0 ou 0 */

    public void setCargaHoraria(int cargaHoraria){
        if (cargaHoraria > 0){
            this.cargaHoraria = cargaHoraria;
        }
    }

    public int getCargaHoraria(){
        return this.cargaHoraria;
    }

    public void setUnidadesCurriculares(UnidadesCurriculares unidadesCurriculares){
        this.unidadesCurriculares = unidadesCurriculares;
    }

    public UnidadesCurriculares getUnidadesCurriculares(){
        return this.unidadesCurriculares;
    }
}
