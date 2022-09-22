package Forms;

import java.awt.EventQueue;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

public class Dashboard extends JFrame {

	private JPanel contentPane;
	private static double promedioV=0;
	private static int cantidadP=0;
	private static HashMap<String, Integer> vehiculosPorDepartamento;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard(cantidadP, promedioV, vehiculosPorDepartamento);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public Dashboard(int cantidadPersona, double promedioVehiculos,HashMap<String, Integer> vehiculosPorDepartamento) {
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 643, 303);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_cantidad_persona = new JLabel("Personas ingresadas: "+cantidadPersona);
		lbl_cantidad_persona.setFont(new Font("HP Simplified", Font.BOLD | Font.ITALIC, 17));
		lbl_cantidad_persona.setBounds(38, 55, 570, 20);
		contentPane.add(lbl_cantidad_persona);
		
		JLabel lbl_promedio_vehiculos = new JLabel("Promedio de vehículos por persona: "+promedioVehiculos);
		lbl_promedio_vehiculos.setFont(new Font("HP Simplified", Font.BOLD | Font.ITALIC, 17));
		lbl_promedio_vehiculos.setBounds(38, 78, 552, 20);
		contentPane.add(lbl_promedio_vehiculos);
		
		JLabel lbl_vehiculos_departamento = new JLabel("Vehículos por departamento: "+vehiculosPorDepartamento);
		lbl_vehiculos_departamento.setVerticalAlignment(SwingConstants.TOP);
		lbl_vehiculos_departamento.setFont(new Font("HP Simplified", Font.BOLD | Font.ITALIC, 17));
		lbl_vehiculos_departamento.setBounds(38, 101, 552, 67);
		contentPane.add(lbl_vehiculos_departamento);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 629, 38);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbl_titulo_dashboard = new JLabel("Estadísticas de TuLista");
		lbl_titulo_dashboard.setFont(new Font("HP Simplified", Font.BOLD | Font.ITALIC, 22));
		lbl_titulo_dashboard.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_titulo_dashboard.setBounds(0, 0, 619, 38);
		panel.add(lbl_titulo_dashboard);
	}
}
