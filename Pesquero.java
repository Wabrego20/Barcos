package barcos;

public class Pesquero extends Barco implements Socorro {
	
	private int eslora, pescadores;
	private double potencia;
	
	public Pesquero(String nombre, int tripulacion) {
		super(nombre);
		System.out.println("Se crea el Objeto Pesquero: "+dameNombre()+"\n");
	}
	
	public void alarma() {
		System.out.println("¡¡¡Alarma desde el Pesquero!!! de Nombre: "+dameNombre());
	}
	
	public void mensajeDeSocorro(String mensaje) {
		alarma();
		System.out.println("¡¡¡SOS SOS!!! "+mensaje);
	}

}
