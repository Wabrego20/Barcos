package barcos;

public class BarcoPasajeros extends Barco implements Socorro{

	private int eslora, numeroDeCamas;
	
	public BarcoPasajeros(String nombre) {
		super(nombre);
		System.out.println("Se crea el Objeto BarcoPasajeros: "+dameNombre()+"\n");
		}
	
	public void alarma() {
		System.out.println("S.O.S desde el barco de Pasajeros de Nombre: "+dameNombre());
	}
	
	public void mensajeDeSocorro(String mensaje) {
		alarma();
		System.out.println("¡¡¡SOS SOS!!! "+mensaje);
	}

}
