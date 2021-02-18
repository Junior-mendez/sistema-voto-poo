package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Window.Type;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

public class Principal extends JFrame implements ActionListener {
	
	private Image img_voto_elec= new ImageIcon(FormLogin.class.getResource("/resources/voto_elec.png")).getImage().getScaledInstance(250, 100, Image.SCALE_SMOOTH);
	private Image img_salir= new ImageIcon(FormLogin.class.getResource("/resources/exit.png")).getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH);
	private Image img_inicio= new ImageIcon(FormLogin.class.getResource("/resources/home.png")).getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH);
	private Image img_partido= new ImageIcon(FormLogin.class.getResource("/resources/partido.png")).getImage().getScaledInstance(70, 54, Image.SCALE_SMOOTH);
	private Image img_candidato= new ImageIcon(FormLogin.class.getResource("/resources/candidato.png")).getImage().getScaledInstance(70, 54, Image.SCALE_SMOOTH);
	private Image img_encargado= new ImageIcon(FormLogin.class.getResource("/resources/username.png")).getImage().getScaledInstance(70, 54, Image.SCALE_SMOOTH);
	private Image img_votante= new ImageIcon(FormLogin.class.getResource("/resources/votante.png")).getImage().getScaledInstance(70, 54, Image.SCALE_SMOOTH);
	
	private JPanel contentPane;
	private JButton btnCrearEncargado;
	private JButton btnCrearVotante;
	private JButton btnCrearCandidato;
	private JLabel lblNewLabel;
	private JButton btnSalir;
	private JButton btnInicio;
	private JButton btnCrearPartido;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {	
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setBackground(new Color(255, 255, 255));
		setTitle("SISTEMA DE VOTO ELECTRONICO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		btnCrearCandidato = new JButton("CANDIDATO");
		btnCrearCandidato.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnCrearCandidato.setFont(new Font("Arial Black", Font.PLAIN, 16));
		btnCrearCandidato.addActionListener(this);
		btnCrearCandidato.setBackground(Color.WHITE);
		btnCrearCandidato.setBounds(78, 178, 218, 54);
		contentPane.add(btnCrearCandidato);
		btnCrearCandidato.setIcon(new ImageIcon(img_candidato));
		
		JLabel lblMenuPrincipal = new JLabel("");
		lblMenuPrincipal.setForeground(new Color(255, 255, 255));
		lblMenuPrincipal.setOpaque(true);
		lblMenuPrincipal.setBackground(new Color(0, 0, 128));
		lblMenuPrincipal.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuPrincipal.setFont(new Font("Consolas", Font.PLAIN, 23));
		lblMenuPrincipal.setBounds(68, 11, 242, 91);
		contentPane.add(lblMenuPrincipal);
		lblMenuPrincipal.setIcon(new ImageIcon(img_voto_elec));
		
		btnCrearEncargado = new JButton("ENCARGADO");
		btnCrearEncargado.setFont(new Font("Arial Black", Font.PLAIN, 16));
		btnCrearEncargado.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnCrearEncargado.addActionListener(this);
		btnCrearEncargado.setBackground(Color.WHITE);
		btnCrearEncargado.setBounds(78, 243, 218, 54);
		contentPane.add(btnCrearEncargado);
		btnCrearEncargado.setIcon(new ImageIcon(img_encargado));
		
		btnCrearVotante = new JButton("VOTANTE");
		btnCrearVotante.setFont(new Font("Arial Black", Font.PLAIN, 16));
		btnCrearVotante.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnCrearVotante.addActionListener(this);
		btnCrearVotante.setBackground(Color.WHITE);
		btnCrearVotante.setBounds(78, 308, 218, 54);
		contentPane.add(btnCrearVotante);
		btnCrearVotante.setIcon(new ImageIcon(img_votante));
		
		btnSalir = new JButton("");
		btnSalir.setBackground(new Color(255, 255, 255));
		btnSalir.addActionListener(this);
		btnSalir.setBounds(318, 356, 40, 44);
		contentPane.add(btnSalir);
		btnSalir.setIcon(new ImageIcon(img_salir));
		
		btnInicio = new JButton("");
		btnInicio.setBackground(new Color(255, 255, 255));
		btnInicio.addActionListener(this);
		btnInicio.setBounds(10, 356, 63, 44);
		contentPane.add(btnInicio);
		btnInicio.setIcon(new ImageIcon(img_inicio));
		
		btnCrearPartido = new JButton("PARTIDO");
		btnCrearPartido.addActionListener(this);
		btnCrearPartido.setFont(new Font("Arial Black", Font.PLAIN, 16));
		btnCrearPartido.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnCrearPartido.setBackground(Color.WHITE);
		btnCrearPartido.setBounds(78, 113, 218, 54);
		contentPane.add(btnCrearPartido);
		btnCrearPartido.setIcon(new ImageIcon(img_partido));

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCrearPartido) {
			do_btnCrearPartido_actionPerformed(e);
		}
		if (e.getSource() == btnInicio) {
			do_button_1_actionPerformed(e);
		}
		if (e.getSource() == btnSalir) {
			do_button_actionPerformed(e);
		}
		if (e.getSource() == btnCrearCandidato) {
			do_btnCrearCandidato_actionPerformed(e);
		}
		if (e.getSource() == btnCrearVotante) {
			do_btnCrearVotante_actionPerformed(e);
		}
		if (e.getSource() == btnCrearEncargado) {
			do_btnCrearEncargado_actionPerformed(e);
		}
	}
	
	protected void do_btnCrearEncargado_actionPerformed(ActionEvent e) {
		DatosEncargado encargado=new DatosEncargado();
		encargado.setVisible(true);
	}
	protected void do_btnCrearVotante_actionPerformed(ActionEvent e) {
		DatosVotante votante=new DatosVotante();
		votante.setVisible(true);
		this.setVisible(false);
	}
	protected void do_btnCrearCandidato_actionPerformed(ActionEvent e) {
		DatosCandidato candidato=new DatosCandidato();
		candidato.setVisible(true);
		this.setVisible(false);
	}
	protected void do_button_actionPerformed(ActionEvent e) {
		if (JOptionPane.showConfirmDialog(null, "Deseas Salir de la Aplicación?","Confirmar",JOptionPane.YES_NO_OPTION)==0){
			Principal.this.dispose();
		}
	}
	protected void do_button_1_actionPerformed(ActionEvent e) {
		FormInicio form = new FormInicio();
		form.setVisible(true);
		this.setVisible(false);
	}
	protected void do_btnCrearPartido_actionPerformed(ActionEvent e) {
		DatosPartido partido=new DatosPartido();
		partido.setVisible(true);
		this.setVisible(false);
	}
}
