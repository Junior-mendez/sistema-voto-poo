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
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class FormProgramador extends JFrame implements ActionListener, MouseListener {
	
	private Image img_regresar= new ImageIcon(FormLogin.class.getResource("/resources/regresar.png")).getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH);
	private Image img_junior= new ImageIcon(FormLogin.class.getResource("/resources/junior.jpg")).getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH);
	private Image img_luis= new ImageIcon(FormLogin.class.getResource("/resources/luis.jpeg")).getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH);
	private Image img_fabrizio= new ImageIcon(FormLogin.class.getResource("/resources/fabrizio.jpeg")).getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH);
	private Image img_walter= new ImageIcon(FormLogin.class.getResource("/resources/walter.jpeg")).getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH);
	private Image img_salir= new ImageIcon(FormLogin.class.getResource("/resources/exit.png")).getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH);
	private Image img_upn= new ImageIcon(FormLogin.class.getResource("/resources/upn.png")).getImage().getScaledInstance(250, 100, Image.SCALE_SMOOTH);
	private JPanel contentPane;
	private JLabel lblJunior;
	private JButton btnSalir;
	private JLabel lblLogo;
	private JPanel panel_2;
	private JLabel lblLuis;
	private JButton btnRegresar;
	private JTextPane textPaneLuis;
	private JPanel panel_3;
	private JTextPane textPaneWalter;
	private JLabel lblWalter;
	private JPanel panel_1;
	private JTextPane textPaneFabrizio;
	private JLabel lbFabrizio;
	private JPanel panel_4;
	private JTextPane textPaneJunior;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormProgramador frame = new FormProgramador();
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
	public FormProgramador() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 550);
		contentPane = new JPanel();
		contentPane.setIgnoreRepaint(true);
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(this);
		btnSalir.setBounds(345, 488, 45, 51);
		btnSalir.setIcon(new ImageIcon(img_salir));
		contentPane.add(btnSalir);
		
		lblLogo = new JLabel("");
		lblLogo.setBounds(57, 11, 277, 100);
		contentPane.add(lblLogo);
		lblLogo.setHorizontalTextPosition(SwingConstants.CENTER);
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogo.setIcon(new ImageIcon(img_upn));
		
		panel_2 = new JPanel();
		panel_2.addMouseListener(this);
		panel_2.setLayout(null);
		panel_2.setForeground(Color.WHITE);
		panel_2.setBorder(new LineBorder(new Color(250, 250, 210), 2, true));
		panel_2.setBackground(Color.GRAY);
		panel_2.setBounds(38, 401, 336, 79);
		contentPane.add(panel_2);
		
		textPaneLuis = new JTextPane();
		textPaneLuis.setOpaque(false);
		textPaneLuis.setForeground(new Color(255, 255, 255));
		textPaneLuis.setFont(new Font("Arial Black", Font.ITALIC, 12));
		textPaneLuis.setBackground(SystemColor.info);
		textPaneLuis.setEditable(false);
		textPaneLuis.setBounds(10, 11, 229, 57);
		panel_2.add(textPaneLuis);
		textPaneLuis.setText("Luis Fernando Minaya S\u00E1enz\r\n990544224\r\nluisminayasaenz10@gmail.com");
		
		lblLuis = new JLabel("");
		lblLuis.setBounds(260, 0, 68, 74);
		panel_2.add(lblLuis);
		lblLuis.setIcon(new ImageIcon(img_luis));
		
		btnRegresar = new JButton("");
		btnRegresar.addActionListener(this);
		btnRegresar.setBounds(10, 491, 56, 48);
		contentPane.add(btnRegresar);
		btnRegresar.setIcon(new ImageIcon(img_regresar));
		
		
		lblJunior = new JLabel("");
		lblJunior.setBounds(298, 148, 68, 74);
		contentPane.add(lblJunior);
		lblJunior.setIcon(new ImageIcon(img_junior));
		
		panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setForeground(Color.WHITE);
		panel_3.setBorder(new LineBorder(new Color(250, 250, 210), 2, true));
		panel_3.setBackground(Color.GRAY);
		panel_3.setBounds(38, 317, 336, 79);
		contentPane.add(panel_3);
		
		textPaneWalter = new JTextPane();
		textPaneWalter.setFont(new Font("Arial Black", Font.ITALIC, 12));
		textPaneWalter.setOpaque(false);
		textPaneWalter.setForeground(new Color(255, 255, 255));
		textPaneWalter.setBackground(SystemColor.info);
		textPaneWalter.setEditable(false);
		textPaneWalter.setText("Walter Arturo Zegarra Herrera\r\n917153607\r\nN00038107@upn.pe");
		textPaneWalter.setBounds(10, 11, 229, 57);
		panel_3.add(textPaneWalter);
		
		lblWalter = new JLabel("");
		lblWalter.setBounds(261, 0, 68, 74);
		panel_3.add(lblWalter);
		lblWalter.setIcon(new ImageIcon(img_walter));
		
		panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(Color.WHITE);
		panel_1.setBorder(new LineBorder(new Color(250, 250, 210), 2, true));
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(38, 227, 336, 79);
		contentPane.add(panel_1);
		
		textPaneFabrizio = new JTextPane();
		textPaneFabrizio.setForeground(new Color(255, 255, 255));
		textPaneFabrizio.setOpaque(false);
		textPaneFabrizio.setFont(new Font("Arial Black", Font.ITALIC, 12));
		textPaneFabrizio.setBackground(SystemColor.info);
		textPaneFabrizio.setEditable(false);
		textPaneFabrizio.setText("Fabrizio Martin Vallejo Reyna\r\n933453009\r\nluisminayasaenz10@gmail.com");
		textPaneFabrizio.setBounds(10, 11, 229, 57);
		panel_1.add(textPaneFabrizio);
		
		lbFabrizio = new JLabel("");
		lbFabrizio.setBounds(258, 0, 68, 74);
		panel_1.add(lbFabrizio);
		lbFabrizio.setIcon(new ImageIcon(img_fabrizio));
		
		panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setForeground(Color.WHITE);
		panel_4.setBorder(new LineBorder(new Color(250, 250, 210), 2, true));
		panel_4.setBackground(Color.GRAY);
		panel_4.setBounds(38, 143, 336, 79);
		contentPane.add(panel_4);
		
		textPaneJunior = new JTextPane();
		textPaneJunior.setOpaque(false);
		textPaneJunior.setFont(new Font("Arial Black", Font.ITALIC, 12));
		textPaneJunior.setForeground(new Color(255, 255, 255));
		textPaneJunior.setBackground(new Color(128, 128, 0));
		textPaneJunior.setEditable(false);
		textPaneJunior.setText("Junior Roland Mendez Lezcano\r\n986903103\r\nN00223764@upn.pe");
		textPaneJunior.setBounds(10, 11, 229, 57);
		panel_4.add(textPaneJunior);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnRegresar) {
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
	}
	public void mouseEntered(MouseEvent arg0) {
	}
	public void mouseExited(MouseEvent arg0) {
	}
	public void mousePressed(MouseEvent arg0) {
	}
	public void mouseReleased(MouseEvent arg0) {
	}
	protected void do_btnSalir_actionPerformed(ActionEvent arg0) {
		if (JOptionPane.showConfirmDialog(null, "Deseas Salir de la Aplicación?","Confirmar",JOptionPane.YES_NO_OPTION)==0){
			FormProgramador.this.dispose();
		}
	}
	protected void do_panel_2_mouseClicked(MouseEvent arg0) {
		FormLogin form = new FormLogin();
		form.setVisible(true);
		this.setVisible(false);
		
	}
	protected void do_btnProgramador_actionPerformed(ActionEvent arg0) {
		this.dispose();
		FormInicio inicio =new FormInicio();
		inicio.setVisible(true);
	}
}
