package HugoFernandezMenendez;

import java.util.Scanner;

public class Ejercicio2 {
	
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escribe la primera cadena");
		String cadena1 = scanner.nextLine();
		
		System.out.println("Escribe la segunda cadena");
		String cadena2 = scanner.nextLine();
		
		String [] palabras = cadena1.split("");
		contarComunes(cadena2, palabras);

	}
	
	public static void cuentaPares(String cadena1, String [] palabras) {
		
		
	}
	
	public static void contarComunes(String cadena2, String [] palabras) {
		System.out.println("La cantidad de números que tienen en común");
		
		for (String palabra : palabras) {
			int conteo = contarPalabras(cadena2, palabra);
			System.out.println("Palabra '" + palabra + "': " + conteo + " veces.");
		}
		
	}
	
	public static int contarPalabras(String cadena, String palabra) {
		int conteo = 0;
		int indice = cadena.indexOf(palabra);
		
		while (indice != -1) {
			conteo++;
			indice = cadena.indexOf(indice + 1);
		}
		
		return conteo;
	}

}
