package barcos;

public class Barco {
	
	private String nombre;
	
	public Barco(String nombre) {
		this.nombre=nombre;
		System.out.println("Dentro del Constructor del Barco con el nombre: " + nombre);
	}
	
	public String dameNombre() {
		return nombre;
	}
	
}
