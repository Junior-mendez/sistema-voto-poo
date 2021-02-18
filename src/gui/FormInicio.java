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
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;

public class FormInicio extends JFrame implements ActionListener, MouseListener {
	
	private Image img_votante= new ImageIcon(FormLogin.class.getResource("/resources/votante.jpg")).getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH);
	private Image img_usuario= new ImageIcon(FormLogin.class.getResource("/resources/username.png")).getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH);
	private Image img_salir= new ImageIcon(FormLogin.class.getResource("/resources/exit.png")).getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH);
	private Image img_voto_elec= new ImageIcon(FormLogin.class.getResource("/resources/voto_elec.png")).getImage().getScaledInstance(250, 100, Image.SCALE_SMOOTH);
	private Image img_programador= new ImageIcon(FormLogin.class.getResource("/resources/programador.png")).getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH);
	
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
		setBounds(100, 100, 400, 450);
		contentPane = new JPanel();
		contentPane.setIgnoreRepaint(true);
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 128), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(128, 0, 0), 2, true));
		panel.setBackground(new Color(102, 0, 0));
		panel.addMouseListener(this);
		panel.setBounds(69, 131, 239, 74);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		lblVotante = new JLabel("");
		lblVotante.setBounds(181, 0, 68, 74);
		panel.add(lblVotante);
		lblVotante.setIcon(new ImageIcon(img_votante));
		
		lblVotante_1 = new JLabel("VOTO");
		lblVotante_1.setForeground(new Color(255, 255, 255));
		lblVotante_1.setBackground(new Color(0, 0, 128));
		lblVotante_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblVotante_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblVotante_1.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblVotante_1.setBounds(23, 11, 148, 41);
		panel.add(lblVotante_1);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(128, 128, 128), 2, true));
		panel_1.setForeground(new Color(255, 255, 255));
		panel_1.addMouseListener(this);
		panel_1.setBackground(new Color(128, 128, 128));
		panel_1.setLayout(null);
		panel_1.setBounds(69, 221, 239, 79);
		contentPane.add(panel_1);
		
		lblUsuario = new JLabel("");
		lblUsuario.setBounds(174, 0, 65, 79);
		panel_1.add(lblUsuario);
		lblUsuario.setIcon(new ImageIcon(img_usuario));
		
		lblUsuario_1 = new JLabel("REGISTRO");
		lblUsuario_1.setForeground(new Color(255, 255, 255));
		lblUsuario_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblUsuario_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario_1.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblUsuario_1.setBounds(16, 11, 148, 41);
		panel_1.add(lblUsuario_1);
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(this);
		btnSalir.setBounds(345, 388, 45, 51);
		btnSalir.setIcon(new ImageIcon(img_salir));
		contentPane.add(btnSalir);
		
		lblLogo = new JLabel("");
		lblLogo.setBounds(48, 11, 277, 125);
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
		panel_2.setBounds(69, 311, 239, 79);
		contentPane.add(panel_2);
		
		labelEncargado = new JLabel("");
		labelEncargado.setBounds(174, 0, 65, 79);
		panel_2.add(labelEncargado);
		labelEncargado.setIcon(new ImageIcon(img_usuario));
		
		lblEncargado = new JLabel("ENCARGADO");
		lblEncargado.setHorizontalTextPosition(SwingConstants.CENTER);
		lblEncargado.setHorizontalAlignment(SwingConstants.CENTER);
		lblEncargado.setForeground(Color.WHITE);
		lblEncargado.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblEncargado.setBounds(16, 11, 148, 41);
		panel_2.add(lblEncargado);
		
		
		label_1 = new JLabel("");
		label_1.setBounds(174, 0, 65, 79);
		panel_2.add(label_1);
		
		btnProgramador = new JButton("");
		btnProgramador.addActionListener(this);
		btnProgramador.setBounds(10, 391, 56, 48);
		contentPane.add(btnProgramador);
		btnProgramador.setIcon(new ImageIcon(img_programador));
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
