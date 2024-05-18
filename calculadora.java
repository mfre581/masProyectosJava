import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese dos números
        System.out.print("Ingresa el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double numero2 = scanner.nextDouble();

        // Calcular la suma, resta, multiplicación y división
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
<<<<<<< HEAD
        double division = numero1 / numero2; // Se asume que el segundo número no es cero
=======

        // Manejo de la división por cero
        double division = 0;
        if (numero2 != 0) {
            division = numero1 / numero2;
        } else {
            System.out.println("No se puede dividir por cero.");
        }
>>>>>>> Rama2

        // Mostrar el resultado
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
        System.out.println("La resta de " + numero1 + " y " + numero2 + " es: " + resta);
        System.out.println("La multiplicación de " + numero1 + " por " + numero2 + " es: " + multiplicacion);
<<<<<<< HEAD
        System.out.println("La división de " + numero1 + " entre " + numero2 + " es: " + division);

        // Cerrar el scanner
        scanner.close();
        
=======
        if (numero2 != 0) {
            System.out.println("La división de " + numero1 + " entre " + numero2 + " es: " + division);
        }

        // Cerrar el scanner
        scanner.close();
>>>>>>> Rama2
    }
}