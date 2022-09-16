package Forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.border.LineBorder;

import Logica.Persona;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class Menu_principal {

	private JFrame frmTulista;
	private Imagen img = new Imagen();	
	private ArrayList <Persona> listaDePersonas = new ArrayList <Persona>();
	JPanel panel_forms = new JPanel();
	
	public ArrayList<Persona> getListaDePersonas() {
		return listaDePersonas;
	}

	public void setListaDePersonas(ArrayList<Persona> listaDePersonas) {
		this.listaDePersonas = listaDePersonas;
	}
	
	public void agregarPersona(Persona oPersona) {
		listaDePersonas.add(oPersona);
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Menu_principal window = new Menu_principal();
					window.frmTulista.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menu_principal() {
		initialize();
}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
	   
		frmTulista = new JFrame();
		frmTulista.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\nicoc\\OneDrive\\Escritorio\\Logo-tu-lista.png"));
		frmTulista.setTitle("TuLista");
		frmTulista.setResizable(false);
		frmTulista.setBounds(100, 100, 1292, 559);
		frmTulista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTulista.getContentPane().setLayout(null);
		panel_forms.setBackground(new Color(128, 128, 128));
		
				
		
		panel_forms.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_forms.setBounds(173, 0, 1105, 522);
		frmTulista.getContentPane().add(panel_forms);
		panel_forms.setLayout(null);
		
		JPanel panel_titulo_principal = new JPanel();
		panel_titulo_principal.setBackground(new Color(128, 128, 128));
		panel_titulo_principal.setBounds(0, 0, 1105, 75);
		panel_forms.add(panel_titulo_principal);
		
		JPanel panel_logo_tipo = new JPanel();
		panel_logo_tipo.setBounds(247, 117, 608, 314);
		panel_logo_tipo.setLayout(null);
		panel_logo_tipo.setSize(608, 314);
		panel_forms.add(panel_logo_tipo);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 32, 608, 57);
		panel_logo_tipo.add(panel);
		panel.setLayout(null);
		
		JLabel lbl_titulo_principal = new JLabel("¡Bienvendio a TuLista!");
		lbl_titulo_principal.setBounds(157, 5, 311, 32);
		lbl_titulo_principal.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 26));
		panel.add(lbl_titulo_principal);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 99, 608, 75);
		panel_logo_tipo.add(panel_1);
		
		JLabel lbl_titulo_secundario = new JLabel("Gestióna tus clientes de barcos y aviones de una manera pratica y eficaz.");
		lbl_titulo_secundario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_1.add(lbl_titulo_secundario);
		img.setBounds(234, 241, 152, 63);
		panel_logo_tipo.add(img);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 215, 608, 27);
		panel_logo_tipo.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Desarrollado por");
		lblNewLabel.setBounds(252, 5, 138, 17);
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 14));
		panel_2.add(lblNewLabel);
		
		    
		
		JPanel panel_nav_lateral = new JPanel();
		panel_nav_lateral.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_nav_lateral.setBackground(new Color(192, 192, 192));
		panel_nav_lateral.setBounds(0, 0, 172, 522);
		frmTulista.getContentPane().add(panel_nav_lateral);
		panel_nav_lateral.setLayout(null);
		
		JPanel panel_nav_imagen = new JPanel();
		panel_nav_imagen.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_nav_imagen.setBackground(new Color(192, 192, 192));
		panel_nav_imagen.repaint();
		panel_nav_imagen.setBounds(0, 0, 172, 83);
		panel_nav_lateral.add(panel_nav_imagen);
		panel_nav_imagen.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("TuLista");
		lblNewLabel_1.setBounds(20, 10, 152, 63);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 35));
		panel_nav_imagen.add(lblNewLabel_1);
		
		JPanel panel_btn_personal = new JPanel();
		panel_btn_personal.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_btn_personal.setBackground(new Color(192, 192, 192));
		panel_btn_personal.setBounds(0, 80, 172, 62);
		panel_nav_lateral.add(panel_btn_personal);
		panel_btn_personal.setLayout(null);
		
		
		
		
		JButton btn_personal_forms = new JButton("Gestión de personas");
		btn_personal_forms.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Forms_personal forms_personal = new Forms_personal();
				forms_personal.setSize(1105, 522);
				forms_personal.setLocation(0,0);
				
				panel_forms.removeAll();
				panel_forms.add(forms_personal, BorderLayout.CENTER);
				panel_forms.revalidate();
				panel_forms.repaint();
			}
			
		});
		btn_personal_forms.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_personal_forms.setBounds(10, 10, 152, 42);
		panel_btn_personal.add(btn_personal_forms);
		
	}
}
