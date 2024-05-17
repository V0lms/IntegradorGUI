package visual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Inicio extends JFrame {

	private static final long serialVersionUID = 1L;
	protected static boolean iniciarSesion = false;
	private JPanel pnlMain,Login;
	private JTextField txtUsuario,txtNameUsuario;
	private JPasswordField passwContrasenya;
	private JButton btnIniciarSesion, btnVolver, btnUsuario, btnInvitado, btnPreguntasFrecuentes;
	private JTextPane txtpnSuperempresa, txtpnContrasenya, txtpnSuperempresa_1, txtpnUsuario ;
	private JPanel WELCOME, LOGIN;
	private JPanel QyA;
	private JTextField txtquienPuedeAcceder;
	private JTextField txtComoInvitadoTodo;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
					frame.setVisible(true);
					
					if(iniciarSesion==true) {
						frame.setVisible(false);
					}else {
						//apagar iniciar sesion
					}
					
				} catch (Exception e) {
					System.out.println(e.getMessage()+"Error al crear el frame de bienvenida");
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Inicio() {
		setBackground(new Color(204, 0, 51));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 420);
		pnlMain = new JPanel();
		pnlMain.setBackground(new Color(255, 255, 255));
		pnlMain.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(pnlMain);
		pnlMain.setLayout(null);

		//------------------------------------------------------------
		
		WELCOME = new JPanel();
		WELCOME.setBackground(new Color(255, 255, 255));
		WELCOME.setBounds(0, 0, 569, 391);
		pnlMain.add(WELCOME);
		WELCOME.setLayout(null);
		
		QyA = new JPanel();
		QyA.setBackground(new Color(255, 255, 255));
		QyA.setBounds(0, 0, 569, 391);
		pnlMain.add(QyA);
		QyA.setLayout(null);
		
		txtquienPuedeAcceder = new JTextField();
		txtquienPuedeAcceder.setEditable(false);
		txtquienPuedeAcceder.setForeground(new Color(100, 10, 10));
		txtquienPuedeAcceder.setFont(new Font("DejaVu Sans", Font.BOLD, 15));
		txtquienPuedeAcceder.setText("¿Quien puede acceder?");
		txtquienPuedeAcceder.setBounds(29, 26, 230, 38);
		QyA.add(txtquienPuedeAcceder);
		txtquienPuedeAcceder.setColumns(10);
		
		txtComoInvitadoTodo = new JTextField();
		txtComoInvitadoTodo.setText("Como invitado todo el mundo(si lo añadimos), \n"
								+ "pero para tener usuario tienes que ser un superheroe \n"
								+ "reconocido por la asociacion y/o un gobierno inscrito al programa");
		txtComoInvitadoTodo.setEditable(false);
		txtComoInvitadoTodo.setBounds(29, 62, 516, 76);
		QyA.add(txtComoInvitadoTodo);
		txtComoInvitadoTodo.setColumns(10);
		
		LOGIN = new JPanel();
		LOGIN.setLayout(null);
		LOGIN.setBackground(Color.WHITE);
		LOGIN.setBounds(0, 0, 569, 391);
		pnlMain.add(LOGIN);
		LOGIN.setVisible(false);
		
		
		//------------------------------------------------------------
		
		txtpnSuperempresa_1 = new JTextPane();
		txtpnSuperempresa_1.setText("SUPEREMPRESA");
		txtpnSuperempresa_1.setForeground(Color.RED);
		txtpnSuperempresa_1.setFont(new Font("DejaVu Sans", Font.BOLD, 30));
		txtpnSuperempresa_1.setBounds(28, 28, 294, 42);
		LOGIN.add(txtpnSuperempresa_1);
		
		txtNameUsuario = new JTextField();
		txtNameUsuario.setBounds(28, 110, 140, 23);
		LOGIN.add(txtNameUsuario);
		txtNameUsuario.setColumns(10);
		
		txtpnUsuario = new JTextPane();
		txtpnUsuario.setForeground(new Color(153, 0, 51));
		txtpnUsuario.setFont(new Font("DejaVu Sans", Font.BOLD, 14));
		txtpnUsuario.setText("Usuario");
		txtpnUsuario.setBounds(28, 85, 140, 23);
		txtpnUsuario.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				updateButton();
			}
		});
		LOGIN.add(txtpnUsuario);
		
		txtpnContrasenya = new JTextPane();
		txtpnContrasenya.setText("Contraseña");
		txtpnContrasenya.setForeground(new Color(153, 0, 51));
		txtpnContrasenya.setFont(new Font("DejaVu Sans", Font.BOLD, 14));
		txtpnContrasenya.setBounds(28, 155, 140, 23);
		LOGIN.add(txtpnContrasenya);
		
		passwContrasenya = new JPasswordField();
		passwContrasenya.setBounds(28, 180, 140, 21);
		passwContrasenya.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				updateButton();
			}
		});
		LOGIN.add(passwContrasenya);
		
		btnIniciarSesion = new JButton("INICIAR SESION");
		btnIniciarSesion.setEnabled(false);
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnIniciarSesion.setBackground(new Color(204, 0, 51));
		btnIniciarSesion.setForeground(new Color(255, 255, 255));
		btnIniciarSesion.setBounds(28, 219, 140, 49);
		LOGIN.add(btnIniciarSesion);
		
		btnVolver = new JButton("VOLVER");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LOGIN.setVisible(false);
				WELCOME.setVisible(true);
			}
		});
		btnVolver.setBounds(28, 280, 140, 27);
		LOGIN.add(btnVolver);
		
		//PANELES-----------------------------------------------------
		
		
		btnUsuario = new JButton("INICIAR COMO INVITADO");
		btnUsuario.setBounds(51, 162, 192, 42);
		WELCOME.add(btnUsuario);
		
		btnInvitado = new JButton("INICIAR SESION");
		btnInvitado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LOGIN.setVisible(true);
				WELCOME.setVisible(false);
				
			}
		});
		btnInvitado.setBounds(51, 108, 192, 42);
		WELCOME.add(btnInvitado);
		
		txtpnSuperempresa = new JTextPane();
		txtpnSuperempresa.setEditable(false);
		txtpnSuperempresa.setBackground(Color.LIGHT_GRAY);
		txtpnSuperempresa.setBounds(28, 28, 294, 42);
		WELCOME.add(txtpnSuperempresa);
		txtpnSuperempresa.setFont(new Font("DejaVu Sans", Font.BOLD, 30));
		txtpnSuperempresa.setForeground(new Color(255, 0, 0));
		txtpnSuperempresa.setText("SUPEREMPRESA");
		
		btnPreguntasFrecuentes = new JButton("PREGUNTAS FRECUENTES");
		btnPreguntasFrecuentes.setBounds(51, 218, 192, 42);
		WELCOME.add(btnPreguntasFrecuentes);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Inicio.class.getResource("/img/login.jpg")));
		lblNewLabel.setBounds(0, 0, 569, 391);
		WELCOME.add(lblNewLabel);
		btnPreguntasFrecuentes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		

	}

	private void updateButton() {
		try {
			if(passwContrasenya.getPassword().length > 0 && txtNameUsuario.getText().length() > 0) {
				btnIniciarSesion.setEnabled(true);
			}else {
				btnIniciarSesion.setEnabled(false);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage()+"No se puede actualizar el boton");
		}	
	}
}
