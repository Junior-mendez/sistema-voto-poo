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

public class DatosVoto extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JLabel lblCertificado;
	private JLabel lblFecha;
	private JLabel lblPeriodoDeEleccin;
	private JLabel lblCandidato;
	private JLabel lblPartido;
	private JTextArea txtCertVoto;
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
		setBounds(100, 100, 415, 457);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		lblCertificado = new JLabel("CERTIFICADO:");
		lblCertificado.setBounds(12, 13, 93, 25);
		contentPane.add(lblCertificado);
		
		lblFecha = new JLabel("FECHA:");
		lblFecha.setBounds(12, 51, 93, 25);
		contentPane.add(lblFecha);
		
		lblPeriodoDeEleccin = new JLabel("PERIODO:");
		lblPeriodoDeEleccin.setBounds(12, 89, 148, 25);
		contentPane.add(lblPeriodoDeEleccin);
		
		lblCandidato = new JLabel("CANDIDATO:");
		lblCandidato.setBounds(12, 172, 80, 25);
		contentPane.add(lblCandidato);
		
		lblPartido = new JLabel("PARTIDO:");
		lblPartido.setBounds(12, 125, 80, 25);
		contentPane.add(lblPartido);
		
		txtCertVoto = new JTextArea();
		txtCertVoto.setBounds(102, 14, 181, 24);
		contentPane.add(txtCertVoto);
		
		txtFechaVoto = new JTextArea();
		txtFechaVoto.setBounds(102, 52, 181, 24);
		contentPane.add(txtFechaVoto);
		
		txtPeriodoVoto = new JTextArea();
		txtPeriodoVoto.setBounds(102, 90, 181, 24);
		contentPane.add(txtPeriodoVoto);
		
		btnRealizarVoto = new JButton("REALIZAR VOTO");
		btnRealizarVoto.addActionListener(this);
		btnRealizarVoto.setBounds(12, 363, 148, 44);
		contentPane.add(btnRealizarVoto);
		
		comboBoxPartido = new JComboBox();
		comboBoxPartido.setBounds(102, 127, 181, 32);
		contentPane.add(comboBoxPartido);
		AgregarCombo(comboBoxPartido);
		comboBoxPartido.addItemListener(new ItemListener() {
			  public void itemStateChanged(ItemEvent itemEvent) {
			    CambioCombo();
			  }
			});
		
		
		lblFotoCandidato = new JLabel("");
		lblFotoCandidato.setBounds(10, 220, 173, 126);
		
		contentPane.add(lblFotoCandidato);
		
		lblFotoPartido = new JLabel("");
		lblFotoPartido.setBounds(193, 220, 173, 126);
		contentPane.add(lblFotoPartido);
		
		labelCandidato = new JLabel("");
		labelCandidato.setBounds(102, 165, 183, 32);
		contentPane.add(labelCandidato);
		
		lblCandidatoFoto = new JLabel("CANDIDATO");
		lblCandidatoFoto.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
		lblCandidatoFoto.setHorizontalAlignment(SwingConstants.CENTER);
		lblCandidatoFoto.setBounds(12, 195, 171, 25);
		contentPane.add(lblCandidatoFoto);
		
		lblPartido_1 = new JLabel("PARTIDO");
		lblPartido_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPartido_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
		lblPartido_1.setBounds(218, 195, 171, 25);
		contentPane.add(lblPartido_1);
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
	
	protected void do_btnRealizarVoto_actionPerformed(ActionEvent arg0) {
		try{
			Voto b1=Data.create().votoA.buscar(ObtenerCertificado());
			if(b1==null){
				Voto b2=new Voto(ObtenerCertificado(),ObtenerFecha(),ObtenerPeriodo());
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
	
	String ObtenerCertificado(){
		return txtCertVoto.getText();
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
