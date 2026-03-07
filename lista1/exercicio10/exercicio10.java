package list01.exercicio10;
import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("1º Bimestre");
        System.out.println("Digite a nota da primeira prova: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a nota da segunda prova: ");
        double nota2 = sc.nextDouble();

        System.out.println("2º Bimestre");
        System.out.println("Digite a nota da terceira prova: ");
        double nota3 = sc.nextDouble();
        System.out.println("Digite a nota da quarta prova: ");
        double nota4 = sc.nextDouble();

        double media1 = (nota1 + nota2) / 2;
        double media2 = (nota3 + nota4) / 2;

        double mediaSemestral = (media1 + media2) / 2;
        System.out.printf("A nota semestral do aluno é %.1f%n", mediaSemestral);

        sc.close();
    }
}
