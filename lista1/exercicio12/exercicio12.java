package list01.exercicio12;

public class exercicio12 {
    public static void main(String[] args){
        double R1 = 10;
        double R2 = 10;
        double R3 = 5;

        double R12 = (R1 * R2) / (R1 + R2); //resolvendo associação em paralelo
        double ResEquivalente = R12 + R3; //calculando R12 e R3 em série
        System.out.printf("A resistência equivalente é de %.2f Ohms%n", ResEquivalente);
    }
}
