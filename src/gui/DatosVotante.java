package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Default;

import claseHijos.Votante;
import claseHijos.VotanteArray;
import claseHijos.VotoArray;
import clasePadre.Data;
import sun.security.util.Length;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import javax.swing.UIManager;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class DatosVotante extends JFrame implements ActionListener, MouseListener, KeyListener {
	private Image img_buscar= new ImageIcon(FormLogin.class.getResource("/resources/buscar.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image img_registrar= new ImageIcon(FormLogin.class.getResource("/resources/registrar.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image img_borrar= new ImageIcon(FormLogin.class.getResource("/resources/borrar.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image img_editar= new ImageIcon(FormLogin.class.getResource("/resources/editar.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image img_menu= new ImageIcon(FormLogin.class.getResource("/resources/menu.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	
	private JPanel contentPane;
	private JLabel lblNombre;
	private JLabel label;
	private JLabel lblApellido;
	private JLabel lblEdad;
	private JLabel lblSexo;
	private JLabel lblUsuario;
	private JLabel lblClave;
	private JTextArea txtDNIVotante;
	private JTextArea txtNomVotante;
	private JTextArea txtApeVotante;
	private JTextArea txtEdadVotante;
	private JTextArea txtUsuarioVotante;
	private JTextArea txtClaveVotante;
	private JComboBox txtSex;
	private JButton btnRegistrar;
	private JTable tabla_votante;
	private DefaultTableModel modelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DatosVotante frame = new DatosVotante();
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
	public DatosVotante() {
		setTitle("VOTANTE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1022, 568);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNombre = new JLabel("DNI:");
		lblNombre.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setBounds(12, 50, 77, 22);
		contentPane.add(lblNombre);
		
		label = new JLabel("NOMBRE:");
		label.setFont(new Font("Arial Black", Font.PLAIN, 11));
		label.setForeground(Color.WHITE);
		label.setBounds(12, 83, 77, 22);
		contentPane.add(label);
		
		lblApellido = new JLabel("APELLIDO:");
		lblApellido.setForeground(Color.WHITE);
		lblApellido.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblApellido.setBounds(12, 125, 77, 22);
		contentPane.add(lblApellido);
		
		lblEdad = new JLabel("EDAD:");
		lblEdad.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblEdad.setForeground(Color.WHITE);
		lblEdad.setBounds(12, 158, 77, 22);
		contentPane.add(lblEdad);
		
		lblSexo = new JLabel("GENERO:");
		lblSexo.setForeground(Color.WHITE);
		lblSexo.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblSexo.setBounds(12, 191, 77, 22);
		contentPane.add(lblSexo);
		
		lblUsuario = new JLabel("USUARIO:");
		lblUsuario.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setBounds(12, 224, 96, 22);
		contentPane.add(lblUsuario);
		
		lblClave = new JLabel("CLAVE:");
		lblClave.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblClave.setForeground(Color.WHITE);
		lblClave.setBounds(12, 257, 96, 22);
		contentPane.add(lblClave);
		
		txtDNIVotante = new JTextArea();
		txtDNIVotante.addKeyListener(this);
		txtDNIVotante.setBounds(131, 50, 129, 22);
		contentPane.add(txtDNIVotante);
		
		txtNomVotante = new JTextArea();
		txtNomVotante.addKeyListener(this);
		txtNomVotante.setBounds(131, 83, 129, 22);
		contentPane.add(txtNomVotante);
		
		txtApeVotante = new JTextArea();
		txtApeVotante.addKeyListener(this);
		txtApeVotante.setBounds(131, 125, 129, 22);
		contentPane.add(txtApeVotante);
		
		txtEdadVotante = new JTextArea();
		txtEdadVotante.addKeyListener(this);
		txtEdadVotante.setBounds(131, 158, 129, 22);
		contentPane.add(txtEdadVotante);
		
		txtUsuarioVotante = new JTextArea();
		txtUsuarioVotante.addKeyListener(this);
		txtUsuarioVotante.setBounds(131, 224, 129, 22);
		contentPane.add(txtUsuarioVotante);
		
		txtClaveVotante = new JTextArea();
		txtClaveVotante.addKeyListener(this);
		txtClaveVotante.setBounds(131, 257, 129, 22);
		contentPane.add(txtClaveVotante);
		
		txtSex = new JComboBox();
		txtSex.setFont(new Font("Arial Black", Font.PLAIN, 11));
		txtSex.setBounds(131, 191, 129, 22);
		txtSex.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Femenino", "Otro"}));
		contentPane.add(txtSex);
		
		btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setEnabled(false);
		btnRegistrar.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnRegistrar.setBounds(74, 323, 137, 35);
		btnRegistrar.addActionListener(this);
		contentPane.add(btnRegistrar);
		btnRegistrar.setIcon(new ImageIcon(img_registrar));
		
		lblNumeroCertificado = new JLabel("CERTIFICADO:");
		lblNumeroCertificado.setForeground(Color.WHITE);
		lblNumeroCertificado.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNumeroCertificado.setBounds(12, 290, 122, 22);
		contentPane.add(lblNumeroCertificado);
		
		txtNumCertificado = new JTextArea();
		txtNumCertificado.addKeyListener(this);
		txtNumCertificado.setBounds(131, 290, 129, 22);
		txtNumCertificado.setEditable(false);
		contentPane.add(txtNumCertificado);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(297, 13, 699, 505);
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
		
		btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setEnabled(false);
		btnEliminar.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnEliminar.addActionListener(this);
		btnEliminar.setBounds(157, 415, 137, 35);
		btnEliminar.setIcon(new ImageIcon(img_borrar));
		contentPane.add(btnEliminar);
		
		btnModificar = new JButton("MODIFICAR");
		btnModificar.setEnabled(false);
		btnModificar.setMinimumSize(new Dimension(89, 23));
		btnModificar.setMaximumSize(new Dimension(89, 23));
		btnModificar.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnModificar.addActionListener(this);
		btnModificar.setBounds(74, 369, 137, 35);
		btnModificar.setIcon(new ImageIcon(img_editar));
		contentPane.add(btnModificar);
		
		btnBuscar = new JButton("BUSCAR");
		btnBuscar.setEnabled(false);
		btnBuscar.setBounds(10, 414, 137, 36);
		contentPane.add(btnBuscar);
		btnBuscar.setBackground(UIManager.getColor("Button.background"));
		btnBuscar.setBorder(null);
		btnBuscar.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnBuscar.setIcon(new ImageIcon(img_buscar));
		
		btnMenu = new JButton("MENU");
		btnMenu.addActionListener(this);
		btnMenu.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnMenu.setBorder(null);
		btnMenu.setBackground(SystemColor.menu);
		btnMenu.setBounds(12, 482, 96, 36);
		contentPane.add(btnMenu);
		btnBuscar.addActionListener(this);
		btnMenu.setIcon(new ImageIcon(img_menu));
		
		lblIngresaTusDatos = new JLabel("INGRESA TUS DATOS");
		lblIngresaTusDatos.setForeground(Color.WHITE);
		lblIngresaTusDatos.setFont(new Font("Arial Black", Font.PLAIN, 17));
		lblIngresaTusDatos.setBounds(42, 4, 218, 35);
		contentPane.add(lblIngresaTusDatos);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnMenu) {
			do_btnMenu_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnEliminar) {
			do_btnEliminar_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnModificar) {
			do_btnModificar_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnBuscar) {
			do_btnBuscar_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnRegistrar) {
			do_btnRegistrar_actionPerformed(arg0);
		}
	}
	
//	VotanteArray vtnteA=new VotanteArray();
//	VotoArray votoA=new VotoArray();
	
	private JLabel lblNumeroCertificado;
	private JTextArea txtNumCertificado;
	private JButton btnBuscar;
	
	VotanteArray varray=new VotanteArray();
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnEliminar;
	private JButton btnModificar;
	private JButton btnMenu;
	private JLabel lblIngresaTusDatos;
	protected void do_btnRegistrar_actionPerformed(ActionEvent arg0) {
		Registrar();
	}
	public void HabilitarBoton(){
		if(!txtDNIVotante.getText().isEmpty() && 
				!txtNomVotante.getText().isEmpty() && 
				!txtApeVotante.getText().isEmpty() && 
				!txtEdadVotante.getText().isEmpty() &&
				!txtUsuarioVotante.getText().isEmpty() && 
				!txtClaveVotante.getText().isEmpty() &&
				!txtNumCertificado.getText().isEmpty() ){
			btnRegistrar.setEnabled(true);
			
		}else{
			btnRegistrar.setEnabled(false);
		}
		if(!txtDNIVotante.getText().isEmpty()){
			btnBuscar.setEnabled(true);

		}else{
			btnBuscar.setEnabled(false);
			btnEliminar.setEnabled(false);
			btnModificar.setEnabled(false);
			
		}
		
	}
	public void Registrar(){
		
		String sex=ObtenerSexo();
	
		try{
			int dni=ObtenerDNI();
			if (Integer.toString(dni).length()!=8){
				mensaje("Ingrese un DNI Válido");
			}
			else if (Data.create().vtnA.buscar(dni)==null){
				try {
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
								try{
									String usua=ObtenerUsuario();
									if(usua.length()<=0){
										mensaje("Ingrese El Usuario");
									}
									else{
									try{
										String clave=ObtenerClave();
										try{
											String cert=ObtenerNombre().substring(0,1)+ObtenerApellido().substring(0,1)+ObtenerDNI()+ObtenerUsuario().substring(0,1);
											Votante v=new Votante(dni, nom, ape, edad, sex,cert, usua, clave);
											Votante ve=Data.create().vtnA.buscar(ObtenerDNI());
											if(ve==null){
												if(edad>=18){
													Data.create().vtnA.Adicionar(v);
													mensaje("VOTANTE REGISTRADO CON ÉXITO");
													Limpiar();
												}else{
													mensaje("Edad invalida");
													txtEdadVotante.grabFocus();
												}


											}
											else{
												mensaje("El DNI "+ObtenerDNI()+" ya existe");
												Limpiar();
											}
										}
										catch(Exception e){
											mensaje("Ingrese Certificado correcto");
										}
										
									}
									catch(Exception e){
										mensaje("Ingrese contraseña Correcta");
									}
									}
								}
								catch(Exception e){
									mensaje("Ingrese usuario Correcto");
								}
								
							}
							catch(Exception e){
								mensaje("Ingrese la Edad Correcta");
							}
						}
						}
						
						catch(Exception e){
							mensaje("Ingrese el Apellido correcto");
						}
					}				
				}
				catch(Exception e){
					mensaje("Ingrese el Nombre correcto");
				}
			}
			else {
				mensaje("El Usuario ya existe");
			}
		}
		catch(Exception e){
			mensaje("Ingrese DNI correcto");
			txtDNIVotante.setText("");
			txtDNIVotante.grabFocus();
		}
	}
	
	void Listado(){
		modelo.setRowCount(0);
		for(int i=0;i<Data.create().vtnA.tamaño();i++){
			Object[] registro={Data.create().vtnA.Obtener(i).getDni(),Data.create().vtnA.Obtener(i).getNombre(),Data.create().vtnA.Obtener(i).getApellido(),Data.create().vtnA.Obtener(i).getUsuario_votante()};	
			modelo.addRow(registro);
		}

		}
	void ListadoBuscar(Votante b){
		modelo.setRowCount(0);

			Object[] registro={b.getDni(),b.getNombre(),b.getApellido(),b.getUsuario_votante()};	
			modelo.addRow(registro);
		

		}
	public void mensaje(String s){
		JOptionPane.showMessageDialog(this,s);
	}
	
	int ObtenerDNI(){
		return Integer.parseInt(txtDNIVotante.getText());
	}
	String ObtenerNombre(){
		return txtNomVotante.getText();
	}
	String ObtenerApellido(){
		return txtApeVotante.getText();
	}
	int ObtenerEdad(){
		return Integer.parseInt(txtEdadVotante.getText());
	}
	String ObtenerSexo(){
		return txtSex.toString();
	}
	String ObtenerUsuario(){
		return txtUsuarioVotante.getText();
	}
	String ObtenerClave(){
		return txtClaveVotante.getText();
	}
	String ObtenerCertificado(){
		return txtNumCertificado.getText();
	}
	protected void do_btnBuscar_actionPerformed(ActionEvent arg0) {
		Buscar();
	}
	public void  Buscar(){
		try{
			Votante v=Data.create().vtnA.buscar(ObtenerDNI());
			if(v!=	null && !txtDNIVotante.getText().isEmpty()){
				ListadoBuscar(v);
				mensaje("USUARIO ENCONTRADO");
					btnModificar.setEnabled(true);
					btnEliminar.setEnabled(true);
			}
			else{
				mensaje("El codigo "+ObtenerDNI()+" no existe");
				Limpiar();

			}
		}
		catch(Exception e){
			mensaje("Ingrese codigo correcto");
			txtDNIVotante.setText("");
			txtDNIVotante.grabFocus();
		}
	}
	void Limpiar(){
		txtDNIVotante.setText("");
		txtNomVotante.setText("");
		txtApeVotante.setText("");
		txtEdadVotante.setText("");
		txtUsuarioVotante.setText("");
		txtClaveVotante.setText("");
		txtNumCertificado.setText("");
		txtDNIVotante.grabFocus();
	}


	protected void do_btnModificar_actionPerformed(ActionEvent arg0) {
		Editar();
	}
	public void Editar(){
		try{
			Votante v=Data.create().vtnA.buscar(ObtenerDNI());
			
			String nombre=ObtenerNombre();
			String apelli=ObtenerApellido();
			int edad=ObtenerEdad();
			String usu=ObtenerUsuario();
			String clav=ObtenerClave();

			if(v!=null){

				
					v.setNombre(nombre);
					v.setApellido(apelli);
					v.setEdad(edad);;
					v.setUsuario_votante(usu);;
					v.setClave_votante(clav);;
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
			txtNomVotante.grabFocus();
		}
	}
	protected void do_btnEliminar_actionPerformed(ActionEvent arg0) {
		Eliminar();

	}
	public void Eliminar(){
		try{
			Votante v=Data.create().vtnA.buscar(ObtenerDNI());
			if(v!=null){
				Data.create().vtnA.eliminar(v);
				Listado();
				Limpiar();
				mensaje("USUARIO ELIMINADO");
				txtDNIVotante.grabFocus();
			}
			else{
				mensaje("El DNI "+ObtenerDNI()+" no existe");
				Limpiar();
			}
		}
		catch(Exception e){
			mensaje("Ingrese DNI correcto");
			txtDNIVotante.setText("");
			txtDNIVotante.grabFocus();
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
	protected void do_btnMenu_actionPerformed(ActionEvent arg0) {
		if (!Data.inicio){
			dispose();
			Principal principal = new Principal();
			principal.setVisible(true);
		}
		else{
			dispose();
			FormInicio forminicio = new FormInicio();
			forminicio.setVisible(true);
		}
	}
	public void keyPressed(KeyEvent arg0) {
	}
	public void keyReleased(KeyEvent arg0) {
		if (arg0.getSource() == txtNumCertificado) {
			do_txtNumCertificado_keyReleased(arg0);
		}
		if (arg0.getSource() == txtClaveVotante) {
			do_txtClaveVotante_keyReleased(arg0);
		}
		if (arg0.getSource() == txtUsuarioVotante) {
			do_txtUsuarioVotante_keyReleased(arg0);
		}
		if (arg0.getSource() == txtEdadVotante) {
			do_txtEdadVotante_keyReleased(arg0);
		}
		if (arg0.getSource() == txtApeVotante) {
			do_txtApeVotante_keyReleased(arg0);
		}
		if (arg0.getSource() == txtNomVotante) {
			do_txtNomVotante_keyReleased(arg0);
		}
		if (arg0.getSource() == txtDNIVotante) {
			do_txtDNIVotante_keyReleased(arg0);
		}
	}
	public void keyTyped(KeyEvent arg0) {
	}
	protected void do_txtDNIVotante_keyReleased(KeyEvent arg0) {
		HabilitarBoton();
	}
	protected void do_txtNomVotante_keyReleased(KeyEvent arg0) {
		HabilitarBoton();
	}
	protected void do_txtApeVotante_keyReleased(KeyEvent arg0) {
		HabilitarBoton();
	}
	protected void do_txtEdadVotante_keyReleased(KeyEvent arg0) {
		HabilitarBoton();
	}
	protected void do_txtUsuarioVotante_keyReleased(KeyEvent arg0) {
		HabilitarBoton();
	}
	protected void do_txtClaveVotante_keyReleased(KeyEvent arg0) {
		HabilitarBoton();
	}
	protected void do_txtNumCertificado_keyReleased(KeyEvent arg0) {
		HabilitarBoton();
	}
}
