package barcos;

public class PortaAviones extends Barco implements Socorro {
	
	private int aviones=20, tripulacion;
	
	public PortaAviones(String nombre, int marinos) {
		super(nombre);
		System.out.println("Se crea el Objeto PortaAviones: "+dameNombre()+"\n");
	}
	
	public void alarma() {
		System.out.println("¡¡¡Marineros a sus puestos!!! de Nombre: "+dameNombre());
	}
	
	public void mensajeDeSocorro(String mensaje) {
		alarma();
		System.out.println("¡¡¡SOS SOS!!! "+mensaje);
	}

}
