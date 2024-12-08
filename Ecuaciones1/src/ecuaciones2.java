import java.util.Scanner;
/*
 * 
 * Crear un programa que:
 *      Solicite al usuario dos números enteros.
 *      Realice las operaciones básicas (suma, resta, multiplicación, división) y muestre los resultados.
 *      Determine si ambos números son pares o impares.
 *      Compare cuál número es mayor utilizando operadores relacionales.* 
 * 
 * @author quetzal
 */

public class ecuaciones2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Comenzamos creando nuestras variables en otros casos usaría x y y, pero me gusta así
        int numero1, numero2;
        
        // Hacemos las solicitudes para ingresar el primero y segundo número
        System.out.println("Ingresa un número entero: ");
        numero1 = scanner.nextInt();
    
        System.out.println("Ingresa otro número entero: ");
        numero2 = scanner.nextInt();

         
       // Realizamos las ecuaciones básicas usando sus operadores correspondientes
        int sum_result      = numero1 + numero2;
        int res_result      = numero1 - numero2;        
        int mult_result     = numero1 * numero2; 
        
        // Debemos asegurarnos de no tener errores, no se debe dividir entre cero
        float div_result; 
        if (numero2 != 0) { 
            div_result = (float) numero1 / numero2; 
        } else { 
            div_result = Float.NaN; 
            System.out.println("No, no, no, eso no se puede. Recuerda mo se puede dividir entre cero."); 
        }      

        // Mostramos por pantalla los mensajes con resultados de cada ecuación
        System.out.println("El resultado de la suma de " + numero1 + ", más " + numero2 + ", es: " + sum_result);
        System.out.println("El resultado de la resta de " + numero1 + ", menos " + numero2 + ", es: " + res_result);
        System.out.println("El resultado de la multiplicación de " + numero1 + ", por " + numero2 + ", es: " + mult_result);
        if (numero2 != 0) { 
            System.out.println("El resultado de la división de " + numero1 + " entre " + numero2 + " es: " + div_result);
        }

        
        // Ahora toca ver si los números son pares o no, esto lo obtenemos con el módulo de 2
        if (numero1 %2 == 0 && numero2 %2 == 0) {            
            System.out.println("Los números ingresados " + numero1 + " y " + numero2 + " son números pares ");
        }else if (numero1 %2 == 0 || numero2 %2 != 0) {            
            System.out.println("Solo el número " + numero1 + "es par");
        }else if (numero1 %2 != 0 || numero2 %2 == 0) {            
            System.out.println("Solo el número " + numero2 + "es par");
        }else{
            System.out.println("Los números ingresados " + numero1 + " y " + numero2 + " son números impares");            
        }
        
        
        // Por último, determinamos si uno es mayor que el otro
        if (numero1 < numero2) {
            System.out.println("El número " + numero1 + " es menor al número a " + numero2);
        }else if (numero1 > numero2) {
            System.out.println("El número " + numero1 + " es mayor al número a " + numero2);
        }else{
            System.out.println("Ambos números son iguales");
        }        
    // Terminamos y a cerrar el Scanner
    scanner.close();
    }
}
