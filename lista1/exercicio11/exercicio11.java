package list01.exercicio11;
import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a velocidade em km/h: ");
        double velocidade = sc.nextDouble();

        double kmHora = velocidade * 3.6;
        System.out.printf("A velocidade em KM/h é %.2f%n", kmHora);

        sc.close();
    }
}
