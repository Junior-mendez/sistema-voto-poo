package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import claseHijos.Candidato;
import claseHijos.Encargado;
import claseHijos.EncargadoArray;
import claseHijos.Partido;
import claseHijos.Votante;
import claseHijos.VotanteArray;
import clasePadre.Data;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class DatosEncargado extends JFrame implements ActionListener, KeyListener {
	private Image img_buscar= new ImageIcon(FormLogin.class.getResource("/resources/buscar.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image img_registrar= new ImageIcon(FormLogin.class.getResource("/resources/registrar.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image img_borrar= new ImageIcon(FormLogin.class.getResource("/resources/borrar.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image img_editar= new ImageIcon(FormLogin.class.getResource("/resources/editar.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image img_menu= new ImageIcon(FormLogin.class.getResource("/resources/menu.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);

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
	private DefaultTableModel modelo;

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
		setBounds(100, 100, 923, 532);
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
		txtDNIEncargado.addKeyListener(this);
		txtDNIEncargado.setBounds(131, 14, 141, 24);
		contentPane.add(txtDNIEncargado);
		
		txtNomEncargado = new JTextArea();
		txtNomEncargado.addKeyListener(this);
		txtNomEncargado.setBounds(131, 52, 141, 24);
		contentPane.add(txtNomEncargado);
		
		txtApeEncargado = new JTextArea();
		txtApeEncargado.addKeyListener(this);
		txtApeEncargado.setBounds(131, 90, 141, 24);
		contentPane.add(txtApeEncargado);
		
		txtEdadEncargado = new JTextArea();
		txtEdadEncargado.addKeyListener(this);
		txtEdadEncargado.setBounds(131, 128, 141, 24);
		contentPane.add(txtEdadEncargado);
		
		txtUsuarioEncargado = new JTextArea();
		txtUsuarioEncargado.addKeyListener(this);
		txtUsuarioEncargado.setBounds(131, 204, 145, 24);
		contentPane.add(txtUsuarioEncargado);
		
		txtClaveEncargado = new JTextArea();
		txtClaveEncargado.addKeyListener(this);
		txtClaveEncargado.setBounds(131, 242, 145, 24);
		contentPane.add(txtClaveEncargado);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"MASCULINO", "FEMENINO", "OTRO"}));
		comboBox.setBounds(131, 166, 141, 25);
		contentPane.add(comboBox);
		
		btnRegistrarDatos = new JButton("REGISTRAR");
		btnRegistrarDatos.setEnabled(false);
		btnRegistrarDatos.addActionListener(this);
		btnRegistrarDatos.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnRegistrarDatos.setBounds(12, 312, 135, 42);
		contentPane.add(btnRegistrarDatos);
		btnRegistrarDatos.setIcon(new ImageIcon(img_registrar));
		
		btnB = new JButton("BUSCAR");
		btnB.setEnabled(false);
		btnB.addActionListener(this);
		btnB.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnB.setBounds(173, 312, 136, 42);
		contentPane.add(btnB);
		btnB.setIcon(new ImageIcon(img_buscar));
		
		btnModificar = new JButton("MODIFICAR");
		btnModificar.setEnabled(false);
		btnModificar.addActionListener(this);
		btnModificar.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnModificar.setBounds(12, 370, 135, 42);
		contentPane.add(btnModificar);
		btnModificar.setIcon(new ImageIcon(img_editar));
		
		btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setEnabled(false);
		btnEliminar.addActionListener(this);
		btnEliminar.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnEliminar.setBounds(173, 370, 136, 42);
		contentPane.add(btnEliminar);
		btnEliminar.setIcon(new ImageIcon(img_borrar));
		
		btnMenu = new JButton("MENU");
		btnMenu.addActionListener(this);
		btnMenu.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnMenu.setBounds(12, 433, 98, 42);
		contentPane.add(btnMenu);
		btnMenu.setIcon(new ImageIcon(img_menu));
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(346, 26, 547, 446);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFillsViewportHeight(true);
		scrollPane.setViewportView(table);
		modelo =new DefaultTableModel();
		modelo.addColumn("DNI");
		modelo.addColumn("NOMBRE");
		modelo.addColumn("APELLIDOS");
		modelo.addColumn("USUARIO");
		table.setModel(modelo);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnMenu) {
			do_btnMenu_actionPerformed(e);
		}
		if (e.getSource() == btnEliminar) {
			do_btnEliminar_actionPerformed(e);
		}
		if (e.getSource() == btnModificar) {
			do_btnModificar_actionPerformed(e);
		}
		if (e.getSource() == btnB) {
			do_btnB_actionPerformed(e);
		}
		if (e.getSource() == btnRegistrarDatos) {
			do_btnRegistrarDatos_actionPerformed(e);
		}
		
	}
	
	EncargadoArray encrgdA=new EncargadoArray();
	private JButton btnRegistrarDatos;
	private JButton btnB;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnMenu;
	private JScrollPane scrollPane;
	private JTable table;
	

	protected void do_btnRegistrarDatos_actionPerformed(ActionEvent e) {
		Registrar();
	}
	public void Registrar(){
		String sex=ObtenerSexo();
		try{
			int dni=ObtenerDNI();
			if (Integer.toString(dni).length()!=8){
			mensaje("Ingrese un DNI Válido");
			}
			else if (Data.create().candA.buscar(dni)==null){
				try{
					String nom=ObtenerNombre();
					if(nom.length()<=0){
						mensaje("Ingrese El nombre");
					}
					else{
						try{
							String ape=ObtenerApellido();
							if(ape.length()<=0){
								mensaje("Ingrese El apellido");
							}
							else{
								try{
									int edad=ObtenerEdad();
									if(edad<18){
										mensaje("Edad invalida");
									}
									else{
										try{
											String usua=ObtenerUsuario();
											if(usua.length()<=0){
												mensaje("Ingrese El Usuario");
											}
											else{
												try{
													String clave=ObtenerClave();
													Encargado enc=new Encargado(dni,nom,ape,edad,sex,usua,clave);
													Encargado ence=Data.create().encargadoA.buscar(ObtenerDNI());
													if(ence==null){
														Data.create().encargadoA.Adicionar(enc);
														mensaje("ENCARGADO REGISTRADO CON ÉXITO");
														Limpiar();
													}
												}
												catch(Exception e){
													mensaje("Ingrese clave correcta");
												}
											}
										}
										catch(Exception e){
											mensaje("Ingrese usuario correcto");
										}
									}	
									}
								catch(Exception e){
									mensaje("Ingrese edad correcta");
								}
							}
						}
						catch(Exception e){
							mensaje("Ingrese apellido correcto");
						}
					}
				}
				catch(Exception e){
					mensaje("Ingrese nombre correcto");
				}
			}
			}
		catch(Exception e){
			mensaje("Ingrese DNI correcto");
			txtDNIEncargado.setText("");
			txtDNIEncargado.grabFocus();
			
		}
	}
	
	void ListadoBuscar(Encargado b){
		modelo.setRowCount(0);

			Object[] registro={b.getDni(),b.getNombre(),b.getApellido(),b.getUsuario_encargado()};	
			modelo.addRow(registro);
		

		}
	
	protected void do_btnB_actionPerformed(ActionEvent e) {
		Buscar();
	}
	public void Buscar(){
		try{
			Encargado enc=Data.create().encargadoA.buscar(ObtenerDNI());
			if(enc!=null){
				ListadoBuscar(enc);
				mensaje("USUARIO ENCONTRADO");
				btnModificar.setEnabled(true);
				btnEliminar.setEnabled(true);
			}
			else{
				mensaje("El DNI "+ObtenerDNI()+" no existe");
				Limpiar();
			}
		}
		catch(Exception e){
			mensaje("Ingrese DNI correcto");
			txtDNIEncargado.setText("");
			txtDNIEncargado.grabFocus();
		}
	}
	
	protected void do_btnModificar_actionPerformed(ActionEvent e) {
		Editar();
	}
	public void Editar(){
		try{
			Encargado enc=Data.create().encargadoA.buscar(ObtenerDNI());
			
			String nombre=ObtenerNombre();
			String apelli=ObtenerApellido();
			int edad=ObtenerEdad();
			String usu=ObtenerUsuario();
			String clav=ObtenerClave();
			
			if(enc!=null){
				enc.setNombre(nombre);
				enc.setApellido(apelli);
				enc.setEdad(edad);;
				enc.setUsuario_encargado(usu);;
				enc.setClave_encargado(clav);;
				mensaje("DATOS  MODIFICADOS");
				Listado();
				Limpiar();
			}
			else{
				mensaje("El DNI "+ObtenerDNI()+" no existe");
				Limpiar();
			}
		}
		catch(Exception e){
			mensaje("Ingrese todos los campos");
			txtNomEncargado.grabFocus();
		}
	}
	protected void do_btnEliminar_actionPerformed(ActionEvent e) {
		Eliminar();
	}
	public void Eliminar(){
		try{
			Encargado enc=Data.create().encargadoA.buscar(ObtenerDNI());
			
			if(enc!=null){
				Data.create().encargadoA.eliminar(enc);
				Listado();
				Limpiar();
				mensaje("USUARIO ELIMINADO");
				txtDNIEncargado.grabFocus();
			}
			else{
				mensaje("El DNI "+ObtenerDNI()+" no existe");
				Limpiar();
			}
		}
		catch(Exception e){
			mensaje("Ingrese DNI correcto");
			txtDNIEncargado.setText("");
			txtDNIEncargado.grabFocus();
		}
	}
	public void mouseClicked(MouseEvent arg0) {
	}
	public void mouseEntered(MouseEvent arg0) {
	}
	public void mouseExited(MouseEvent arg0) {
	}
	public void mousePressed(MouseEvent arg0) {
	}
	public void mouseReleased(MouseEvent arg0) {
	}
	protected void do_btnMenu_actionPerformed(ActionEvent e) {
		dispose();
		Principal principal = new Principal();
		principal.setVisible(true);
	}
	
	void Limpiar(){
		txtDNIEncargado.setText("");
		txtNomEncargado.setText("");
		txtApeEncargado.setText("");
		txtEdadEncargado.setText("");
		txtUsuarioEncargado.setText("");
		txtClaveEncargado.setText("");
	}
	void Listado(){
		modelo.setRowCount(0);
		for(int i=0;i<Data.create().encargadoA.tamaño();i++){
			Object[] registro={Data.create().encargadoA.Obtener(i).getDni(),Data.create().encargadoA.Obtener(i).getNombre(),Data.create().encargadoA.Obtener(i).getApellido(),Data.create().encargadoA.Obtener(i).getUsuario_encargado()};	
			modelo.addRow(registro);
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
	public void keyPressed(KeyEvent e) {
	}
	public void keyReleased(KeyEvent e) {
		if (e.getSource() == txtClaveEncargado) {
			do_txtClaveEncargado_keyReleased(e);
		}
		if (e.getSource() == txtUsuarioEncargado) {
			do_txtUsuarioEncargado_keyReleased(e);
		}
		if (e.getSource() == txtEdadEncargado) {
			do_txtEdadEncargado_keyReleased(e);
		}
		if (e.getSource() == txtApeEncargado) {
			do_txtApeEncargado_keyReleased(e);
		}
		if (e.getSource() == txtNomEncargado) {
			do_txtNomEncargado_keyReleased(e);
		}
		if (e.getSource() == txtDNIEncargado) {
			do_txtDNIEncargado_keyReleased(e);
		}
	}
	public void keyTyped(KeyEvent e) {
	}
	public void HabilitarBoton(){
		if(!txtDNIEncargado.getText().isEmpty() && 
				!txtNomEncargado.getText().isEmpty() && 
				!txtApeEncargado.getText().isEmpty() &&
				!txtEdadEncargado.getText().isEmpty() && 
				!txtUsuarioEncargado.getText().isEmpty() &&
				!txtClaveEncargado.getText().isEmpty())  {
			btnRegistrarDatos.setEnabled(true);
			
		}else{
			btnRegistrarDatos.setEnabled(false);
		}
		if(!txtDNIEncargado.getText().isEmpty()){
			btnB.setEnabled(true);

		}else{
			btnB.setEnabled(false);
			btnEliminar.setEnabled(false);
			btnModificar.setEnabled(false);
			
		}
		
	}
	protected void do_txtDNIEncargado_keyReleased(KeyEvent e) {
		HabilitarBoton();
	}
	protected void do_txtNomEncargado_keyReleased(KeyEvent e) {
		HabilitarBoton();
	}
	protected void do_txtApeEncargado_keyReleased(KeyEvent e) {
		HabilitarBoton();
	}
	protected void do_txtEdadEncargado_keyReleased(KeyEvent e) {
		HabilitarBoton();
	}
	protected void do_txtUsuarioEncargado_keyReleased(KeyEvent e) {
		HabilitarBoton();
	}
	protected void do_txtClaveEncargado_keyReleased(KeyEvent e) {
		HabilitarBoton();
	}
}
