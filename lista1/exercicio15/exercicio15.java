package list01.exercicio15;
import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua altura(metros): ");
        double suaAltura = sc.nextDouble();

        System.out.println("Digite a sombra do prédio(metros): ");
        double sombraPredio = sc.nextDouble();

        System.out.println("Digite a altura da sua sombra(metros): ");
        double suaSombra = sc.nextDouble();

        double alturaPredio = (suaAltura * sombraPredio) / suaSombra;

        System.out.println("Altura do prédio: " + alturaPredio);

        sc.close();
    }
}
