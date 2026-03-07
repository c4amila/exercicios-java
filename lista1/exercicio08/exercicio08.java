package list01.exercicio08;

public class exercicio08 {
    public static void main(String[] args){
        //fazendo sem Scanner
        double r = 3.0;
        double h = 10.0;

        //usando Math.pi ao inves de definir manualmente
        double volume = Math.PI * Math.pow(r, 2) * h;

        System.out.println("O volume é: " + volume + " m²");

    }
}
