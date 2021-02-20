package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;

import claseHijos.Candidato;
import claseHijos.CandidatoArray;
import claseHijos.Partido;
import claseHijos.PartidoArray;
import claseHijos.Votante;
import clasePadre.Data;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ContainerListener;
import java.awt.event.ContainerEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.MouseEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;



public class DatosCandidato extends JFrame implements ActionListener, MouseListener, KeyListener{
	int id;
	private Image img_buscar= new ImageIcon(FormLogin.class.getResource("/resources/buscar.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image img_registrar= new ImageIcon(FormLogin.class.getResource("/resources/registrar.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image img_borrar= new ImageIcon(FormLogin.class.getResource("/resources/borrar.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image img_editar= new ImageIcon(FormLogin.class.getResource("/resources/editar.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image img_menu= new ImageIcon(FormLogin.class.getResource("/resources/menu.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image img_agregar= new ImageIcon(FormLogin.class.getResource("/resources/add.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	
	private JPanel contentPane;
	private JLabel lblCdigo;
	private JLabel lblDni;
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JLabel lblEdad;
	private JLabel lblSexo;
	private JTextField txtCodCandidato;
	private JTextField txtDNICandidato;
	private JTextField txtNomCandidato;
	private JTextField txtApeCandidato;
	private JTextField txtEdadCandidato;
	private JButton btnRegistrarDatos;
	private JComboBox comboBox;
	private JTable tabla_votante;
	private DefaultTableModel modelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DatosCandidato frame = new DatosCandidato();
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
	public DatosCandidato() {
		setBackground(Color.DARK_GRAY);
		setTitle("CANDIDATO\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 925, 524);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(new Color(100, 149, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		lblCdigo = new JLabel("C\u00D3DIGO:");
		lblCdigo.setForeground(new Color(255, 255, 255));
		lblCdigo.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblCdigo.setBounds(12, 11, 57, 27);
		contentPane.add(lblCdigo);
		
		lblDni = new JLabel("DNI:");
		lblDni.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblDni.setForeground(Color.WHITE);
		lblDni.setBounds(12, 49, 57, 27);
		contentPane.add(lblDni);
		
		lblNombre = new JLabel("NOMBRE:");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNombre.setBounds(12, 86, 77, 27);
		contentPane.add(lblNombre);
		
		lblApellido = new JLabel("APELLIDO:");
		lblApellido.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblApellido.setForeground(Color.WHITE);
		lblApellido.setBounds(10, 124, 79, 27);
		contentPane.add(lblApellido);
		
		lblEdad = new JLabel("EDAD:");
		lblEdad.setForeground(Color.WHITE);
		lblEdad.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblEdad.setBounds(12, 162, 48, 27);
		contentPane.add(lblEdad);
		
		lblSexo = new JLabel("GENERO:");
		lblSexo.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblSexo.setForeground(Color.WHITE);
		lblSexo.setBounds(12, 200, 77, 27);
		contentPane.add(lblSexo);
		
		txtCodCandidato = new JTextField();
		txtCodCandidato.addKeyListener(this);
		txtCodCandidato.setColumns(10);
		txtCodCandidato.setBounds(120, 13, 159, 22);
		contentPane.add(txtCodCandidato);
		
		txtDNICandidato = new JTextField();
		txtDNICandidato.addKeyListener(this);
		txtDNICandidato.setColumns(10);
		txtDNICandidato.setBounds(120, 51, 159, 22);
		contentPane.add(txtDNICandidato);
		
		txtNomCandidato = new JTextField();
		txtNomCandidato.addKeyListener(this);
		txtNomCandidato.setColumns(10);
		txtNomCandidato.setBounds(120, 88, 159, 22);
		contentPane.add(txtNomCandidato);
		
		txtApeCandidato = new JTextField();
		txtApeCandidato.addKeyListener(this);
		txtApeCandidato.setColumns(10);
		txtApeCandidato.setBounds(120, 126, 159, 22);
		contentPane.add(txtApeCandidato);
		
		txtEdadCandidato = new JTextField();
		txtEdadCandidato.addKeyListener(this);
		txtEdadCandidato.setColumns(10);
		txtEdadCandidato.setBounds(120, 164, 159, 22);
		contentPane.add(txtEdadCandidato);
		
		btnRegistrarDatos = new JButton("REGISTRAR");
		btnRegistrarDatos.addKeyListener(this);
		btnRegistrarDatos.setEnabled(false);
		btnRegistrarDatos.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnRegistrarDatos.addActionListener(this);
		btnRegistrarDatos.setBounds(12, 314, 135, 42);
		contentPane.add(btnRegistrarDatos);
		btnRegistrarDatos.setIcon(new ImageIcon(img_registrar));
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial Black", Font.PLAIN, 11));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"-SELECCIONAR-", "MASCULINO", "FEMENINO", "OTRO"}));
		comboBox.setBounds(120, 202, 159, 22);
		contentPane.add(comboBox);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(303, 11, 596, 463);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFillsViewportHeight(true);
		scrollPane.setViewportView(table);
		modelo =new DefaultTableModel();
		modelo.addColumn("CODIGO");
		modelo.addColumn("DNI");
		modelo.addColumn("NOMBRE");
		modelo.addColumn("APELLIDOS");
		modelo.addColumn("EDAD");
		modelo.addColumn("PARTIDO");
		table.setModel(modelo);
		
		btnModificar = new JButton("MODIFICAR");
		btnModificar.addKeyListener(this);
		btnModificar.setEnabled(false);
		btnModificar.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnModificar.addActionListener(this);
		btnModificar.setBounds(12, 378, 135, 42);
		contentPane.add(btnModificar);
		btnModificar.setIcon(new ImageIcon(img_editar));
		
		btnEliminar = new JButton("ELIMINAR");
		btnEliminar.addKeyListener(this);
		btnEliminar.setEnabled(false);
		btnEliminar.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnEliminar.addActionListener(this);
		btnEliminar.setBounds(157, 378, 136, 42);
		contentPane.add(btnEliminar);
		btnEliminar.setIcon(new ImageIcon(img_borrar));
		
		btnB = new JButton("BUSCAR");
		btnB.addKeyListener(this);
		btnB.setEnabled(false);
		btnB.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnB.addActionListener(this);
		btnB.setBounds(157, 314, 136, 42);
		contentPane.add(btnB);
		btnB.setIcon(new ImageIcon(img_buscar));
		
		btnMenu = new JButton("MENU");
		btnMenu.addActionListener(this);
		btnMenu.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnMenu.setBounds(12, 432, 98, 42);
		contentPane.add(btnMenu);
		btnMenu.setIcon(new ImageIcon(img_menu));
		
		lblFoto = new JLabel("");
		lblFoto.setVisible(true);
		lblFoto.setBounds(120, 261, 75, 42);
		contentPane.add(lblFoto);
		
		btnSubir = new JButton("Subir");
		btnSubir.setVisible(true);
		btnSubir.addActionListener(this);
		btnSubir.setBounds(21, 280, 89, 23);
		contentPane.add(btnSubir);
		
		comboPartido = new JComboBox();
		comboPartido.addMouseListener(this);
		comboPartido.addActionListener(this);
		comboPartido.setFont(new Font("Arial Black", Font.PLAIN, 11));
		comboPartido.setBounds(120, 236, 151, 22);
		AgregarCombo(comboPartido);
		contentPane.add(comboPartido);
		
		
		lblPartido = new JLabel("PARTIDO:");
		lblPartido.setForeground(Color.WHITE);
		lblPartido.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblPartido.setBounds(12, 234, 77, 27);
		contentPane.add(lblPartido);
		
		btnAgregar = new JButton("");
		btnAgregar.addActionListener(this);
		btnAgregar.setBounds(281, 235, 23, 27);
		contentPane.add(btnAgregar);
		btnAgregar.setIcon(new ImageIcon(img_agregar));
	}
//	PartidoArray part = new PartidoArray();
	Partido partido = new Partido();
	public void AgregarCombo(JComboBox combo){
		combo.removeAllItems();;
		for (int  i=0;i< Data.create().partA.tamaño();i++){
			combo.addItem(Data.create().partA.Obtener(i).getNom_part()) ;
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAgregar) {
			do_btnAgregar_actionPerformed(e);
		}
		if (e.getSource() == btnSubir) {
			do_btnSubir_actionPerformed(e);
		}
		if (e.getSource() == btnMenu) {
			do_btnRegresar_actionPerformed(e);
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
	
//	static CandidatoArray candA=Data.create().candA;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnB;
	private JButton btnMenu;
	private JLabel lblFoto;
	private JButton btnSubir;
	private JComboBox comboPartido;
	private JLabel lblPartido;
	
	protected void do_btnRegistrarDatos_actionPerformed(ActionEvent arg0) {
		Registrar();
	}
	public void HabilitarBoton(){
		if(!txtCodCandidato.getText().isEmpty() && 
				!txtDNICandidato.getText().isEmpty() && 
				!txtNomCandidato.getText().isEmpty() &&
				!txtApeCandidato.getText().isEmpty() && 
				!txtEdadCandidato.getText().isEmpty()) {
			btnRegistrarDatos.setEnabled(true);
			
		}else{
			btnRegistrarDatos.setEnabled(false);
		}
		if(!txtCodCandidato.getText().isEmpty()){
			btnB.setEnabled(true);

		}else{
			btnB.setEnabled(false);
			btnEliminar.setEnabled(false);
			btnModificar.setEnabled(false);
			
		}
		
	}
	public void Registrar(){
		
		String sex=ObtenerSexo();
	try{
		int cod=ObtenerCodigo();
		if(Integer.toString(cod)==null){
			mensaje("Ingrese un código");
		}
		try{
			int dni=ObtenerDNI();
			if (Integer.toString(dni).length()!=8){
				mensaje("Ingrese un DNI Válido");
			}
			else if (Data.create().candA.buscar(dni)==null){
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
								try{	Partido partido=ObtenerPartido();	
										String foto=des;
											Candidato c=new Candidato(cod, dni, nom, ape, edad, sex, partido,foto);
											Candidato ca=Data.create().candA.buscar(ObtenerDNI());
											if(ca==null){
												if(edad>=35){
													if (validar()==false){
														mensaje("Partido ya tiene candidato");
														return;
													}
													Data.create().candA.Adicionar(c);
													lblFoto.setIcon(null);
													mensaje("CANDIDATO REGISTRADO CON ÉXITO");
													Limpiar();
												}else{
													mensaje("Edad invalida");
													txtDNICandidato.grabFocus();
												}
											}
											else{
												mensaje("El DNI "+ObtenerDNI()+" ya existe");
												Limpiar();
											}
										
									}
								catch(Exception e){
									mensaje("Ingrese la partido valido");
								}
								
							}
							catch(Exception e){
								mensaje("Ingrese la Edad Correcta");
							}
						}
						}
						
						catch(Exception e){
							mensaje("Ingrese el Apelliso correcto");
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
			txtDNICandidato.setText("");
			txtDNICandidato.grabFocus();
		}
	}catch(Exception e){
		mensaje("Ingrese código correcto");
		txtCodCandidato.setText("");
		txtCodCandidato.grabFocus();
	}
	}
	
	void Limpiar(){
		txtCodCandidato.setText("");
		txtDNICandidato.setText("");
		txtNomCandidato.setText("");
		txtApeCandidato.setText("");
		txtEdadCandidato.setText("");
	}
	void Listado(){
		modelo.setRowCount(0);
		for(int i=0;i<Data.create().candA.tamaño();i++){
			Object[] registro={Data.create().candA.Obtener(i).getCódigo_candidato(),Data.create().candA.Obtener(i).getDni(),Data.create().candA.Obtener(i).getNombre(),Data.create().candA.Obtener(i).getApellido(),Data.create().candA.Obtener(i).getEdad(),Data.create().candA.Obtener(i).getPartido().getNom_part()};	
			modelo.addRow(registro);
		}

		}

	
	public void mensaje(String s){
		JOptionPane.showMessageDialog(this,s);
	}
	
	int ObtenerCodigo(){
		return Integer.parseInt(txtCodCandidato.getText());
	}
	int ObtenerDNI(){
		return Integer.parseInt(txtDNICandidato.getText());
	}
	String ObtenerNombre(){
		return txtNomCandidato.getText();
	}
	String ObtenerApellido(){
		return txtApeCandidato.getText();
	}
	int ObtenerEdad(){
		return Integer.parseInt(txtEdadCandidato.getText());
	}
	String ObtenerSexo(){
		return comboBox.getSelectedItem().toString();
	}
	Partido ObtenerPartido(){
		String nombre =comboPartido.getSelectedItem().toString();
		return Data.create().partA.buscarNom(nombre);
	}
	protected void do_btnB_actionPerformed(ActionEvent e) {
		Buscar();
	}
	public void Buscar(){
		try{
			Candidato c=Data.create().candA.buscar(ObtenerCodigo());
			if(c!=	null){
				ListadoBuscar(c);
				mensaje("USUARIO ENCONTRADO");
				btnEliminar.setEnabled(true);
				btnModificar.setEnabled(true);
			}
			else{
				mensaje("El codigo "+ObtenerDNI()+" no existe");
				Limpiar();
			}
		}
		catch(Exception e){
			mensaje("Ingrese codigo correcto");
			txtCodCandidato.setText("");
			txtCodCandidato.grabFocus();
;
		}
	}
	void ListadoBuscar(Candidato b){
		modelo.setRowCount(0);

			Object[] registro={b.getCódigo_candidato(),b.getDni(),b.getNombre(),b.getApellido(),b.getEdad(),b.getPartido().getNom_part()};	
			modelo.addRow(registro);
		

		}
	protected void do_btnModificar_actionPerformed(ActionEvent e) {
		Editar();
	}
	public void Editar(){
		try{
			Candidato c=Data.create().candA.buscar(ObtenerCodigo());
			int dni=ObtenerDNI();
			String nombre=ObtenerNombre();
			String apelli=ObtenerApellido();
			int edad=ObtenerEdad();
			if(c!=null){

				
					c.setNombre(nombre);
					c.setApellido(apelli);
					c.setEdad(edad);;
					mensaje("DATOS  MODIFICADOS");
					Listado();
					Limpiar();
				
			}
			else{
				mensaje("El CODIGO "+ObtenerCodigo()+" NO EXISTE");
				Limpiar();
			}
		}
		catch(Exception e){
			mensaje("Ingrese todos los campos");
			txtNomCandidato.grabFocus();
		}
	}
	protected void do_btnEliminar_actionPerformed(ActionEvent e) {
		try{
			Candidato c=Data.create().candA.buscar(ObtenerCodigo());
			if(c!=null){
				Data.create().candA.eliminar(c);
				Listado();
				Limpiar();
				mensaje("CANDIDATO ELIMINADO");
				txtCodCandidato.grabFocus();
			}
			else{
				mensaje("El CÓDIGO "+ObtenerCodigo()+" NO EXISTE");
				Limpiar();
			}
		}
		catch(Exception a){
			mensaje("INGRESE CÓDIGO CORRECTO");
			txtCodCandidato.setText("");
			txtCodCandidato.grabFocus();
		}
	}
	protected void do_btnRegresar_actionPerformed(ActionEvent e) {
		dispose();
		Principal principal = new Principal();
		principal.setVisible(true);
	}
	protected void do_btnSubir_actionPerformed(ActionEvent e) {
		cargarImagen();
	}
	String des="";
	private JButton btnAgregar;
	public void cargarImagen(){
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
				int cod=id+1;
				 des = System.getProperty("user.dir")+"/src/resources/"+cod+archivo.getName();
				Path destino = Paths.get(des);
				String orig = archivo.getPath();
				Path origen = Paths.get(orig);
				Files.copy(origen, destino,StandardCopyOption.REPLACE_EXISTING);
				mensaje("Foto cargada");
			}
			catch(Exception d){
				mensaje("Error Al cargar Imagen");
			}
			
			}
//		mensaje("Cancelo la operación");
	}
	boolean validar(){
		for(int i=0;i<Data.create().candA.tamaño();i++){
			if (ObtenerPartido().getSigla()==Data.create().candA.Obtener(i).getPartido().getSigla()){
				return false;
			}
			
		}
		return true;
	}
	protected void do_btnAgregar_actionPerformed(ActionEvent e) {
		DatosPartido partido=new DatosPartido(true);
		partido.setVisible(true);

	}
	
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == comboPartido) {
			do_comboPartido_mouseClicked(e);
		}
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	protected void do_comboPartido_mouseClicked(MouseEvent e) {
		 AgregarCombo(comboPartido);
	}
	public void keyPressed(KeyEvent arg0) {
	}
	public void keyReleased(KeyEvent arg0) {
		if (arg0.getSource() == txtEdadCandidato) {
			do_txtEdadCandidato_keyReleased(arg0);
		}
		if (arg0.getSource() == txtApeCandidato) {
			do_txtApeCandidato_keyReleased(arg0);
		}
		if (arg0.getSource() == txtNomCandidato) {
			do_txtNomCandidato_keyReleased(arg0);
		}
		if (arg0.getSource() == txtDNICandidato) {
			do_txtDNICandidato_keyReleased(arg0);
		}
		if (arg0.getSource() == txtCodCandidato) {
			do_txtCodCandidato_keyReleased(arg0);
		}
		if (arg0.getSource() == btnEliminar) {
			do_btnEliminar_keyReleased(arg0);
		}
		if (arg0.getSource() == btnB) {
			do_btnB_keyReleased(arg0);
		}
		if (arg0.getSource() == btnModificar) {
			do_btnModificar_keyReleased(arg0);
		}
		if (arg0.getSource() == btnRegistrarDatos) {
			do_btnRegistrarDatos_keyReleased(arg0);
		}
	}
	public void keyTyped(KeyEvent arg0) {
	}
	protected void do_btnRegistrarDatos_keyReleased(KeyEvent arg0) {

	}
	protected void do_btnModificar_keyReleased(KeyEvent arg0) {

	}
	protected void do_btnB_keyReleased(KeyEvent arg0) {

	}
	protected void do_btnEliminar_keyReleased(KeyEvent arg0) {

	}
	protected void do_txtCodCandidato_keyReleased(KeyEvent arg0) {
		HabilitarBoton();
	}
	protected void do_txtDNICandidato_keyReleased(KeyEvent arg0) {
		HabilitarBoton();
	}
	protected void do_txtNomCandidato_keyReleased(KeyEvent arg0) {
		HabilitarBoton();
	}
	protected void do_txtApeCandidato_keyReleased(KeyEvent arg0) {
		HabilitarBoton();
	}
	protected void do_txtEdadCandidato_keyReleased(KeyEvent arg0) {
		HabilitarBoton();
	}
}
