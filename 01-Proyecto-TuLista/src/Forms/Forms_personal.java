package Forms;

import javax.swing.JPanel;

import java.awt.EventQueue;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JRadioButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

import Logica.Avion;
import Logica.Barco;
import Logica.Factory;
import Logica.Persona;
import Logica.Vehiculo;
import Logica.TMPersona;
import Logica.TMVehiculos;

import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;

public class Forms_personal extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField_nombre;
	private JTextField textField_apellido;
	private JTextField textField_nro_hijos;
	private JTextField txtDa;
	private JTextField txtMes;
	private JTextField txtAo;
	private JTextField textField_nombre_vehiculo;
	private JTextField textField_color_vehiculo;
	private JTextField textField_eslora;
	private JTextField textField_manga;
	private JTextField textField_longitud;
	private JTextField textField_cantidad_pasajeros;
	ButtonGroup grupoBtnRadius = new ButtonGroup();
	JComboBox comboBox_departamentos = new JComboBox();
	JPanel panel_tipo_barco = new JPanel();
	JPanel panel_tipo_avion = new JPanel();
	JLabel lbl_persona_guardada = new JLabel("Bienvenidos al apartado; Gestión de personas.");
	private Menu_principal menu_Principal = new Menu_principal();
	private JTable table_persona;
	private JTextField textField_buscador;
	private JTable table_personas_buscador;
	private JTable table_VehiculosAgregados;
	private Factory oFactory = new Factory();
	/**
	 * Create the panel.
	 */
	public Forms_personal() {
		setForeground(new Color(255, 0, 0));
		setLayout(null);
		
		JPanel panel_content = new JPanel();
		panel_content.setBackground(new Color(128, 128, 128));
		panel_content.setBounds(0, 0, 1102, 518);
		add(panel_content);
		panel_content.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 408, 1085, 104);
		scrollPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_content.add(scrollPane);
		
		table_persona = new JTable();
		table_persona.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nombre", "Apellido", "Departamento", "Hijos", "Fecha de Nacimiento", "Vehiculos"
			}
		));
		scrollPane.setViewportView(table_persona);
		
		
		
		JPanel panel_titulo = new JPanel();
		panel_titulo.setBounds(0, 0, 1105, 56);
		panel_titulo.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_titulo.setBackground(new Color(255, 255, 255));
		panel_content.add(panel_titulo);
		panel_titulo.setLayout(null);
		
		JLabel lbl_titulo = new JLabel("Gestión de personas");
		lbl_titulo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				oFactory.calcularVehiculosPorDepartamentos();
			}
		});
		lbl_titulo.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_titulo.setFont(new Font("HP Simplified", Font.BOLD | Font.ITALIC, 28));
		lbl_titulo.setBounds(0, 0, 1105, 56);
		panel_titulo.add(lbl_titulo);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(64, 24, 85, 21);
		panel_titulo.add(btnNewButton);
		
		JPanel panel_datos = new JPanel();
		panel_datos.setBounds(10, 62, 247, 338);
		panel_datos.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_content.add(panel_datos);
		panel_datos.setLayout(null);
		
		JPanel panel_datos_pie_de_pagina = new JPanel();
		panel_datos_pie_de_pagina.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_datos_pie_de_pagina.setBackground(new Color(255, 255, 255));
		panel_datos_pie_de_pagina.setLayout(null);
		panel_datos_pie_de_pagina.setBounds(0, 301, 247, 37);
		panel_datos.add(panel_datos_pie_de_pagina);
		
		JPanel panel_datos_encabezado = new JPanel();
		panel_datos_encabezado.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_datos_encabezado.setBackground(new Color(255, 255, 255));
		panel_datos_encabezado.setBounds(0, 0, 247, 37);
		panel_datos.add(panel_datos_encabezado);
		panel_datos_encabezado.setLayout(null);
		
		JLabel lbl_titulo_de_datos = new JLabel("Ingrese los datos");
		lbl_titulo_de_datos.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_titulo_de_datos.setBounds(0, 0, 247, 37);
		lbl_titulo_de_datos.setFont(new Font("HP Simplified", Font.BOLD | Font.ITALIC, 16));
		panel_datos_encabezado.add(lbl_titulo_de_datos);
		
		JPanel panel_datos_nombre = new JPanel();
		panel_datos_nombre.setBounds(10, 42, 227, 46);
		panel_datos.add(panel_datos_nombre);
		panel_datos_nombre.setLayout(null);
		
		textField_nombre = new JTextField();
		textField_nombre.setBounds(0, 21, 227, 25);
		panel_datos_nombre.add(textField_nombre);
		textField_nombre.setColumns(10);
		
		JLabel lbl_nombre = new JLabel("Nombre");
		lbl_nombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_nombre.setBounds(0, -2, 54, 25);
		panel_datos_nombre.add(lbl_nombre);
		
		JPanel panel_datos_apellido = new JPanel();
		panel_datos_apellido.setLayout(null);
		panel_datos_apellido.setBounds(10, 87, 227, 53);
		panel_datos.add(panel_datos_apellido);
		
		JLabel lbl_apellido = new JLabel("Apellido");
		lbl_apellido.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_apellido.setBounds(0, 10, 54, 15);
		panel_datos_apellido.add(lbl_apellido);
		
		textField_apellido = new JTextField();
		textField_apellido.setBounds(0, 28, 227, 25);
		panel_datos_apellido.add(textField_apellido);
		textField_apellido.setColumns(10);
		
		JPanel panel_datos_departamento = new JPanel();
		panel_datos_departamento.setLayout(null);
		panel_datos_departamento.setBounds(10, 140, 227, 53);
		panel_datos.add(panel_datos_departamento);
		
		JLabel lbl_departamento = new JLabel("Departamento");
		lbl_departamento.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_departamento.setBounds(0, 10, 91, 15);
		panel_datos_departamento.add(lbl_departamento);
		
		
		comboBox_departamentos.setModel(new DefaultComboBoxModel(new String[] {"Elige un departamento", "Artigas", "Canelones", "Cerro Largo", "Colonia", "Durazno", "Flores", "Florida", "Lavalleja", "Maldonado", "Montevideo", "Paysandú", "Río Negro", "Rivera", "Rocha", "Salto", "San José", "Soriano", "Tacuarembó", "Treinta y Tres"}));
		comboBox_departamentos.setBounds(0, 28, 227, 25);
		panel_datos_departamento.add(comboBox_departamentos);
		
		JPanel panel_datos_hijos = new JPanel();
		panel_datos_hijos.setLayout(null);
		panel_datos_hijos.setBounds(10, 194, 227, 53);
		panel_datos.add(panel_datos_hijos);
		
		textField_nro_hijos = new JTextField();
		textField_nro_hijos.setColumns(10);
		textField_nro_hijos.setBounds(0, 28, 227, 25);
		panel_datos_hijos.add(textField_nro_hijos);
		
		JLabel lbl_hijos = new JLabel("Nro. hijos");
		lbl_hijos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_hijos.setBounds(0, 10, 69, 13);
		panel_datos_hijos.add(lbl_hijos);
		
		JPanel panel_datos_fecha_nacimiento = new JPanel();
		panel_datos_fecha_nacimiento.setLayout(null);
		panel_datos_fecha_nacimiento.setBounds(10, 245, 227, 53);
		panel_datos.add(panel_datos_fecha_nacimiento);
		
		txtDa = new JTextField();
		txtDa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtDa.setText(null);
			}
		});
		txtDa.setText("Día");
		txtDa.setColumns(10);
		txtDa.setBounds(21, 28, 47, 25);
		panel_datos_fecha_nacimiento.add(txtDa);
		
		JLabel lbl_Fecha = new JLabel("Fecha de nacimiento");
		lbl_Fecha.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_Fecha.setBounds(21, 10, 136, 13);
		panel_datos_fecha_nacimiento.add(lbl_Fecha);
		
		txtMes = new JTextField();
		txtMes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtMes.setText(null);
			}
		});
		txtMes.setText("Mes");
		txtMes.setColumns(10);
		txtMes.setBounds(88, 28, 47, 25);
		panel_datos_fecha_nacimiento.add(txtMes);
		
		txtAo = new JTextField();
		txtAo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtAo.setText(null);
			}
		});
		txtAo.setText("Año");
		txtAo.setColumns(10);
		txtAo.setBounds(156, 28, 47, 25);
		panel_datos_fecha_nacimiento.add(txtAo);
		
		JLabel lblNewLabel_3 = new JLabel("/");
		lblNewLabel_3.setBounds(78, 28, 45, 25);
		panel_datos_fecha_nacimiento.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_3_1 = new JLabel("/");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_1.setBounds(145, 28, 45, 25);
		panel_datos_fecha_nacimiento.add(lblNewLabel_3_1);
		
		JPanel panel_tienes_vehiculos = new JPanel();
		panel_tienes_vehiculos.setBounds(267, 62, 410, 187);
		panel_tienes_vehiculos.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_content.add(panel_tienes_vehiculos);
		panel_tienes_vehiculos.setLayout(null);
		
		JPanel panel_vehiculo_encabezado = new JPanel();
		panel_vehiculo_encabezado.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_vehiculo_encabezado.setBackground(new Color(255, 255, 255));
		panel_vehiculo_encabezado.setBounds(0, 0, 410, 25);
		panel_tienes_vehiculos.add(panel_vehiculo_encabezado);
		panel_vehiculo_encabezado.setLayout(null);
		
		JLabel lbl_vehiculo_titulo = new JLabel("¿Tiene vehículos?");
		lbl_vehiculo_titulo.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_vehiculo_titulo.setBounds(0, 0, 410, 23);
		lbl_vehiculo_titulo.setFont(new Font("HP Simplified", Font.BOLD | Font.ITALIC, 14));
		panel_vehiculo_encabezado.add(lbl_vehiculo_titulo);
		
		JPanel panel_vehiculo_nombre = new JPanel();
		panel_vehiculo_nombre.setBounds(10, 35, 121, 48);
		panel_tienes_vehiculos.add(panel_vehiculo_nombre);
		panel_vehiculo_nombre.setLayout(null);
		
		JLabel lbl_nombre_vehiculo = new JLabel("Nombre");
		lbl_nombre_vehiculo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_nombre_vehiculo.setBounds(0, 10, 45, 13);
		panel_vehiculo_nombre.add(lbl_nombre_vehiculo);
		
		textField_nombre_vehiculo = new JTextField();
		textField_nombre_vehiculo.setBounds(0, 23, 121, 19);
		panel_vehiculo_nombre.add(textField_nombre_vehiculo);
		textField_nombre_vehiculo.setColumns(10);
		
		JPanel panel_vehiculo_color = new JPanel();
		panel_vehiculo_color.setLayout(null);
		panel_vehiculo_color.setBounds(10, 86, 121, 48);
		panel_tienes_vehiculos.add(panel_vehiculo_color);
		
		JLabel lbl_color = new JLabel("Color");
		lbl_color.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_color.setBounds(0, 10, 45, 13);
		panel_vehiculo_color.add(lbl_color);
		
		textField_color_vehiculo = new JTextField();
		textField_color_vehiculo.setBounds(0, 22, 121, 19);
		panel_vehiculo_color.add(textField_color_vehiculo);
		textField_color_vehiculo.setColumns(10);
		
		JPanel panel_vehiculo_tipo_radius = new JPanel();
		panel_vehiculo_tipo_radius.setLayout(null);
		panel_vehiculo_tipo_radius.setBounds(10, 132, 121, 41);
		panel_tienes_vehiculos.add(panel_vehiculo_tipo_radius);
		
		JLabel lbl_tipo_ve = new JLabel("Tipo de vehículo");
		lbl_tipo_ve.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_tipo_ve.setBounds(0, 0, 105, 21);
		panel_vehiculo_tipo_radius.add(lbl_tipo_ve);
		
		
		JPanel panel_tipo_vehiculo = new JPanel();
		panel_tipo_vehiculo.setBounds(137, 32, 134, 102);
		panel_tienes_vehiculos.add(panel_tipo_vehiculo);
		
		panel_tipo_avion.setBounds(0, 0, 134, 115);
		panel_tipo_avion.setVisible(false);
		panel_tipo_vehiculo.setLayout(null);
		
		
		panel_tipo_barco.setBounds(0, 0, 134, 115);
		panel_tipo_barco.setVisible(false);
		panel_tipo_vehiculo.add(panel_tipo_barco);
		panel_tipo_barco.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("Eslora");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_10.setBounds(10, 10, 45, 13);
		panel_tipo_barco.add(lblNewLabel_10);
		
		textField_eslora = new JTextField();
		textField_eslora.setColumns(10);
		textField_eslora.setBounds(10, 23, 120, 19);
		panel_tipo_barco.add(textField_eslora);
		
		JLabel lblNewLabel_11 = new JLabel("Manga");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_11.setBounds(10, 63, 45, 13);
		panel_tipo_barco.add(lblNewLabel_11);
		
		textField_manga = new JTextField();
		textField_manga.setColumns(10);
		textField_manga.setBounds(10, 75, 120, 19);
		panel_tipo_barco.add(textField_manga);
		panel_tipo_vehiculo.add(panel_tipo_avion);
		panel_tipo_avion.setLayout(null);
		
		textField_longitud = new JTextField();
		textField_longitud.setColumns(10);
		textField_longitud.setBounds(10, 23, 120, 19);
		panel_tipo_avion.add(textField_longitud);
		
		textField_cantidad_pasajeros = new JTextField();
		textField_cantidad_pasajeros.setColumns(10);
		textField_cantidad_pasajeros.setBounds(10, 75, 120, 19);
		panel_tipo_avion.add(textField_cantidad_pasajeros);
		
		JLabel lblNewLabel_9 = new JLabel("Cantidad de pasajeros");
		lblNewLabel_9.setBounds(10, 63, 128, 13);
		panel_tipo_avion.add(lblNewLabel_9);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblNewLabel_8 = new JLabel("Longitud");
		lblNewLabel_8.setBounds(10, 10, 62, 13);
		panel_tipo_avion.add(lblNewLabel_8);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		
		
		
		
		JRadioButton rdbtnNewRadioButton_avion = new JRadioButton("Avión");
		rdbtnNewRadioButton_avion.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnNewRadioButton_avion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				panel_tipo_barco.setVisible(false);
				
				panel_tipo_avion.setSize(236, 115);
				panel_tipo_avion.setLocation(0,0);
				panel_tipo_avion.setVisible(true);
				
				panel_tipo_vehiculo.removeAll();
				panel_tipo_vehiculo.add(panel_tipo_avion, BorderLayout.CENTER);
				panel_tipo_vehiculo.revalidate();
				panel_tipo_vehiculo.repaint();
				
			}
		});
		rdbtnNewRadioButton_avion.setBounds(2, 19, 60, 21);
		panel_vehiculo_tipo_radius.add(rdbtnNewRadioButton_avion);
		
		JRadioButton rdbtnNewRadioButton_barco = new JRadioButton("Barco");
		rdbtnNewRadioButton_barco.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnNewRadioButton_barco.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				panel_tipo_avion.setVisible(false);
				
				panel_tipo_barco.setSize(236, 115);
				panel_tipo_barco.setLocation(0,0);
				panel_tipo_barco.setVisible(true);
				
				panel_tipo_vehiculo.removeAll();
				panel_tipo_vehiculo.add(panel_tipo_barco, BorderLayout.CENTER);
				panel_tipo_vehiculo.revalidate();
				panel_tipo_vehiculo.repaint();

			}
		});
		rdbtnNewRadioButton_barco.setBounds(63, 19, 103, 21);
		panel_vehiculo_tipo_radius.add(rdbtnNewRadioButton_barco);
		
		
		grupoBtnRadius.add(rdbtnNewRadioButton_avion);
		grupoBtnRadius.add(rdbtnNewRadioButton_barco);
		
		JPanel panel_lista_vehiculos = new JPanel();
		panel_lista_vehiculos.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_lista_vehiculos.setBounds(281, 31, 119, 146);
		panel_tienes_vehiculos.add(panel_lista_vehiculos);
		panel_lista_vehiculos.setLayout(null);
		
		JPanel panel_lista_vehiculo = new JPanel();
		panel_lista_vehiculo.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_lista_vehiculo.setBackground(new Color(255, 255, 255));
		panel_lista_vehiculo.setBounds(0, 0, 119, 23);
		panel_lista_vehiculos.add(panel_lista_vehiculo);
		
		JLabel lblNewLabel_12 = new JLabel("Lista de vehículos");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel_lista_vehiculo.add(lblNewLabel_12);
		
		JScrollPane scrollPane_VehiculosAgregados = new JScrollPane();
		scrollPane_VehiculosAgregados.setBounds(0, 22, 119, 124);
		panel_lista_vehiculos.add(scrollPane_VehiculosAgregados);
		
		table_VehiculosAgregados = new JTable();
		scrollPane_VehiculosAgregados.setViewportView(table_VehiculosAgregados);
		
		JPanel panel_guardar_persona = new JPanel();
		panel_guardar_persona.setBounds(267, 254, 410, 146);
		panel_guardar_persona.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_content.add(panel_guardar_persona);
		panel_guardar_persona.setLayout(null);
		
		
		
		JPanel panel_guardar_encabezado = new JPanel();
		panel_guardar_encabezado.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_guardar_encabezado.setBackground(new Color(255, 255, 255));
		panel_guardar_encabezado.setBounds(0, 0, 410, 25);
		panel_guardar_persona.add(panel_guardar_encabezado);
		panel_guardar_encabezado.setLayout(null);
		
		JLabel lblNewLabel_13 = new JLabel("¿Desea guardar la persona?");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setBounds(0, 0, 400, 25);
		lblNewLabel_13.setFont(new Font("HP Simplified", Font.BOLD | Font.ITALIC, 12));
		panel_guardar_encabezado.add(lblNewLabel_13);
		
		JPanel panel_guardar_content = new JPanel();
		panel_guardar_content.setBounds(10, 35, 390, 61);
		panel_guardar_persona.add(panel_guardar_content);
		lbl_persona_guardada.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		
		panel_guardar_content.add(lbl_persona_guardada);
		
		JPanel panel_btns_helpers = new JPanel();
		panel_btns_helpers.setBounds(10, 111, 266, 25);
		panel_guardar_persona.add(panel_btns_helpers);
		panel_btns_helpers.setLayout(null);
		
		
		
		JButton btn_agregar_vehiculo = new JButton("Añadir vehículo");
		btn_agregar_vehiculo.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
		    
			String nombre = textField_nombre_vehiculo.getText();
			String color = textField_color_vehiculo.getText();
			
				if (rdbtnNewRadioButton_avion.isSelected() == true) {
					try {
						int id = oFactory.getListaDeVehiculos().size()+1;
						double longitud = (double)Integer.parseInt(textField_longitud.getText());
						int cantDePasajeros = Integer.parseInt(textField_cantidad_pasajeros.getText());					
						oFactory.agregarAvionLista(id , nombre, color, longitud, cantDePasajeros);
						
						textField_nombre_vehiculo.setText(null);
						textField_color_vehiculo.setText(null);

						textField_longitud.setText(null);
						textField_cantidad_pasajeros.setText(null);
					}catch(Exception error) {
						JOptionPane.showMessageDialog(null, "Error, datos invalidos");
					}
					
					
				}else if (rdbtnNewRadioButton_barco.isSelected() == true) {
					try {
						int id = oFactory.getListaDeVehiculos().size()+1;
						double eslora = (double)Integer.parseInt(textField_eslora.getText());
						double manga = (double)Integer.parseInt(textField_manga.getText());
						oFactory.agregarBarcoLista(id, nombre, color, eslora, manga);
						
						textField_color_vehiculo.setText(null);
						textField_nombre_vehiculo.setText(null);
						textField_eslora.setText(null);
						textField_manga.setText(null);
						
					}catch(Exception error) {
						JOptionPane.showMessageDialog(null, "Error, datos invalidos, vuelva a ingresarlos");
					}
					
				}else {
					
					JOptionPane.showMessageDialog(null, "Error, debe elegir un tipo");
					
				}
				
				TMVehiculos oModel = new TMVehiculos(oFactory.getListaDeVehiculos());
				table_VehiculosAgregados.setModel(oModel);
				
			}
		});
		btn_agregar_vehiculo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_agregar_vehiculo.setBounds(141, 152, 128, 21);
		panel_tienes_vehiculos.add(btn_agregar_vehiculo);
		
		JButton btn_guardar_persona = new JButton("Guardar");
		btn_guardar_persona.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					
					int id = oFactory.nuevoId();
					String nombre = textField_nombre.getText();
					String apellido = textField_apellido.getText();
					String departamento = (String)comboBox_departamentos.getSelectedItem();
					byte nroDeHijos = (byte)Integer.parseInt(textField_nro_hijos.getText());
					int dia = Integer.parseInt(txtDa.getText());
					int mes = Integer.parseInt(txtMes.getText());
					int anio = Integer.parseInt(txtAo.getText());
					LocalDate fechaNacimiento = LocalDate.of(anio,mes,dia);	
					
					oFactory.agregarPersona(id,nombre,apellido,departamento,nroDeHijos,fechaNacimiento,oFactory.getListaDeVehiculos());
					
					TMPersona oModelo = new TMPersona(oFactory.getListaDePersonas());
					table_persona.setModel(oModelo);
					limpiar();
					
					lbl_persona_guardada.setText("Se ha guardado correctamente a "+nombre+", con el ID: "+id);
				}catch(Exception error) {
					JOptionPane.showMessageDialog(null, "Error, datos invalidos, vuelva a ingresarlos");
					limpiar();
				}
				
			}
		});
		btn_guardar_persona.setBackground(new Color(255, 255, 255));
		btn_guardar_persona.setBounds(298, 111, 102, 25);
		panel_guardar_persona.add(btn_guardar_persona);
		btn_guardar_persona.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton btn_LimpiarCampos = new JButton("Limpiar");
		btn_LimpiarCampos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				limpiar();
				TMVehiculos oModel = new TMVehiculos(oFactory.getListaDeVehiculos());
				table_VehiculosAgregados.setModel(oModel);
			}
		});
		btn_LimpiarCampos.setBounds(0, 0, 85, 25);
		panel_btns_helpers.add(btn_LimpiarCampos);
		
		JButton btn_ver_dashboard = new JButton("Ver Dashboard");
		btn_ver_dashboard.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Dashboard oDashboard = new Dashboard(oFactory.getListaDePersonas().size(),oFactory.calcularPromedioDeVehiculosPorPersona());
					oDashboard.setVisible(true);					
				}catch(Exception error) {
					JOptionPane.showMessageDialog(null, "Error, no hay personas ingresadas en el sistema para hacer el análisis");
				}
			}
		});
		btn_ver_dashboard.setBounds(124, 2, 132, 21);
		panel_btns_helpers.add(btn_ver_dashboard);
		
		JPanel panel_buscador = new JPanel();
		panel_buscador.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_buscador.setBounds(687, 62, 408, 336);
		panel_content.add(panel_buscador);
		panel_buscador.setLayout(null);
		
		JPanel panel_titulo_buscador = new JPanel();
		panel_titulo_buscador.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_titulo_buscador.setBackground(new Color(255, 255, 255));
		panel_titulo_buscador.setBounds(0, 0, 408, 32);
		panel_buscador.add(panel_titulo_buscador);
		panel_titulo_buscador.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Buscador por ID");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 408, 32);
		lblNewLabel.setFont(new Font("HP Simplified", Font.BOLD | Font.ITALIC, 14));
		panel_titulo_buscador.add(lblNewLabel);
		
		JPanel panel_texto_buscador = new JPanel();
		panel_texto_buscador.setBounds(10, 37, 388, 71);
		panel_buscador.add(panel_texto_buscador);
		panel_texto_buscador.setLayout(null);
		
		textField_buscador = new JTextField();
		textField_buscador.setBounds(27, 10, 323, 24);
		panel_texto_buscador.add(textField_buscador);
		textField_buscador.setColumns(10);
		
		JButton btn_buscar = new JButton("Buscar");
		btn_buscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Persona oPersona = new Persona();
				try {					
					int buscarPorID = Integer.parseInt(textField_buscador.getText());
					oPersona = oFactory.buscarPersona(buscarPorID - 1);
					
					ArrayList<Persona> nuevaLista = new ArrayList<Persona>();
					nuevaLista.add(oPersona);
					TMPersona oModelo = new TMPersona(nuevaLista);
					table_personas_buscador.setModel(oModelo);				
					
				}catch(Exception error) {
					JOptionPane.showMessageDialog(null, "Error, no existe ese ID");
				}
				
			}
		});
		btn_buscar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_buscar.setBounds(160, 44, 85, 21);
		panel_texto_buscador.add(btn_buscar);
		
		JScrollPane scrollPane_Buscador = new JScrollPane();
		scrollPane_Buscador.setBounds(10, 118, 388, 204);
		panel_buscador.add(scrollPane_Buscador);
		
		table_personas_buscador = new JTable();
		scrollPane_Buscador.setViewportView(table_personas_buscador);
	}
	
	public ArrayList<Vehiculo> clonarLista(ArrayList<Vehiculo> lista){
		ArrayList<Vehiculo> listaNueva = lista;
		
		return listaNueva;
}
	
	public void limpiar() {
		ArrayList<Persona> nuevaLista = new ArrayList<Persona>();
		TMPersona oModelo = new TMPersona(nuevaLista);
		table_personas_buscador.setModel(oModelo);	
		oFactory.borrarListaVehiculos();
		TMVehiculos oModel = new TMVehiculos(oFactory.getListaDeVehiculos());
		table_VehiculosAgregados.setModel(oModel);
		textField_nombre.setText(null);
		textField_apellido.setText(null);
		comboBox_departamentos.setSelectedItem("Elige un departamento");
		textField_nro_hijos.setText(null);
		txtDa.setText("Día");
		txtMes.setText("Mes");
		txtAo.setText("Año");
		textField_buscador.setText(null);
		textField_nombre_vehiculo.setText(null);
		panel_tipo_barco.setVisible(false);
		panel_tipo_avion.setVisible(false);
		textField_color_vehiculo.setText(null);
		textField_eslora.setText(null);
		textField_manga.setText(null);
		textField_longitud.setText(null);
		textField_cantidad_pasajeros.setText(null);
		grupoBtnRadius.clearSelection();
		lbl_persona_guardada.setText("Bienvenidos al apartado; Gestión de personas.");
	}
}
