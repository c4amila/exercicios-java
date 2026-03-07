package list01.exercicio09;
import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro menor que 32: ");
        int num = sc.nextInt();

        if(num <= 32){
            String binario = "";
            int n = num;
            while(n > 0){
                int resto = n % 2;
                binario = resto + binario; //monta o binario
                n = n /2; //atualiza o quociente para o loop pegar o proximo resto
            }
            System.out.println("O numero " + num + "em binário é -> " + binario);

        }else{
            System.out.println("É necessário que o número seja menor que 32.");
        }


        sc.close();
    }
}
