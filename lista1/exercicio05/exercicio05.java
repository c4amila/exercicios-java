package list01.exercicio05;
import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 2 números: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int quociente = num1 / num2;
        int resto = num1 % num2;

        System.out.println("O quociente é: " + quociente);
        System.out.println("O resto é: " + resto);

        sc.close();
    }
}
