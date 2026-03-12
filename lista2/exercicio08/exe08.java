package exercicio08;

import java.util.Scanner;

public class exe08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o gênero(M ou F): ");
        char gen = sc.next().toUpperCase().charAt(0);

        System.out.println("Digite sua altura (metros): ");
        double altura = sc.nextDouble();

        double pesoIdeal;
        if (gen == 'M') {
            pesoIdeal = (72.7 * altura) - 58;
        }else{
            pesoIdeal = (62.1 * altura) - 44.7;
        }

        System.out.printf("Seu peso ideal é de %.1f quilos%n", pesoIdeal);

        sc.close();
    }
}
