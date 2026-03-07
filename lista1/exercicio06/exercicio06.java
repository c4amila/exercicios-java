package list01.exercicio06;
import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        //idade em meses
        int mes = idade * 12;

        //idade em dias
        int dias = idade * 365;

        //bonus: idade em semanas
        int semanas = dias / 7;

        System.out.println("Idade em meses: " + mes);
        System.out.println("Idade em dias: " + dias);
        System.out.println("Idade em semanas (bônus): " + semanas);

        sc.close();
    }
}
