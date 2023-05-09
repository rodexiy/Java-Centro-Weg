public class Avaliacao {
    private double notas;

    public void setNotas(double notas){
        if (notas >= 0 && notas <= 10){
            this.notas = notas;
        }else{
            System.out.println("Notas inválidas!");
        }
    }

    public double getNotas(){
        return this.notas;
    }
}
