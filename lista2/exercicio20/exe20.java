package exercicio20;

import java.util.Scanner;

public class exe20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = sc.nextInt();

        if (ehPrimo(n)){
            System.out.println("é primo");
        }else{
            System.out.println("não é primo");
        }

        sc.close();
    }

    public static boolean ehPrimo(int n){
        if (n <= 1){
            return false;
        }

        for (int i = 2; i < n; i++){
            if (n % i == 0){
                return false;
            }
        }

        return true;
    }
}
