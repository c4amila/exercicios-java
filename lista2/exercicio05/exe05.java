package exercicio05;

import java.util.Scanner;

public class exe05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //ax² + bx + c = 0

        System.out.println("Digite o valor de A: ");
        double a = sc.nextDouble();
        System.out.println("Digite o valor de B: ");
        double b = sc.nextDouble();
        System.out.println("Digite o valor de C: ");
        double c = sc.nextDouble();

        if (a != 0){
            double delta = Math.pow(b, 2) - (4 * a * c);
            if (delta < 0){
                System.out.println("A equação não possui raízes reais");
            }else if (delta == 0){
                double x = -b / (2 * a);
                System.out.println("A equação possui uma raiz real: " + x);
            }else{
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.println("A equação possui duas raízes reais: ");
                System.out.println("X1: " + x1);
                System.out.println("X2: " + x2);
            }

        }else{
            System.out.println("A precisa ser diferente de 0");
        }

        sc.close();
    }
}
