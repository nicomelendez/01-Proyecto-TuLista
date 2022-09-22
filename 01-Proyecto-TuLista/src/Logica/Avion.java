package Logica;

public class Avion extends Vehiculo{
	
	private double longitud;
	private int cantPasajeros;
	
	public Avion(int idVehiculo, String nombre, String color, double longitud, int cantPasajeros) {
		
		super(idVehiculo, nombre,color);
		this.longitud = longitud;
		this.cantPasajeros = cantPasajeros;
		
	}
	
	@Override
	public String toString() {
		return "Avión";
	}

	
}
