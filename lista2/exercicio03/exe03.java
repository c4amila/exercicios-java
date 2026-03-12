package exercicio03;

import java.util.Scanner;

public class exe03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 valores: ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();

        double peso1 = 2.5;
        double peso2 = 2.5;
        double peso3 = 2.5;

        double maior = n1;

        if (n1 >= n2 && n1 >= n3){
            peso1 = 5;
        }else if (n2 >= n1 && n2 >= n3){
            peso2 = 5;
        }else{
            peso3 = 5;
        }

        double mediaPonderada = (n1 * peso1 + n2 * peso2 + n3 * peso3) / (peso1 + peso2 + peso3);

        System.out.println(mediaPonderada);

        sc.close();
    }
}
