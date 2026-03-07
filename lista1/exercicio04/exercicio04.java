package list01.exercicio04;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num = sc.nextInt();

        int sucessor = num + 1;
        System.out.println("O sucessor é " + sucessor);

        sc.close();

    }
}
