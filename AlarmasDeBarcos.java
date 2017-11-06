package barcos;

public class AlarmasDeBarcos {

	public static void main(String[] args) {
		
		Socorro[] bs = new Socorro[3];
		
		BarcoPasajeros barPasajejeros = new BarcoPasajeros("Titanic");
		PortaAviones portAviones = new PortaAviones("Jhon F. Kennedy", 30);
		Pesquero barpesquero = new Pesquero("El Perla Negra", 50);
		
		 bs[0] =barPasajejeros;
		 bs[1] =portAviones;
		 bs[2] =barpesquero;
		 
		 String mensaje[] = {"Nos Hundimos, Tempano de Hielo\n", "Torpedos en Hawai\n", "Capitan Jack Sparrows, Pirata del Caribe\n"};
		 
		 for(int i=0; i<3; i++) {
			 bs[i].mensajeDeSocorro(mensaje[i]);
			}
		 }
	}
