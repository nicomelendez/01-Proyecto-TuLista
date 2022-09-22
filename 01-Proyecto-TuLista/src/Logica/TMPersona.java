package Logica;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
//Creamos una clase que implementa la TableModel para cargar listas en una tabla
public class TMPersona implements TableModel{
	//Declaramos el tipo de lista que va a utilizar la clase para cargar en una tabla
	private ArrayList<Persona> listaDePersonas;	
	
	//Creamos un constructor que va a recibir la lista para cargar en la tabla
	public TMPersona(ArrayList<Persona> listaDePersonas) {
		
		this.listaDePersonas = listaDePersonas;
		
	}
	
	@Override
	//Declaramos la cantidad de filas que va a tener que sera las mismas que el tamaño de la lista
	public int getRowCount() {
		// TODO Auto-generated method stub
		return listaDePersonas.size();
	}

	@Override
	//Declaramos cuantas columnas va a tener la tabla
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 7;
	}

	@Override
	//Declaramos los nombres que van a tener cada una de las columnas
	public String getColumnName(int columnIndex) {
		// TODO Auto-generated method stub
		String titulo = null;
		//Tomar los nombres de los atributos de persona
		//Segun cual sea el atributo es el titulo que tendra la columna
		switch(columnIndex) {
			case 0:			
				titulo = "ID";
				break;
			
			case 1:
				titulo = "Nombre";
				break;
			
			case 2:
				titulo = "Apellido";
				break;				
			
			case 3:
				titulo = "Departamento";
				break;				
			
			case 4:		
				titulo = "Hijos";
				break;
			
			case 5:		
				titulo = "Fecha de Nacimiento";
				break;
			case 6:		
				titulo = "Vehiculos";
				break;
		}
		return titulo;
	}

	@Override
	//Declaramos de que tipo es el contenido de la tabla 
	//Utilizamos String para visualizar el contenido del objeto
	public Class<?> getColumnClass(int columnIndex) {
		// TODO Auto-generated method stub
		return String.class;
	}

	@Override
	//Aca decimos que todas las columnas sin ser la de ID se pueden editar
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return columnIndex != 0;
	}
	
	@Override
	//Aca le damos el valor a cada una de las columnas
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		//Por cada uno de los elementos de la lista va a poner los valores correspondientes
		Persona p = listaDePersonas.get(rowIndex);
		String valor = null;
		switch(columnIndex) {
			case 0:{				
				valor = Integer.toString(p.getIdPersona());
				break;
			}
			case 1:{
				valor = p.getNombre();
				break;
			}
			case 2:{
				valor = p.getApellido();
				break;				
			}
			case 3:{
				valor = p.getDptoResidencia();
				break;				
			}
			case 4:{				
				valor =  Byte.toString(p.getCantHijos());
				break;
			}
			case 5:{				
				valor = p.getFechaNacimiento().toString();
				break;
			}
			case 6:{				
				valor = p.getListaDeVehiculos().toString();
				break;
			}
		}
		return valor;
	}

	@Override
	//Esto es para editar los valores desde la celda de la tabla
	//Declaramos que dependiendo de la posision de la celda es el dato que vamos a editar
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		Persona p = listaDePersonas.get(rowIndex);
		switch(columnIndex) {
		case 0:{				
			p.setIdPersona((int)aValue);
			break;
		}
		case 1:{
			p.setNombre((String)aValue);
			break;
		}
		case 2:{
			p.setApellido((String)aValue);
			break;				
		}
		case 3:{
			p.setDptoResidencia((String)aValue);
			break;				
		}
		case 4:{				
			p.setCantHijos((byte)aValue);
			break;
		}
		case 5:{				
			p.setFechaNacimiento((LocalDate)aValue);
			break;
		}
	}
	}

	@Override
	public void addTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub
		
	}

}