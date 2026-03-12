package exercicio02;

import java.util.Scanner;

public class exe02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite três valores:");
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        int v3 = sc.nextInt();

        int menor = v1;

        if (v2 < menor){
            menor = v2;
        }
        if (v3 < menor){
            menor = v3;
        }

        int soma = (v1 + v2 + v3) - menor;

        System.out.println("A soma dos maiores é: " + soma);

        sc.close();
    }
}
