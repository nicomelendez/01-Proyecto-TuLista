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
	
	//Metodo para agregar persona
	public void agregarPersona(int idPersona, String nombre, String apellido, String dptoResidencia, byte cantHijos,
			LocalDate fechaNacimiento, ArrayList<Vehiculo> listaDeVehiculos) {
		//Creamos una persona con los datos del formulario
		Persona oPersona = new Persona(idPersona,nombre,  apellido, dptoResidencia, cantHijos,fechaNacimiento);
		//Agregamos una persona a la lista mediante un metodo que le agrega sus vehiculos
		listaDePersonas.add(agregarListaDeVehiculosAPersona(oPersona, listaDeVehiculos));
		
	}
	
	//Agrega vehiculos a la persona
	public Persona agregarListaDeVehiculosAPersona(Persona oPersona, ArrayList<Vehiculo> listaDeVehiculos) {
		//Por cada vehiculo existente en la lista lo agrega a la persona
		for(Vehiculo aux:listaDeVehiculos) {
			oPersona.agregarVehiculo(aux);
		}
		//Devuelve la persona con sus vehiculos ingresados
		return oPersona;
	}
	
	//Agrega avion a la lista de vehiculos
	public void agregarAvionLista(int id, String nombre, String color, double longitud, int cantDePasajeros) {
		//Crea un avion nuevo con los datos del formulario
		Avion oAvionNuevo = new Avion (id , nombre, color, longitud, cantDePasajeros);
		//Agrega a la lista el avion nuevo
		listaDeVehiculos.add(oAvionNuevo);
		
	}
	//Agrega barco a la lista de vehiculos
	public void agregarBarcoLista(int id, String nombre, String color, double eslora, double manga) {
		//Crea un barco nuevo con los datos del formulario
		Barco oBarcoNuevo = new Barco (id , nombre, color, eslora, manga);
		//Agrega el barco a la lista
		listaDeVehiculos.add(oBarcoNuevo);
		
	}
	//Busca una persona en la lista mediante su id y lo devuelve
	public Persona buscarPersona(int id) {
		return listaDePersonas.get(id);
	}
	//Crea un id nuevo para la persona
	public int nuevoId() {
		return listaDePersonas.size()+1;
	}
	//Limpia la lista de vehiculos
	public void borrarListaVehiculos() {
		listaDeVehiculos.clear();
	}
	
	//Crea la estadistica de los vehiculos por departamento
	public HashMap<String, Integer> calcularVehiculosPorDepartamentos(){
		//Limpiamos el HashMap para que no haya inconvenientes
		vehiculosPorDepartamento.clear();
		
		Integer numeroDeAutos = 0;
		
		//Recorrer la lista de personas, por cada aux es un item de la lista
		for(Persona aux:listaDePersonas) {
			//Si existe el departamento de la persona "aux"
			if(vehiculosPorDepartamento.get(aux.getDptoResidencia())!=null) {
				//Sumo sus vehiculos a los anteriores que hay en ese departamento
				numeroDeAutos = aux.getListaDeVehiculos().size() + vehiculosPorDepartamento.get(aux.getDptoResidencia()).intValue();
				//Re escribo el valor de autos en ese departamento
				vehiculosPorDepartamento.put(aux.getDptoResidencia(),numeroDeAutos);
				//Vuelvo a 0 la varibale para que no afecte a los demás
				numeroDeAutos=0;
			}else {
				//Si entra acá es porque no existe el departamento y debe crear uno nuevo con los autos del aux
				vehiculosPorDepartamento.put(aux.getDptoResidencia(),aux.getListaDeVehiculos().size());	
			}
		}
		//Finaliza el for y devuelve el HashMap
		return vehiculosPorDepartamento;
	}
	
	public double calcularPromedioDeVehiculosPorPersona() {
		//Conseguimos la cantidad de personas que hay en el sistema
		double cantidadDePersonas = listaDePersonas.size();
		//Declaramos variables de apoyo para el metodo
		double cantidadDeVehiculos = 0;
		double resultado = 0;
		
		//Recorremos la lista de personas que hay en el sistema y vamos sumando los autos
		for(Persona aux:listaDePersonas) {
			cantidadDeVehiculos += aux.getListaDeVehiculos().size();
		}
		//Calculamos el promedio de autos por persona
		resultado = (cantidadDeVehiculos / cantidadDePersonas);
		//Devolvemos el resultado
		return resultado;
	}
}
