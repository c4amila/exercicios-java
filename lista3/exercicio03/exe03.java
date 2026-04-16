package exercicio03;

import java.util.Scanner;

public class exe03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        System.out.println(ehTriangular(num) ? "é triangular" : "nao é triangular");

        sc.close();
    }

    public static boolean ehTriangular(int num){
        for (int n = 1; n * (n+1) * (n+2) <= num; n++){
            if (n * (n+1) * (n+2) == num){
                return true;
            }
        }
        return false;
    }
}
