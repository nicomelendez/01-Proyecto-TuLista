package Forms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class Dashboard extends JFrame {

	private JPanel contentPane;
	private static double promedioV=0;
	private static int cantidadP=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard(cantidadP, promedioV);
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
	
	public Dashboard(int cantidadPersona, double promedioVehiculos) {
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_cantidad_persona = new JLabel("Personas ingresadas: "+cantidadPersona);
		lbl_cantidad_persona.setBounds(38, 55, 146, 13);
		contentPane.add(lbl_cantidad_persona);
		
		JLabel lbl_promedio_vehiculos = new JLabel("Promedio de vehículos por persona: "+promedioVehiculos);
		lbl_promedio_vehiculos.setBounds(38, 93, 318, 13);
		contentPane.add(lbl_promedio_vehiculos);
		
		JLabel lbl_vehiculos_departamento = new JLabel("Vehículos por departamento");
		lbl_vehiculos_departamento.setBounds(38, 132, 361, 13);
		contentPane.add(lbl_vehiculos_departamento);
	}

}
