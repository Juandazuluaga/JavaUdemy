package ConEjercicios350;

public class S03Ejercicio02 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduce la cantidad de euros que quieres convertir: ");
        double euros = Double.parseDouble(System.console().readLine());
        int pesos = (int) (euros * 4543.13);
        System.out.print(euros + " euros son " + pesos + " pesos.");
    }
}