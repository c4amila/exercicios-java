package list01.exercicio16;
import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero com 3 algarismos: ");
        int numero = sc.nextInt();

        //pegando a centena
        int centena = numero / 100;

        //pegando a dezena
        int dezena = (numero % 100) / 10;

        //pegando a unidade
        int unidade = numero % 10;

        //invertendo
        int invertido = (unidade * 100) + (dezena * 10) + centena;
        //unidade vira centena e vice versa

        System.out.println("O número invertido é: " + invertido);

        sc.close();
    }
}
