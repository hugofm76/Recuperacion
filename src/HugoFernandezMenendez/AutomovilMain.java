package HugoFernandezMenendez;


import java.util.Scanner;
import java.util.TreeSet;

public class AutomovilMain extends Automovil {

	public void Value() throws IllegalArgumentException {
		if (this.getFechaFabricacion() < 0 ||this.getFechaFabricacion() >= 2024) {
			 System.out.println("Año de Fabricación inválido");
		} else if (this.getPotencia() <= 0) {
			System.out.println("Potencia inválida");
		}
	}
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Complemente el automovil: Marca, modelo, matricula, fecha de fabricación, motor y potencia");
	
	TreeSet<String> automovil = new TreeSet<>();
	
	
	
	}

}
