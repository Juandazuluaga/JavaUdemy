package ConEjercicios350;

public class S03Ejercicio04 {
    public static void main(String[] args) {

        int x;
        int y;
        String linea;

        System.out.print("Por favor, introduce el primer número: ");
        linea = System.console().readLine();
        x = Integer.parseInt(linea);
        System.out.println("Introduzca el segundo numero");
        linea = System.console().readLine();
        y = Integer.parseInt(linea);

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("x + y =  " + (x + y));
        System.out.println("x - y =  " + (x - y));
        System.out.println("x / y =  " + (x / y));
        System.out.println("x * y =  " + (x * y));


    }
}