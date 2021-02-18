package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import javax.swing.border.LineBorder;

import claseHijos.Encargado;
import claseHijos.EncargadoArray;
import claseHijos.Votante;
import claseHijos.VotanteArray;

import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormLoginVotante extends JFrame implements MouseListener, FocusListener, ActionListener {

	private Image img_logo= new ImageIcon(FormLoginVotante.class.getResource("/resources/fondo.jpg")).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
	private Image img_username= new ImageIcon(FormLoginVotante.class.getResource("/resources/username.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
	private Image img_password= new ImageIcon(FormLoginVotante.class.getResource("/resources/password.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
	private Image img_login= new ImageIcon(FormLoginVotante.class.getResource("/resources/login.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
	private Image img_salir= new ImageIcon(FormLoginVotante.class.getResource("/resources/exit.png")).getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
	private Image img_regresar= new ImageIcon(FormLoginVotante.class.getResource("/resources/regresar.png")).getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
	
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblUsuario;
	private JTextField textField;
	private JLabel lblContrasea;
	private JTextField textField_1;
	private JButton btnNewButton;
	private JLabel lblUsuario_1;
	private JTextField textField_2;
	private JLabel lblContrasea_1;
	private JTextField textField_3;
	private JButton btnNewButton_1;
	private JPanel panel_1;
	private JPanel panel_2;
	private JTextField textUsername;
	private JPasswordField textPassword;
	private JLabel lblLogo;
	private JLabel labelUsername;
	private JLabel labelPassword;
	private JPanel panel_3;
	private JLabel lblLogin;
	private JLabel lblIconLogin;
	private JButton buttonSalir;
	private JButton buttonRegresar;
	private JLabel labelError;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormLoginVotante frame = new FormLoginVotante();
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
	
	public FormLoginVotante() {
		setUndecorated(true);
		

        
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 128), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(86, 155, 218, 46);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		textUsername = new JTextField();
		textUsername.addFocusListener(this);
		textUsername.setBorder(null);
		textUsername.setText("Username");
		textUsername.setBounds(10, 5, 124, 30);
		panel_1.add(textUsername);
		textUsername.setColumns(10);
		textUsername.addKeyListener(new KeyListener() {
	        
	        public void keyTyped(KeyEvent e) {

	        }
	        public void keyPressed(KeyEvent e) {
	            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
	                IniciarSesion(); //MÃ©todo que tienes que crearte
	            }
	        }
	        public void keyReleased(KeyEvent e) {

	        }
	    });
		
		labelUsername = new JLabel("");
		labelUsername.setBounds(155, 0, 63, 46);
		panel_1.add(labelUsername);
		labelUsername.setIcon(new ImageIcon(img_username));
		
		panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(86, 212, 218, 46);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		textPassword = new JPasswordField();
		textPassword.addFocusListener(this);
		textPassword.setBorder(null);
		textPassword.setEchoChar((char)0);
		textPassword.setText("Password");
		textPassword.setBounds(10, 11, 115, 24);
		panel_2.add(textPassword);
		textPassword.addKeyListener(new KeyListener() {
		        
		        public void keyTyped(KeyEvent e) {

		        }
		        public void keyPressed(KeyEvent e) {
		            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
		                IniciarSesion(); //MÃ©todo que tienes que crearte
		            }
		        }
		        public void keyReleased(KeyEvent e) {

		        }
		    });
		
		labelPassword = new JLabel("");
		labelPassword.setBounds(155, 0, 63, 40);
		panel_2.add(labelPassword);
		labelPassword.setIcon(new ImageIcon(img_password));

		
		lblLogo = new JLabel("");
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogo.setBounds(86, 24, 226, 108);
		contentPane.add(lblLogo);
		lblLogo.setIcon(new ImageIcon(img_logo));
		
		panel_3 = new JPanel();
		panel_3.addMouseListener(this);
		panel_3.setBackground(new Color(128, 128, 128));
		panel_3.setBounds(86, 310, 218, 46);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		lblLogin = new JLabel("LOGIN");
		lblLogin.setForeground(new Color(255, 255, 255));
		lblLogin.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblLogin.setBounds(73, 11, 69, 18);
		panel_3.add(lblLogin);
		
		lblIconLogin = new JLabel("");
		lblIconLogin.setBounds(0, 0, 58, 40);
		panel_3.add(lblIconLogin);
		setLocationRelativeTo(null);
		lblIconLogin.setIcon(new ImageIcon(img_login));
		
		buttonSalir = new JButton("");
		buttonSalir.addActionListener(this);
		buttonSalir.setBounds(304, 367, 45, 51);
		contentPane.add(buttonSalir);
		buttonSalir.setIcon(new ImageIcon(img_salir));
		
		buttonRegresar = new JButton("");
		buttonRegresar.addActionListener(this);
		buttonRegresar.setBounds(55, 367, 50, 51);
		contentPane.add(buttonRegresar);
		buttonRegresar.setIcon(new ImageIcon(img_regresar));
		
		labelError = new JLabel("");
		labelError.setHorizontalTextPosition(SwingConstants.CENTER);
		labelError.setHorizontalAlignment(SwingConstants.CENTER);
		labelError.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		labelError.setForeground(new Color(255, 0, 0));
		labelError.setBounds(86, 269, 226, 30);
		contentPane.add(labelError);
		
//		
	}
		
	
	public void mouseClicked(MouseEvent arg0) {
		if (arg0.getSource() == panel_3) {
			do_panel_3_mouseClicked(arg0);
		}
	}
	public void mouseEntered(MouseEvent arg0) {
	}
	public void mouseExited(MouseEvent arg0) {
	}
	public void mousePressed(MouseEvent arg0) {
	}
	public void mouseReleased(MouseEvent arg0) {
	}
	protected void do_panel_3_mouseClicked(MouseEvent arg0) {
		IniciarSesion();
		
	}
	public void focusGained(FocusEvent e) {
		if (e.getSource() == textUsername) {
			do_textUsername_focusGained(e);
		}
		if (e.getSource() == textPassword) {
			do_textPassword_focusGained(e);
		}
	}
	protected void do_textUsername_focusGained(FocusEvent e) {
		if(textUsername.getText().equals("Username")){
			textUsername.setText("");
		}
		else{
			textUsername.selectAll();
		}
	}
	protected void do_textPassword_focusGained(FocusEvent arg0) {
		if (textPassword.getText().equals("Password")){
			textPassword.setEchoChar('●');
			textPassword.setText("");
		}
		else{
			textPassword.selectAll();
		}
	}
	public void focusLost(FocusEvent e) {
		if (e.getSource() == textUsername) {
			do_textUsername_focusLost(e);
		}
		if (e.getSource() == textPassword) {
			do_textPassword_focusLost(e);
		}
	}
	protected void do_textUsername_focusLost(FocusEvent e) {
		if(textUsername.getText().equals("")){
			textUsername.setText("Username");
		}
	}
	protected void do_textPassword_focusLost(FocusEvent e) {
		if(textPassword.getText().equals("")){
			textPassword.setText("Password");
			textPassword.setEchoChar((char)0);
		}
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == buttonRegresar) {
			do_buttonRegresar_actionPerformed(arg0);
		}
		if (arg0.getSource() == buttonSalir) {
			do_button_actionPerformed(arg0);
		}
	}
	protected void do_button_actionPerformed(ActionEvent arg0) {
		if (JOptionPane.showConfirmDialog(null, "Deseas Salir de la AplicaciÃ³n?","Confirmar",JOptionPane.YES_NO_OPTION)==0){
			FormLoginVotante.this.dispose();
		}
	}
	protected void do_buttonRegresar_actionPerformed(ActionEvent arg0) {
		FormInicio formInicio = new FormInicio();
		formInicio.setVisible(true);
		this.setVisible(false);
	}
	public void IniciarSesion(){
		VotanteArray votantes = new VotanteArray();
		if  (textUsername.getText().equals("") || textUsername.getText().equals("Username")||
				textPassword.getText().equals("")||textPassword.getText().equals("Password")){
			labelError.setText("Ingrese el usuario y contraseÃ±a");
		}
		else{
			try{
				Votante votante = votantes.buscar(textUsername.getText());
				String username = votante.getUsuario_votante();
				String password = votante.getClave_votante();
					
						if(textUsername.getText().equals(username) && textPassword.getText().equals(password)){
							DatosVoto voto = new DatosVoto();
							voto.setVisible(true);
							this.setVisible(false);
						}
						else{
							labelError.setText("ContraseÃ±a Incorrecta");
						}
					}
					
			
			catch(Exception e){
				labelError.setText("Usuario no existe");
			}
		}	
		}
		
	}

