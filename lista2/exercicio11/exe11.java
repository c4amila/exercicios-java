package exercicio11;

import java.util.Scanner;

public class exe11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de passes tentados: ");
        int passesTentados = sc.nextInt();

        System.out.println("Digite a quantidade de passes completos: ");
        int passesCompletos = sc.nextInt();

        System.out.println("Digite a quantidade de jardas passadas: ");
        int jardasPassadas = sc.nextInt();

        System.out.println("Digite o numero de passes p/ touchdown: ");
        int passesTouchdown = sc.nextInt();

        System.out.println("Digite o numero de passes interceptados: ");
        int passesInterceptados = sc.nextInt();

        //percentual de passes completados / passes tentados
        double a = (((double) passesCompletos / passesTentados) - 0.3) / 0.2;
        a = limitar(a);

        //razão de jardas passadas por passes tentados
        double b = (((double)jardasPassadas / passesTentados) - 3.0) / 4.0;
        b = limitar(b);

        //razão passes touchdown por passes tentados
        double c = ((double) passesTouchdown / passesTentados) / 0.05;
        c = limitar(c);

        //razão passes interceptados por passes tentados
        double d = (0.095 - ((double) passesInterceptados / passesTentados)) / 0.04;
        d = limitar(d);

        double qbRating = ((a + b + c + d) * 100) / 6;
        //usando text block para a saída ficar mais bonita
        System.out.printf("""
        QB RATING DO QUARTERBACK
        --------------------------------
        Parcela de passes completos: %.3f
        Parcela de jardas passadas: %.3f
        Parcela de touchdown: %.3f
        Parcela de interceptados: %.3f
        --------------------------------
        QB Rating: %.2f
        """, a, b, c, d, qbRating);

        sc.close();

    }

    //função auxiliar para ajustar o limite entre 0 e 2,375
    public static double limitar(double valor){
        return Math.max(0, Math.min(2.375, valor));
    }
}
