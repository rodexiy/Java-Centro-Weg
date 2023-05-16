/* Classe que define as avaliações */

public class Avaliacao {
    private double notas;

    

    /* Atribui as notas na classe, minimo 0, máximo 10 */
    public void setNotas(double notas){
        if (notas >= 0 && notas <= 10){
            this.notas = notas;
        }else{
            System.out.println("Notas inválidas!");
        }
    }

    

    /* Retorna as notas */
    public double getNotas(){
        return this.notas;
    }
}
