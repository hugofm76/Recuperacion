package HugoFernandezMenendez;

import java.util.Scanner;

public class Automovil {
	
	private String Marca;
	private String modelo;
	private int matricula;
	private double fechaFabricacion;
	private String motor;
	private boolean nombreMotor = true;
	private int potencia;
	
	
	public String getMarca() {
		return Marca;
	}
	
	
	public void setMarca(String marca) {
		Marca = marca;
	}
	
	
	public  String getModelo() {
		return modelo;
	}
	
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getMatricula() {
	
		return matricula;
	}
	
	
	public void setMatricula(int matricula) {
		Scanner scanner = new Scanner(System.in);
		int ma = scanner.nextInt();
		this.matricula = ma;
		
		if (matricula < 0) {
			System.out.println("Matrícula incorrecta");
		}
	}
	
	
	public double getFechaFabricacion() {
		return fechaFabricacion;
	}
	
	
	public void setFechaFabricacion(double fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}
	
	
	public String getMotor() {
		return motor;
	}
	
	
	public void setMotor(String motor) {
		Scanner scanner = new Scanner(System.in);
		String m = scanner.toString();
		this.motor = motor;
		if (motor == "gasolina" || motor == "diesel" ||motor == "hibrido" || motor == "electrico" ) {
			nombreMotor = true;
			}else {
				nombreMotor = false;
			}
	}
	
	
	public int getPotencia() {
		return potencia;
	}
	
	
	public void setPotencia(int potencia) {
		Scanner scanner = new Scanner(System.in);
		int p = scanner.nextInt();
		this.potencia = p;
	} 
	
	
	
	
	

	
}
