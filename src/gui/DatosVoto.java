package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import claseHijos.Candidato;
import claseHijos.CandidatoArray;
import claseHijos.Partido;
import claseHijos.PartidoArray;
import claseHijos.Voto;
import claseHijos.VotoArray;
import clasePadre.Data;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.LineBorder;

public class DatosVoto extends JFrame implements ActionListener{
	private Image img_votar= new ImageIcon(FormLogin.class.getResource("/resources/votar.png")).getImage().getScaledInstance(70, 50, Image.SCALE_SMOOTH);
	private Image img_salir= new ImageIcon(FormLogin.class.getResource("/resources/exit.png")).getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH);
	private Image img_voto_elec= new ImageIcon(FormLogin.class.getResource("/resources/voto_elec.png")).getImage().getScaledInstance(250, 100, Image.SCALE_SMOOTH);

	private JPanel contentPane;
	private JLabel lblCertificado;
	private JLabel lblFecha;
	private JLabel lblPeriodoDeEleccin;
	private JLabel lblCandidato;
	private JLabel lblPartido;
	private JTextArea txtFechaVoto;
	private JTextArea txtPeriodoVoto;
	private JButton btnRealizarVoto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DatosVoto frame = new DatosVoto();
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
	public DatosVoto() {
		setTitle("VOTO\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 444, 497);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		lblCertificado = new JLabel("CERTIFICADO:");
		lblCertificado.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblCertificado.setOpaque(true);
		lblCertificado.setBackground(new Color(255, 255, 255));
		lblCertificado.setForeground(new Color(0, 0, 0));
		lblCertificado.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblCertificado.setBounds(24, 110, 105, 25);
		contentPane.add(lblCertificado);
		
		lblFecha = new JLabel("FECHA:");
		lblFecha.setBounds(10, 14, 93, 25);
		contentPane.add(lblFecha);
		lblFecha.setVisible(false);
		
		lblPeriodoDeEleccin = new JLabel("PERIODO:");
		lblPeriodoDeEleccin.setBounds(10, 52, 148, 25);
		contentPane.add(lblPeriodoDeEleccin);
		lblPeriodoDeEleccin.setVisible(false);
		
		lblCandidato = new JLabel("CANDIDATO:");
		lblCandidato.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblCandidato.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblCandidato.setForeground(new Color(0, 0, 0));
		lblCandidato.setOpaque(true);
		lblCandidato.setBackground(new Color(255, 255, 255));
		lblCandidato.setBounds(26, 194, 103, 25);
		contentPane.add(lblCandidato);
		
		lblPartido = new JLabel("PARTIDO:");
		lblPartido.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblPartido.setForeground(new Color(0, 0, 0));
		lblPartido.setOpaque(true);
		lblPartido.setBackground(new Color(255, 255, 255));
		lblPartido.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblPartido.setBounds(26, 147, 103, 25);
		contentPane.add(lblPartido);
		
		txtFechaVoto = new JTextArea();
		txtFechaVoto.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtFechaVoto.setBounds(86, 15, 181, 25);
		contentPane.add(txtFechaVoto);
		txtFechaVoto.setVisible(false);
		
		txtPeriodoVoto = new JTextArea();
		txtPeriodoVoto.setBounds(100, 53, 181, 24);
		contentPane.add(txtPeriodoVoto);
		txtPeriodoVoto.setVisible(false);
		
		
		btnRealizarVoto = new JButton("REALIZAR VOTO");
		btnRealizarVoto.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnRealizarVoto.addActionListener(this);
		btnRealizarVoto.setBounds(100, 392, 209, 44);
		contentPane.add(btnRealizarVoto);
		btnRealizarVoto.setIcon(new ImageIcon(img_votar));
		
		comboBoxPartido = new JComboBox();
		comboBoxPartido.setBorder(new LineBorder(new Color(0, 0, 0)));
		comboBoxPartido.setBounds(149, 144, 236, 32);
		contentPane.add(comboBoxPartido);
		AgregarCombo(comboBoxPartido);
		comboBoxPartido.addItemListener(new ItemListener() {
			  public void itemStateChanged(ItemEvent itemEvent) {
			    CambioCombo();
			  }
			});
		
		
		lblFotoCandidato = new JLabel("");
		lblFotoCandidato.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblFotoCandidato.setBounds(10, 255, 173, 126);
		
		contentPane.add(lblFotoCandidato);
		
		lblFotoPartido = new JLabel("");
		lblFotoPartido.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblFotoPartido.setBounds(228, 255, 173, 126);
		contentPane.add(lblFotoPartido);
		
		labelCandidato = new JLabel("");
		labelCandidato.setBorder(new LineBorder(new Color(0, 0, 0)));
		labelCandidato.setBounds(149, 187, 236, 32);
		contentPane.add(labelCandidato);
		
		lblCandidatoFoto = new JLabel("CANDIDATO");
		lblCandidatoFoto.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
		lblCandidatoFoto.setHorizontalAlignment(SwingConstants.CENTER);
		lblCandidatoFoto.setBounds(10, 219, 171, 25);
		contentPane.add(lblCandidatoFoto);
		
		lblPartido_1 = new JLabel("PARTIDO");
		lblPartido_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPartido_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
		lblPartido_1.setBounds(216, 219, 171, 25);
		contentPane.add(lblPartido_1);
		
		labelCertificado = new JLabel("");
		labelCertificado.setBorder(new LineBorder(new Color(0, 0, 0)));
		labelCertificado.setBounds(149, 110, 235, 24);
		contentPane.add(labelCertificado);
		labelCertificado.setText(Data.create().certi);
		
		btnSalir = new JButton("");
		btnSalir.setBounds(359, 392, 59, 55);
		contentPane.add(btnSalir);
		btnSalir.setIcon(new ImageIcon(img_salir));
		
		lblLogo = new JLabel("");
		lblLogo.setBounds(81, 11, 275, 88);
		contentPane.add(lblLogo);
		lblLogo.setIcon(new ImageIcon(img_voto_elec));
	}
//	CandidatoArray cand = new CandidatoArray();
//	PartidoArray par = new PartidoArray();
	
	Partido part;
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnRealizarVoto) {
			do_btnRealizarVoto_actionPerformed(e);
		}
	}
	public void AgregarCombo(JComboBox combo){
		String[] partido = new String[Data.create().partA.tamaño()];
		for (int  i=0;i< Data.create().partA.tamaño();i++){
			combo.addItem(Data.create().partA.Obtener(i).getNom_part()) ;
			 Partido part = Data.create().partA.Obtener(i);
			
		}
	}
