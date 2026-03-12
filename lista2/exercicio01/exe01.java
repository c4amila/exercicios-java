package exercicio01;
import java.util.Scanner;

public class exe01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        int modulo;

        if(num < 0){
            modulo = num * -1;
        }else{
            modulo = num;
        }

        System.out.println("O modulo é igual a " + modulo);

        sc.close();
    }
}
