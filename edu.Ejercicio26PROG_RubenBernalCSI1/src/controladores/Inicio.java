/**
 * Ruben Bernal Ramos, CSI1
 */

package controladores;

import java.util.Scanner;

/**
 * Clase controladora de la aplicación
 * @author rbr - 111124
 *
 */
public class Inicio {

	/**
	 * Metodo de entrada de la aplicacion
	 * rbr - 111124
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variables
		String cadena;
		Scanner sc = new Scanner(System.in);
		
		//Pido al usuario que introduzca una palabra o frase
		System.out.println("Introduzca una palabra o una frase: ");
		cadena = sc.nextLine();
		
		//Invierto la cadena de texto introducida
		cadena = invertir(cadena);
		
		//Muestro el resultado por consola
		System.out.println(cadena);

	}
	
	/**
	 * Método que invertirá la cadena de texto introducida por el usuario
	 * rbr - 111124
	 * @param cadena
	 * @return
	 */
	public static String invertir(String cadena) {
        if (cadena.isEmpty()) {
            return cadena;
        }else {
        	return invertir(cadena.substring(1)) + cadena.charAt(0);
        }
    }

}
