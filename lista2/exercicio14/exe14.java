package exercicio14;

import java.util.Scanner;

public class exe14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de X (abcissa): ");
        double x = sc.nextDouble();

        System.out.println("Digite o valor de Y (ordenada): ");
        double y = sc.nextDouble();

        //determinar os quadrantes
        if (x > 0 && y > 0){
            System.out.println("Quadrante I");
        }else if (x < 0 && y > 0){
            System.out.println("Quadrante II");
        }else if (x < 0 && y < 0){
            System.out.println("Quadrante III");
        }else if (x > 0 && y < 0){
            System.out.println("Quadrante IV");
        }else if (x == 0 && y == 0){
            System.out.println("O ponto está na origem");
        }else if (x == 0){
            System.out.println("Está no eixo Y");
        }else if (y == 0){
            System.out.println("Está no eixo X");
        }

        sc.close();
    }
}
