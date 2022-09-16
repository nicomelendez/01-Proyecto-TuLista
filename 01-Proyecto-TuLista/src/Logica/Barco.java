package Logica;

public class Barco extends Vehiculo{
	
	private double eslora;
	private double manga;
	
	@Override
	public String toString() {
		return "Barco, eslora:" + eslora + ", manga:" + manga;
	}

	public Barco(int idVehiculo, String nombre, String color, double eslora, double manga) {
		super(idVehiculo, nombre, color);
		this.eslora = eslora;
		this.manga = manga;
	}
	
}
