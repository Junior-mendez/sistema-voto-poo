package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import claseHijos.Encargado;
import claseHijos.EncargadoArray;
import claseHijos.Votante;
import claseHijos.VotanteArray;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class DatosEncargado extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblDni;
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JLabel lblEdad;
	private JLabel lblSexo;
	private JLabel lblUsuario;
	private JLabel lblClave;
	private JTextArea txtDNIEncargado;
	private JTextArea txtNomEncargado;
	private JTextArea txtApeEncargado;
	private JTextArea txtEdadEncargado;
	private JTextArea txtUsuarioEncargado;
	private JTextArea txtClaveEncargado;
	private JComboBox comboBox;
	private JButton btnRegistrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DatosEncargado frame = new DatosEncargado();
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
	public DatosEncargado() {
		setTitle("ENCARGADO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1022, 568);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		lblDni = new JLabel("DNI:");
		lblDni.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblDni.setForeground(new Color(255, 255, 255));
		lblDni.setBounds(12, 13, 42, 25);
		contentPane.add(lblDni);
		
		lblNombre = new JLabel("NOMBRE:");
		lblNombre.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNombre.setForeground(new Color(255, 255, 255));
		lblNombre.setBounds(12, 51, 76, 25);
		contentPane.add(lblNombre);
		
		lblApellido = new JLabel("APELLIDO:");
		lblApellido.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblApellido.setForeground(new Color(255, 255, 255));
		lblApellido.setBounds(12, 89, 76, 25);
		contentPane.add(lblApellido);
		
		lblEdad = new JLabel("EDAD:");
		lblEdad.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblEdad.setForeground(new Color(255, 255, 255));
		lblEdad.setBounds(12, 127, 76, 25);
		contentPane.add(lblEdad);
		
		lblSexo = new JLabel("GENERO:");
		lblSexo.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblSexo.setForeground(new Color(255, 255, 255));
		lblSexo.setBounds(12, 165, 76, 25);
		contentPane.add(lblSexo);
		
		lblUsuario = new JLabel("USUARIO:");
		lblUsuario.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblUsuario.setForeground(new Color(255, 255, 255));
		lblUsuario.setBounds(12, 203, 103, 25);
		contentPane.add(lblUsuario);
		
		lblClave = new JLabel("CLAVE:");
		lblClave.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblClave.setForeground(new Color(255, 255, 255));
		lblClave.setBounds(12, 241, 103, 25);
		contentPane.add(lblClave);
		
		txtDNIEncargado = new JTextArea();
		txtDNIEncargado.setBounds(131, 14, 141, 24);
		contentPane.add(txtDNIEncargado);
		
		txtNomEncargado = new JTextArea();
		txtNomEncargado.setBounds(131, 52, 141, 24);
		contentPane.add(txtNomEncargado);
		
		txtApeEncargado = new JTextArea();
		txtApeEncargado.setBounds(131, 90, 141, 24);
		contentPane.add(txtApeEncargado);
		
		txtEdadEncargado = new JTextArea();
		txtEdadEncargado.setBounds(131, 128, 141, 24);
		contentPane.add(txtEdadEncargado);
		
		txtUsuarioEncargado = new JTextArea();
		txtUsuarioEncargado.setBounds(127, 204, 145, 24);
		contentPane.add(txtUsuarioEncargado);
		
		txtClaveEncargado = new JTextArea();
		txtClaveEncargado.setBounds(127, 242, 145, 24);
		contentPane.add(txtClaveEncargado);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Femenino", "Otro"}));
		comboBox.setBounds(131, 166, 141, 25);
		contentPane.add(comboBox);
		
		btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.addActionListener(this);
		btnRegistrar.setBounds(12, 288, 145, 44);
		contentPane.add(btnRegistrar);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnRegistrar) {
			do_btnRegistrar_actionPerformed(e);
		}
	}
	
	EncargadoArray encrgdA=new EncargadoArray();
	
	protected void do_btnRegistrar_actionPerformed(ActionEvent arg0) {
		try{
			Encargado b1=encrgdA.buscar(ObtenerUsuario());
			if(b1!=null){
				mensaje("El usuario "+ObtenerUsuario()+" ya existe");
			}
			try{
				Encargado b2=encrgdA.buscar(ObtenerDNI());
			if(b2==null){
				Encargado encrgd=new Encargado(ObtenerDNI(),ObtenerNombre(),ObtenerApellido(),ObtenerEdad(),ObtenerSexo(),ObtenerUsuario(),ObtenerClave());
				encrgdA.Adicionar(encrgd);
			}
			else{
				mensaje("El DNI "+ObtenerDNI()+" ya existe");
			}
			}
			catch(Exception e){
				mensaje("Ingrese DNI correcto");
			}
		}
		catch(Exception e){
			mensaje("Ingrese usuario correcto");
		}
	}
	
	public void mensaje(String s){
		JOptionPane.showMessageDialog(this,s);
	}
	
	int ObtenerDNI(){
		return Integer.parseInt(txtDNIEncargado.getText());
	}
	String ObtenerNombre(){
		return txtNomEncargado.getText();
	}
	String ObtenerApellido(){
		return txtApeEncargado.getText();
	}
	int ObtenerEdad(){
		return Integer.parseInt(txtEdadEncargado.getText());
	}
	String ObtenerSexo(){
		return comboBox.toString();
	}

	String ObtenerUsuario(){
		return txtUsuarioEncargado.getText();
	}
	String ObtenerClave(){
		return txtClaveEncargado.getText();
	}
}
