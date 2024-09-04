package ConEjercicios350;

import java.util.Scanner;

public class S02Ejercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peso = 4523;
        System.out.println("Ingrese la cantidad de Euros a convertir: " );
        double convertir = scanner.nextDouble();

        double cantidad = (peso * convertir);
        System.out.println("catidad = " + cantidad + " pesos colombianos");

    }
}
