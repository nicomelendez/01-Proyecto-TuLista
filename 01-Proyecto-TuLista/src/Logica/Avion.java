package Logica;

public class Avion extends Vehiculo{
	
	@Override
	public String toString() {
		return "Avión, longitud: " + longitud + ", cantPasajeros: " + cantPasajeros;
	}

	private double longitud;
	private int cantPasajeros;
	
	public Avion(int idVehiculo, String nombre, String color, double longitud, int cantPasajeros) {
		
		super(idVehiculo, nombre,color);
		this.longitud = longitud;
		this.cantPasajeros = cantPasajeros;
		
	}
	
	
}
