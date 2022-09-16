package Logica;

import java.util.ArrayList;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class TMVehiculos implements TableModel{
	
ArrayList <Vehiculo> listaDeVehiculos;

public TMVehiculos (ArrayList <Vehiculo> listaDeVehiculos) {
	this.listaDeVehiculos = listaDeVehiculos;
}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return listaDeVehiculos.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public String getColumnName(int columnIndex) {
		// TODO Auto-generated method stub
		String titulo = null;
		switch (columnIndex) {
		case 0:
			titulo = "ID";
			break;
		case 1: 
			titulo = "Nombre";
		  break;
		case 2:
			titulo = "Color";
			break;
		}
		return titulo;
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		// TODO Auto-generated method stub
		return String.class;
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return columnIndex != 0;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		Vehiculo v = listaDeVehiculos.get(rowIndex);
		String valor = null;
		switch (columnIndex) {
		case 0: {
			valor = Integer.toString(v.getIdVehiculo());
			break;
		}
		case 1: {
			valor = v.getNombre();
			break;
		}
		case 2: {
			valor = v.getColor();
			break;
		}
		}
		return valor;
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		Vehiculo v = listaDeVehiculos.get(rowIndex);
		switch (columnIndex) {
		case 0: {
			v.setIdVehiculo((int) aValue);
			break;
		}
		case 1: {
			v.setNombre((String) aValue);
			break;
		}
		case 2: {
			v.setColor((String) aValue);
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
