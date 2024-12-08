import java.util.Scanner;
/*
 * 
 * Desarrollar un programa que:
 *      Solicite al usuario un número entero y determine si es primo o no (utilizando bucles for y una estructura condicional if).
 *      Genere una tabla de multiplicar del 1 al 10 para un número ingresado por el usuario utilizando un bucle while.
 * 
 */

 public class ecuaciones3 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.print("Ingresa un número entero: ");
        numero = scanner.nextInt();

        // Primero, vamos a eterminar si el número es primo o no
        boolean esPrimo = true;
        for (int i = 2; i <= Math.sqrt(numero); i++) { // La iteración con raíz cuadrada nos da menos carga en el programa
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }

        // Con ayuda de nuestro boleano, vemos por pantalla el mensaje que corresponda
        System.out.println("Ingresaste el número " + numero + (esPrimo ? " y sí, pertenece a los números primos" : ". Oh no, lo siento,"+ numero + " no es primo"));

        // Ahora haremos nuestra tala de multiplicar en base al entero ingresado previamente
        System.out.println("Tabla de multiplicar del " + numero);
        int contador = 1;
        while (contador <= 10) {
            
            // La ecuación la podemos hacer dentro del mismo mensaje para evitar linease de código innecesarias.
            System.out.println("El producto de " +numero + " por " + contador + " es igual a " + (numero * contador));
            contador++;
        }
    // Terminamos y a cerrar el Scanner
    scanner.close();
    }
}
