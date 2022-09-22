package Logica;

import java.time.LocalDate;
import java.util.ArrayList;

public class Persona {
	
	private int idPersona;
	private String nombre;
	private String apellido;
	private String dptoResidencia;
	private byte cantHijos;
	private LocalDate fechaNacimiento;	
	private ArrayList<Vehiculo> listaDeVehiculos = new ArrayList<Vehiculo>();
	
	
	public Persona(int idPersona, String nombre, String apellido, String dptoResidencia, byte cantHijos,
			LocalDate fechaNacimiento, ArrayList<Vehiculo> listaDeVehiculos) {
		super();
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dptoResidencia = dptoResidencia;
		this.cantHijos = cantHijos;
		this.fechaNacimiento = fechaNacimiento;
		this.listaDeVehiculos = listaDeVehiculos;
	}

	
	
	

	public Persona() {
		
	}

	public Persona(int idPersona, String nombre, String apellido, String dptoResidencia, byte cantHijos,
			LocalDate fechaNacimiento) {
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dptoResidencia = dptoResidencia;
		this.cantHijos = cantHijos;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public void agregarVehiculo(Vehiculo oVehiculo) {
		listaDeVehiculos.add(oVehiculo);
	}
	
	public void agregarListaVehiculo(ArrayList<Vehiculo> listaDeVehiculos) {
		this.listaDeVehiculos = listaDeVehiculos;
	}
		public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDptoResidencia() {
		return dptoResidencia;
	}

	public void setDptoResidencia(String dptoResidencia) {
		this.dptoResidencia = dptoResidencia;
	}

	public byte getCantHijos() {
		return cantHijos;
	}

	public void setCantHijos(byte cantHijos) {
		this.cantHijos = cantHijos;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public ArrayList<Vehiculo> getListaDeVehiculos() {
		return listaDeVehiculos;
	}

	public void setListaDeVehiculos(ArrayList<Vehiculo> listaDeVehiculos) {
		this.listaDeVehiculos = listaDeVehiculos;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", dptoResidencia="
				+ dptoResidencia + ", cantHijos=" + cantHijos + ", fechaNacimiento=" + fechaNacimiento
				+ ", listaDeVehiculos=" + listaDeVehiculos + "]";
	}
	
	
	
	
}
