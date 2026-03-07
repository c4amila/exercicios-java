package list01.exercicio07;
import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = sc.nextFloat();

        double C = (5.0/9.0) * (fahrenheit - 32.0);

        System.out.printf("A temperatura em Celsius é: %.2f%n", C);

        sc.close();
    }
}
