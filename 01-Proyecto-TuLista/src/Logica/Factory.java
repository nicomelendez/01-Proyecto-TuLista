package Logica;

import java.time.LocalDate;
import java.util.ArrayList;

public class Factory {
	
	//Atributos de factory
	private ArrayList<Persona> listaDePersonas = new ArrayList<Persona>();
	private ArrayList<Vehiculo> listaDeVehiculos = new ArrayList<Vehiculo>();
	
	//Constructor
	public Factory() {
		
	}
	//Setters y gettrs
	public ArrayList<Persona> getListaDePersonas() {
		return listaDePersonas;
	}

	public void setListaDePersonas(ArrayList<Persona> listaDePersonas) {
		this.listaDePersonas = listaDePersonas;
	}

	public ArrayList<Vehiculo> getListaDeVehiculos() {
		return listaDeVehiculos;
	}

	public void setListaDeVehiculos(ArrayList<Vehiculo> listaDeVehiculos) {
		this.listaDeVehiculos = listaDeVehiculos;
	}
	
	//Metodos
	public boolean agregarPersona(int idPersona, String nombre, String apellido, String dptoResidencia, byte cantHijos,
			LocalDate fechaNacimiento, ArrayList<Vehiculo> listaDeVehiculos) {
		Persona oPersona = new Persona(idPersona,nombre,  apellido, dptoResidencia, cantHijos,fechaNacimiento, listaDeVehiculos);
		
		listaDePersonas.add(oPersona);
		return true;
	}
	
	public boolean agregarVehiculoAunaPerosna(Persona oPersona, ArrayList<Vehiculo> listaDeVehiculos) {
		if(oPersona!=null) {
			oPersona.agregarListaVehiculo(listaDeVehiculos);
			return true;
		}else {
			return false;
		}
	}
	
	public boolean agregarVehiculoLista(Vehiculo oVehiculo) {
		if(oVehiculo != null) {
			listaDeVehiculos.add(oVehiculo);
			return true;
		}else {
			return false;
		}
	}
	
	public Persona buscarPersona(int id) {
		return listaDePersonas.get(id);
	}
	
	public int nuevoId() {
		return listaDePersonas.size()+1;
	}
	
	public void borrarLista() {
		listaDeVehiculos.clear();
	}
	
}
