package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.Label;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import clasePadre.Data;

import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;

public class FormInicio extends JFrame implements ActionListener, MouseListener {
	
	private Image img_votante= new ImageIcon(FormLogin.class.getResource("/resources/votante.jpg")).getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH);
	private Image img_salir= new ImageIcon(FormLogin.class.getResource("/resources/exit.png")).getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH);
	private Image img_voto_elec= new ImageIcon(FormLogin.class.getResource("/resources/voto_elec.png")).getImage().getScaledInstance(250, 100, Image.SCALE_SMOOTH);
	private Image img_programador1= new ImageIcon(FormLogin.class.getResource("/resources/programador1.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
	private Image img_usuario= new ImageIcon(FormLogin.class.getResource("/resources/votanteusu.png")).getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH);
	private Image img_prohibido= new ImageIcon(FormLogin.class.getResource("/resources/prohibido.png")).getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH);
	private Image img_logout= new ImageIcon(FormLogin.class.getResource("/resources/logout.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
	private Image img_votar= new ImageIcon(FormLogin.class.getResource("/resources/votar.png")).getImage().getScaledInstance(65, 65, Image.SCALE_SMOOTH);
	
	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblVotante;
	private JLabel lblUsuario;
	private JLabel lblVotante_1;
	private JLabel lblUsuario_1;
	private JButton btnSalir;
	private JLabel lblLogo;
	private JPanel panel_2;
	private JLabel labelEncargado;
	private JLabel lblEncargado;
	private JLabel label_1;
	private JButton btnProgramador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormInicio frame = new FormInicio();
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
	public FormInicio() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(100, 149, 237), 2));
		contentPane.setForeground(Color.WHITE);
		contentPane.setIgnoreRepaint(true);
		contentPane.setBackground(new Color(255, 255, 255));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(128, 0, 0), 2, true));
		panel.setBackground(Color.WHITE);
		panel.addMouseListener(this);
		panel.setBounds(79, 307, 256, 79);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		lblVotante = new JLabel("");
		lblVotante.setBounds(171, 0, 68, 74);
		panel.add(lblVotante);
		lblVotante.setIcon(new ImageIcon(img_votar));
		
		lblVotante_1 = new JLabel("VOTO");
		lblVotante_1.setForeground(new Color(0, 0, 0));
		lblVotante_1.setBackground(new Color(0, 0, 128));
		lblVotante_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblVotante_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblVotante_1.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lblVotante_1.setBounds(13, 22, 148, 32);
		panel.add(lblVotante_1);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(128, 128, 128), 2, true));
		panel_1.setForeground(new Color(255, 255, 255));
		panel_1.addMouseListener(this);
		panel_1.setBackground(new Color(128, 128, 128));
		panel_1.setLayout(null);
		panel_1.setBounds(79, 127, 256, 79);
		contentPane.add(panel_1);
		
		lblUsuario = new JLabel("");
		lblUsuario.setBounds(174, 0, 65, 79);
		panel_1.add(lblUsuario);
		lblUsuario.setIcon(new ImageIcon(img_usuario));
		
		lblUsuario_1 = new JLabel("REGISTRO");
		lblUsuario_1.setBounds(16, 27, 148, 23);
		panel_1.add(lblUsuario_1);
		lblUsuario_1.setForeground(new Color(255, 255, 255));
		lblUsuario_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblUsuario_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario_1.setFont(new Font("Arial Black", Font.PLAIN, 16));
		
		lblLogo = new JLabel("");
		lblLogo.setBounds(85, 6, 250, 110);
		contentPane.add(lblLogo);
		lblLogo.setHorizontalTextPosition(SwingConstants.CENTER);
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogo.setIcon(new ImageIcon(img_voto_elec));
		
		panel_2 = new JPanel();
		panel_2.addMouseListener(this);
		panel_2.setLayout(null);
		panel_2.setForeground(Color.WHITE);
		panel_2.setBorder(new LineBorder(new Color(128, 128, 128), 2, true));
		panel_2.setBackground(Color.GRAY);
		panel_2.setBounds(79, 217, 256, 79);
		contentPane.add(panel_2);
		
		labelEncargado = new JLabel("");
		labelEncargado.setBounds(174, 0, 65, 79);
		panel_2.add(labelEncargado);
		labelEncargado.setIcon(new ImageIcon(img_prohibido));
		
		lblEncargado = new JLabel("ENCARGADO");
		lblEncargado.setHorizontalTextPosition(SwingConstants.CENTER);
		lblEncargado.setHorizontalAlignment(SwingConstants.CENTER);
		lblEncargado.setForeground(Color.WHITE);
		lblEncargado.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblEncargado.setBounds(16, 24, 148, 29);
		panel_2.add(lblEncargado);
		
		
		label_1 = new JLabel("");
		label_1.setBounds(174, 0, 65, 79);
		panel_2.add(label_1);
		
		btnProgramador = new JButton("");
		btnProgramador.setBorder(null);
		btnProgramador.setBorderPainted(false);
		btnProgramador.setBackground(Color.WHITE);
		btnProgramador.addActionListener(this);
		btnProgramador.setBounds(10, 396, 56, 59);
		contentPane.add(btnProgramador);
		btnProgramador.setIcon(new ImageIcon(img_programador1));
		btnSalir = new JButton("Salir");
		btnSalir.setBorderPainted(false);
		btnSalir.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnSalir.setBounds(325, 392, 56, 63);
		contentPane.add(btnSalir);
		btnSalir.setBackground(Color.WHITE);
		btnSalir.setForeground(Color.WHITE);
		btnSalir.addActionListener(this);
		btnSalir.setIcon(new ImageIcon(img_logout));
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnProgramador) {
			do_btnProgramador_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnSalir) {
			do_btnSalir_actionPerformed(arg0);
		}
	}
	public void mouseClicked(MouseEvent arg0) {
		if (arg0.getSource() == panel_2) {
			do_panel_2_mouseClicked(arg0);
		}
		if (arg0.getSource() == panel) {
			do_panel_mouseClicked(arg0);
		}
		if (arg0.getSource() == panel_1) {
			do_panel_1_mouseClicked(arg0);
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
	protected void do_panel_1_mouseClicked(MouseEvent arg0) {
		DatosVotante datosVotante = new DatosVotante();
		datosVotante.setVisible(true);
		this.setVisible(false);
		Data.inicio=true;
	}
	protected void do_panel_mouseClicked(MouseEvent arg0) {
		FormLoginVotante voto = new FormLoginVotante();
		voto.setVisible(true);
		this.setVisible(false);
	}
	protected void do_btnSalir_actionPerformed(ActionEvent arg0) {
		if (JOptionPane.showConfirmDialog(null, "Deseas Salir de la Aplicación?","Confirmar",JOptionPane.YES_NO_OPTION)==0){
			FormInicio.this.dispose();
		}
	}
	protected void do_panel_2_mouseClicked(MouseEvent arg0) {
		FormLogin form = new FormLogin();
		form.setVisible(true);
		this.setVisible(false);
		
	}
	protected void do_btnProgramador_actionPerformed(ActionEvent arg0) {
		this.dispose();;
		FormProgramador programador = new FormProgramador();
		programador.setVisible(true);
	}
}
