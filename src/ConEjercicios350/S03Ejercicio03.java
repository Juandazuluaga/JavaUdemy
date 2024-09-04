package ConEjercicios350;

public class S03Ejercicio03 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduce la cantidad de pesos que quieres convertir: ");
        Integer pesos = Integer.parseInt(System.console().readLine());
        double euros = pesos / 4543.13;
        System.out.printf("%d pesos son %.2f euros.", pesos, euros);
    }
}