//	VotoArray votoA=new VotoArray();
	private JComboBox comboBoxPartido;
	private JLabel lblFotoCandidato;
	private JLabel lblFotoPartido;
	private JLabel labelCandidato;
	private JLabel lblCandidatoFoto;
	private JLabel lblPartido_1;
	private JLabel labelCertificado;
	private JButton btnSalir;
	private JLabel lblLogo;
	
	protected void do_btnRealizarVoto_actionPerformed(ActionEvent arg0) {
		try{
			Voto b1=Data.create().votoA.buscar(Data.create().certi);
			if(b1==null){
				
				Voto b2=new Voto(Data.create().certi,ObtenerFecha(),ObtenerPeriodo());
				Data.create().votoA.Adicionar(b2);
				mensaje("Su voto fue realizado");
				this.dispose();
				FormInicio form = new FormInicio();
				form.setVisible(true);
			}
			else{
				mensaje("El número de certificado ya se encuentra registrado");
			}
		}
		catch(Exception e){
			mensaje("Ingrese número de certifcado correcto");
		}
	}
	
	public void mensaje(String s){
		JOptionPane.showMessageDialog(this,s);
	}
	
	int ObtenerFecha(){
		return Integer.parseInt(txtFechaVoto.getText());
	}
	int ObtenerPeriodo(){
		return Integer.parseInt(txtPeriodoVoto.getText());
	}

	public void mouseEntered(MouseEvent arg0) {
	}
	public void mouseExited(MouseEvent arg0) {
	}
	public void mousePressed(MouseEvent arg0) {
	}
	public void mouseReleased(MouseEvent arg0) {
	}
	public void CambioCombo(){
		Partido partido = Data.create().partA.buscarNom(comboBoxPartido.getSelectedItem().toString());
		Candidato candidato = Data.create().candA.buscar(partido.getNom_part());
		labelCandidato.setText(candidato.getNombre());
		ImageIcon img_candidato=new ImageIcon(candidato.getFoto());
		Icon im_candidato = new ImageIcon(img_candidato.getImage().getScaledInstance(lblFotoCandidato.getWidth(), lblFotoCandidato.getHeight(), Image.SCALE_DEFAULT));
		lblFotoCandidato.setIcon(im_candidato);
		ImageIcon img_partido=new ImageIcon(partido.getFoto());
		Icon im_partido = new ImageIcon(img_partido.getImage().getScaledInstance(lblFotoCandidato.getWidth(), lblFotoCandidato.getHeight(), Image.SCALE_DEFAULT));
		lblFotoPartido.setIcon(im_partido);
	}
}
