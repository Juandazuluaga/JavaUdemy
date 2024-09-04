package ConEjercicios350;

import java.util.Scanner;



public class AAPracticarEjemplos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce tes números (pueden ser decimales) separados por un espacio \s:");

        double x1 = s.nextDouble();
        double x2 = s.nextDouble();
        double x3 = s.nextDouble();

        double media = (x1+ x2 + x3)/3;

        System.out.println("La media de esos tres números es " + media);
    }
}