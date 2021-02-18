package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import claseHijos.Candidato;
import claseHijos.CandidatoArray;
import claseHijos.Partido;
import claseHijos.PartidoArray;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;

public class DatosPartido extends JFrame implements ActionListener {

	private Image img_logo= new ImageIcon(FormLogin.class.getResource("/resources/Onpelogo.png")).getImage().getScaledInstance(196, 123, Image.SCALE_SMOOTH);
	private Image img_regresar= new ImageIcon(FormLogin.class.getResource("/resources/regresar.png")).getImage().getScaledInstance(65, 50, Image.SCALE_SMOOTH);
	private Image img_salir= new ImageIcon(FormLogin.class.getResource("/resources/exit.png")).getImage().getScaledInstance(65, 50, Image.SCALE_SMOOTH);
	private Image img_registrar= new ImageIcon(FormLogin.class.getResource("/resources/registrar.png")).getImage().getScaledInstance(65, 50, Image.SCALE_SMOOTH);
	
	private JPanel contentPane;
	private JLabel lblNombre;
	private JLabel lblSiglas;
	private JTextField txtNomPartido;
	private JTextField txtSglPartido;
	private JButton btnRegistrarPartido;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DatosPartido frame = new DatosPartido();
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
	public DatosPartido() {
		setBackground(Color.BLACK);
		setTitle("PARTIDO\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 488, 431);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		lblNombre = new JLabel("NOMBRE:");
		lblNombre.setForeground(Color.BLACK);
		lblNombre.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNombre.setBounds(12, 13, 65, 22);
		contentPane.add(lblNombre);
		
		lblSiglas = new JLabel("SIGLAS:");
		lblSiglas.setForeground(Color.BLACK);
		lblSiglas.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblSiglas.setBounds(12, 48, 65, 22);
		contentPane.add(lblSiglas);
		
		txtNomPartido = new JTextField();
		txtNomPartido.setBounds(87, 14, 240, 22);
		contentPane.add(txtNomPartido);
		txtNomPartido.setColumns(10);
		
		txtSglPartido = new JTextField();
		txtSglPartido.setColumns(10);
		txtSglPartido.setBounds(87, 48, 146, 22);
		contentPane.add(txtSglPartido);
		
		btnRegistrarPartido = new JButton("REGISTRAR");
		btnRegistrarPartido.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnRegistrarPartido.addActionListener(this);
		btnRegistrarPartido.setBounds(10, 182, 235, 49);
		contentPane.add(btnRegistrarPartido);
		btnRegistrarPartido.setIcon(new ImageIcon(img_registrar));
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(img_logo));
		label.setBounds(233, 48, 196, 123);
		contentPane.add(label);
		
		btnRegresar = new JButton(" ");
		btnRegresar.addActionListener(this);
		btnRegresar.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnRegresar.setBounds(10, 343, 54, 49);
		contentPane.add(btnRegresar);
		btnRegresar.setIcon(new ImageIcon(img_regresar));
		
		btnSalir = new JButton(" ");
		btnSalir.addActionListener(this);
		btnSalir.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnSalir.setBounds(408, 343, 54, 49);
		contentPane.add(btnSalir);
		btnSalir.setIcon(new ImageIcon(img_salir));
		
		btnSubir = new JButton("Subir");
		btnSubir.setVisible(true);
		btnSubir.addActionListener(this);
		btnSubir.setBounds(12, 102, 71, 23);
		contentPane.add(btnSubir);
		
		lblFoto = new JLabel("");
		lblFoto.setBounds(87, 81, 146, 74);
		contentPane.add(lblFoto);
		
		label_1 = new JLabel("");
		label_1.setBounds(53, 257, 221, 37);
		contentPane.add(label_1);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSalir) {
			do_btnSalir_actionPerformed(e);
		}
		if (e.getSource() == btnSubir) {
			do_btnSubir_actionPerformed(e);
		}
		if (e.getSource() == btnRegresar) {
			do_btnRegresar_actionPerformed(e);
		}
		if (e.getSource() == btnRegistrarPartido) {
			do_btnRegistrarPartido_actionPerformed(e);
		}
	}
	
	PartidoArray partA=new PartidoArray();
	private JLabel label;
	private JButton btnRegresar;
	private JButton btnSalir;
	private JButton btnSubir;
	private JLabel lblFoto;
	
	protected void do_btnRegistrarPartido_actionPerformed(ActionEvent arg0) {
		Registrar();
	}
	
	public void Registrar(){
		if (ObtenerNombre().length()<=0||ObtenerSiglas().length()<=0 ){
			mensaje("Ingrese los Datos Requeridos");
		}
		else{
			try{
				Partido b1=partA.buscar(ObtenerSiglas());
				if(b1==null){
					Partido part=new Partido(ObtenerNombre(),ObtenerSiglas(),des);
					partA.Adicionar(part);
					mensaje("Partido Registrado");
					label_1.setText(des);
				}
				else{
					mensaje ("Siglas ya existentes");
				}
				
			}
			catch(Exception e){
				mensaje ("Ingrese Siglas correctas");
			}
		}
		
	}
	
	public void mensaje(String s){
		JOptionPane.showMessageDialog(this,s);
	}
	
	String ObtenerNombre(){
		return txtNomPartido.getText();
	}
	String ObtenerSiglas(){
		return txtSglPartido.getText();
	}
	String ObtenerFoto(){
		return des;
	}
	protected void do_btnRegresar_actionPerformed(ActionEvent e) {
		dispose();
		Principal principal = new Principal();
		principal.setVisible(true);
	}
	protected void do_btnSubir_actionPerformed(ActionEvent e) {
		cargarImagen();
	}
//	JFileChooser fc = new JFileChooser();
//	FileNameExtensionFilter filtro =new FileNameExtensionFilter("JPG","jpg","png");
//	File archivo = new File(fc.getSelectedFile().toString());
	String des="";
	private JLabel label_1;
	public String cargarImagen(){
		JFileChooser fc = new JFileChooser();
		FileNameExtensionFilter filtro =new FileNameExtensionFilter("JPG","jpg","png");
		fc.setFileFilter(filtro);
		fc.setDialogTitle("Buscar Foto");
		if (fc.showOpenDialog(this)==JFileChooser.APPROVE_OPTION){
			File archivo = new File(fc.getSelectedFile().toString());
			try{
				ImageIcon icon=new ImageIcon(archivo.toString());
				Icon icono = new ImageIcon(icon.getImage().getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_DEFAULT));
				lblFoto.setIcon(icono);
				des = System.getProperty("user.dir")+"/src/resources/"+archivo.getName();
				Path destino = Paths.get(des);
				String orig = archivo.getPath();
				Path origen = Paths.get(orig);
				Files.copy(origen, destino);
				mensaje("Foto cargada");
				return des;
				
			}
			catch(Exception d){
				mensaje("Error Al cargar Imagen");
				lblFoto.setIcon(null);
			}
			
			}
//		mensaje("Cancelo la operación");
		return des;
	}

	protected void do_btnSalir_actionPerformed(ActionEvent e) {
		if (JOptionPane.showConfirmDialog(null, "Deseas Salir de la Aplicación?","Confirmar",JOptionPane.YES_NO_OPTION)==0){
			this.dispose();
			
	}
}
}
