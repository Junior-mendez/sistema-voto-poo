package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import claseHijos.Voto;
import claseHijos.VotoArray;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DatosVoto extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblCertificado;
	private JLabel lblFecha;
	private JLabel lblPeriodoDeEleccin;
	private JLabel lblDepartamento;
	private JLabel lblPartido;
	private JTextArea txtCertVoto;
	private JTextArea txtFechaVoto;
	private JTextArea txtPeriodoVoto;
	private JTextArea txtDptVoto;
	private JTextArea txtPrtVoto;
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
		setBounds(100, 100, 509, 300);
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
		
		lblPeriodoDeEleccin = new JLabel("PERIODO DE ELECCI\u00D3N:");
		lblPeriodoDeEleccin.setBounds(12, 89, 148, 25);
		contentPane.add(lblPeriodoDeEleccin);
		
		lblDepartamento = new JLabel("DEPARTAMENTO:");
		lblDepartamento.setBounds(12, 127, 148, 25);
		contentPane.add(lblDepartamento);
		
		lblPartido = new JLabel("PARTIDO:");
		lblPartido.setBounds(12, 165, 148, 25);
		contentPane.add(lblPartido);
		
		txtCertVoto = new JTextArea();
		txtCertVoto.setBounds(161, 14, 122, 24);
		contentPane.add(txtCertVoto);
		
		txtFechaVoto = new JTextArea();
		txtFechaVoto.setBounds(161, 52, 122, 24);
		contentPane.add(txtFechaVoto);
		
		txtPeriodoVoto = new JTextArea();
		txtPeriodoVoto.setBounds(161, 90, 122, 24);
		contentPane.add(txtPeriodoVoto);
		
		txtDptVoto = new JTextArea();
		txtDptVoto.setBounds(161, 128, 122, 24);
		contentPane.add(txtDptVoto);
		
		txtPrtVoto = new JTextArea();
		txtPrtVoto.setBounds(161, 166, 122, 24);
		contentPane.add(txtPrtVoto);
		
		btnRealizarVoto = new JButton("REALIZAR VOTO");
		btnRealizarVoto.addActionListener(this);
		btnRealizarVoto.setBounds(331, 79, 148, 44);
		contentPane.add(btnRealizarVoto);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnRealizarVoto) {
			do_btnRealizarVoto_actionPerformed(e);
		}
	}
	
	VotoArray votoA=new VotoArray();
	
	protected void do_btnRealizarVoto_actionPerformed(ActionEvent arg0) {
		try{
			Voto b1=votoA.buscar(ObtenerCertificado());
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
	String ObtenerDepartamento(){
		return txtDptVoto.getText();
	}
	int ObtenerPartido(){
		return Integer.parseInt(txtPrtVoto.getText());
	}
	
	
}
