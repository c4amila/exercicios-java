package list01.exercicio03;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor para A: ");
        double A = sc.nextDouble();
        System.out.println("Digite um valor para B: ");
        double B = sc.nextDouble();
        System.out.println("Digite um valor para C: ");
        double C = sc.nextDouble();

        //área triangulo retangulo -> b*h/2
        double triangulo = (A * C) / 2;

        //área do circulo -> pi*r^2
        double pi = 3.14159;
        double circulo = pi * Math.pow(C, 2);

        //área do trapézio -> (B*b)*h/2
        double trapezio = ((A + B) * C) / 2;

        //área do quadrado -> L^2
        double quadrado = Math.pow(B, 2);

        //área retângulo -> b*h
        double retangulo = A * B;

        System.out.printf("Triângulo: %.2f%n", triangulo);
        System.out.printf("Circulo: %.2f%n", circulo);
        System.out.printf("Trapezio: %.2f%n", trapezio);
        System.out.printf("Quadrado: %.2f%n", quadrado);
        System.out.printf("Retângulo: %.2f%n", retangulo);

        sc.close();
    }
}
