package es;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final double PI = 3.14;
        System.out.println("Introduce el radio");
        Scanner ss = new Scanner(System.in);

        double radio = Double.parseDouble(ss.nextLine());

        System.out.println("El área es: " + PI * Math.pow(radio, 2));

      }
}
