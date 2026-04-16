package exercicio02;

import java.util.Scanner;

public class exe02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 6; i++){//6 faces
            //System.out.println(i);
            for (int j = 1; j <= 6; j++){
                if (i + j == n){
                    System.out.println(i + " - " + j);
                }
            }
        }

        sc.close();
    }
}
