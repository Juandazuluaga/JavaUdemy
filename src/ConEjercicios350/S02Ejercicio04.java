package ConEjercicios350;

import java.util.Scanner;

public class S02Ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int euro = 4523;
        System.out.println("Ingrese la cantidad de pesos colombianos: " );
        double pesoColombiano = scanner.nextDouble();

        double catidad = (euro * pesoColombiano);
        System.out.println("El valor en Euros es = " + catidad);
    }
}
