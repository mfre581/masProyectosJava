import java.util.Scanner;

public class calculadora{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese dos números
        System.out.print("Ingresa el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int numero2 = scanner.nextInt();

        // Calcular la suma, resta, multiplicación y división
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = numero1 / numero2; // Se asume que el segundo número no es cero

        // Mostrar el resultado
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
        System.out.println("La resta de " + numero1 + " y " + numero2 + " es: " + resta);
        System.out.println("La multiplicación de " + numero1 + " por " + numero2 + " es: " + multiplicacion);
        System.out.println("La división de " + numero1 + " entre " + numero2 + " es: " + division);

        // Cerrar el scanner
        scanner.close();

    }
}