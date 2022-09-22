package Logica;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Factory {
	
	//Atributos de factory
	private ArrayList<Persona> listaDePersonas = new ArrayList<Persona>();
	private ArrayList<Vehiculo> listaDeVehiculos = new ArrayList<Vehiculo>();
	private HashMap<String, Integer> vehiculosPorDepartamento = new HashMap<String, Integer>();
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
	public void agregarPersona(int idPersona, String nombre, String apellido, String dptoResidencia, byte cantHijos,
			LocalDate fechaNacimiento, ArrayList<Vehiculo> listaDeVehiculos) {
		Persona oPersona = new Persona(idPersona,nombre,  apellido, dptoResidencia, cantHijos,fechaNacimiento);
		listaDePersonas.add(agregarListaDeVehiculosAPersona(oPersona, listaDeVehiculos));
		
	}
	
	public void agregarVehiculoAunaPerosna(Persona oPersona, ArrayList<Vehiculo> listaDeVehiculos) {
		
		for(Vehiculo aux:listaDeVehiculos) {
			oPersona.agregarVehiculo(aux);
		}
		
		this.listaDeVehiculos.clear();
		
	}
	
	public void agregarAvionLista(int id, String nombre, String color, double longitud, int cantDePasajeros) {
		Avion oAvionNuevo = new Avion (id , nombre, color, longitud, cantDePasajeros);
		listaDeVehiculos.add(oAvionNuevo);
		
	}
	
	public void agregarBarcoLista(int id, String nombre, String color, double eslora, double manga) {
		
		Barco oBarcoNuevo = new Barco (id , nombre, color, eslora, manga);
		listaDeVehiculos.add(oBarcoNuevo);
		
	}
	
	public Persona buscarPersona(int id) {
		return listaDePersonas.get(id);
	}
	
	public int nuevoId() {
		return listaDePersonas.size()+1;
	}
	
	public void borrarListaVehiculos() {
		listaDeVehiculos.clear();
	}
	
	public Persona agregarListaDeVehiculosAPersona(Persona oPersona, ArrayList<Vehiculo> listaNueva) {
		
		for(Vehiculo aux:listaNueva) {
			oPersona.agregarVehiculo(aux);
		}
		
		return oPersona;
	}
	
	public HashMap<String, Integer> calcularVehiculosPorDepartamentos(){
		vehiculosPorDepartamento.clear();
		Integer numeroDeAutos = 0;
		
		for(Persona aux:listaDePersonas) {
		
			if(vehiculosPorDepartamento.get(aux.getDptoResidencia())!=null) {
				numeroDeAutos = aux.getListaDeVehiculos().size() + vehiculosPorDepartamento.get(aux.getDptoResidencia()).intValue();
				
				vehiculosPorDepartamento.put(aux.getDptoResidencia(),numeroDeAutos);		
				numeroDeAutos=0;
			}else {
				vehiculosPorDepartamento.put(aux.getDptoResidencia(),aux.getListaDeVehiculos().size());	
			}
		}
		System.out.println(vehiculosPorDepartamento);
		return vehiculosPorDepartamento;
	}
	
	public double calcularPromedioDeVehiculosPorPersona() {
		
		int cantidadDePersonas = listaDePersonas.size();
		int cantidadDeVehiculos=0;
		double resultado = 0;
		
		for(Persona aux:listaDePersonas) {
			cantidadDeVehiculos += aux.getListaDeVehiculos().size();
		}
		
		resultado = cantidadDeVehiculos / cantidadDePersonas;
		
		return resultado;
	}
}
