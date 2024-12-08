import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ejercicio:
 * 
 * Crear un programa que solicite al usuario ingresar 5 números enteros,
 * los almacene en un arreglo unidimensional, y luego calcule y muestre:
 * - La suma de los números.
 * - El promedio.
 * - El número mayor y menor.
 * 
 * Adicionalmente, implementar un arreglo bidimensional 3x3 que calcule
 * la suma de cada fila y cada columna.
 *
 */
public class ecuaciones1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Comenzamos con la declaración de variables para el arreglo unidimensional
        int[] numeros = new int[5];
        int suma = 0;

        // Solicitaremos al usuario ingresar 5 números enteros
        System.out.println("Ingrese 5 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            boolean valido = false; // Con una bandera vamos a verificar entrada válida
            while (!valido) {
                try {
                    System.out.print("Número " + (i + 1) + ": ");
                    numeros[i] = scanner.nextInt(); // Intentamos leer un número entero
                    valido = true; // Si todo está bien, la entrada válida
                } catch (InputMismatchException e) {
                    System.out.println("Error: Entrada no válida. Por favor, ingrese un número entero.");
                    scanner.nextLine(); // Limpiamos el buffer para evitar bucles infinitos
                }
            }
        }

        // Ahora comenzamos a calcular la suma, promedio, el número mayor y el menor
        int mayor = numeros[0];
        int menor = numeros[0];

        for (int numero : numeros) {
            suma += numero;     // Sumamos cada número
            if (numero > mayor) {
                mayor = numero; // Tenemos el número mayor
            }
            if (numero < menor) {
                menor = numero; // Y tenemos el número menor también
            }
        }

        double promedio = (double) suma / numeros.length;

        // Es hora de mostrar resultados del arreglo unidimensional
        System.out.println("\nResultados del arreglo unidimensional:");
        System.out.println("La suma de los números es: " + suma);
        System.out.println("El promedio es: " + promedio);
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);

        // Implementamos y procesamos el arreglo bidimensional 3x3
        int[][] matriz = new int[3][3];
        int[] sumaFilas = new int[3];
        int[] sumaColumnas = new int[3];

        System.out.println("\nEstámos creando un arreglo bidimensional 3x3, ingresa números enteros:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boolean valido = false;
                while (!valido) {
                    try {           // Cachamos cualquiér error al ingresar números que no sean enteros.
                        System.out.print("Ingresa el valor de la columna " + (j + 1) + " fila " + (i + 1) + ": ");
                        matriz[i][j] = scanner.nextInt();
                        valido = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Error: Lo siento, el número que ingresaste no es válida. Por favor, recuerda, es un número entero.");
                        scanner.nextLine(); // Limpiamos el buffer como antes
                    }
                }
            }
        }

        // Ahora a calcular la suma de filas y columnas
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumaFilas[i] += matriz[i][j];
                sumaColumnas[j] += matriz[i][j];
            }
        }

        // Mostraremos los resultados del arreglo bidimensional
        System.out.println("\n¡Excelente! Los resultados del arreglo bidimensional 3x3 son:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Suma de la fila " + (i + 1) + ": " + sumaFilas[i]);
        }
        for (int j = 0; j < 3; j++) {
            System.out.println("Suma de la columna " + (j + 1) + ": " + sumaColumnas[j]);
        }

        // Terminamos y a cerrar el Scanner
        scanner.close();
    }
}