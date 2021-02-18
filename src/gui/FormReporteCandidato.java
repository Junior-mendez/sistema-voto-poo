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
import java.awt.Component;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;

public class FormReporteCandidato extends JFrame implements ActionListener, MouseListener {
	private Image img_buscar= new ImageIcon(FormLogin.class.getResource("/resources/buscar.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image img_registrar= new ImageIcon(FormLogin.class.getResource("/resources/registrar.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image img_borrar= new ImageIcon(FormLogin.class.getResource("/resources/borrar.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image img_editar= new ImageIcon(FormLogin.class.getResource("/resources/editar.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image img_menu= new ImageIcon(FormLogin.class.getResource("/resources/menu.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	
	private JPanel contentPane;
	private JLabel lblNombre;
	private JLabel label;
	private JLabel lblApellido;
	private JLabel lblSexo;
	private JTextArea txtDNIVotante;
	private JTextArea txtNomVotante;
	private JTextArea txtApeVotante;
	private JComboBox txtSex;
	private JTable tabla_votante;
	private DefaultTableModel modelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormReporteCandidato frame = new FormReporteCandidato();
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
	public FormReporteCandidato() {
		setTitle("CANDIDATO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1022, 568);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		lblNombre = new JLabel("Candidato");
		lblNombre.setBounds(10, 41, 77, 22);
		lblNombre.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNombre.setForeground(Color.WHITE);
		contentPane.add(lblNombre);
		
		label = new JLabel("NOMBRE:");
		label.setBounds(10, 76, 77, 22);
		label.setFont(new Font("Arial Black", Font.PLAIN, 11));
		label.setForeground(Color.WHITE);
		contentPane.add(label);
		
		lblApellido = new JLabel("APELLIDO:");
		lblApellido.setBounds(10, 111, 77, 22);
		lblApellido.setForeground(Color.WHITE);
		lblApellido.setFont(new Font("Arial Black", Font.PLAIN, 11));
		contentPane.add(lblApellido);
		
		lblSexo = new JLabel("TIPO");
		lblSexo.setBounds(10, 181, 77, 22);
		lblSexo.setForeground(Color.WHITE);
		lblSexo.setFont(new Font("Arial Black", Font.PLAIN, 11));
		contentPane.add(lblSexo);
		
		txtDNIVotante = new JTextArea();
		txtDNIVotante.setBounds(129, 41, 129, 22);
		contentPane.add(txtDNIVotante);
		
		txtNomVotante = new JTextArea();
		txtNomVotante.setBounds(129, 76, 129, 22);
		contentPane.add(txtNomVotante);
		
		txtApeVotante = new JTextArea();
		txtApeVotante.setBounds(129, 111, 129, 22);
		contentPane.add(txtApeVotante);
		
		txtSex = new JComboBox();
		txtSex.setBounds(129, 181, 129, 22);
		txtSex.setFont(new Font("Arial Black", Font.PLAIN, 11));
		txtSex.setModel(new DefaultComboBoxModel(new String[] {"CANDIDATO", "ENCARGADO", "VOTANTE"}));
		contentPane.add(txtSex);
		
		scrollPane = new JScrollPane();
		scrollPane.setAlignmentX(Component.RIGHT_ALIGNMENT);
		scrollPane.setBounds(12, 243, 984, 227);
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
		btnEliminar.setBounds(450, 42, 137, 35);
		btnEliminar.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnEliminar.addActionListener(this);
		btnEliminar.setIcon(new ImageIcon(img_borrar));
		contentPane.add(btnEliminar);
		
		btnModificar = new JButton("MODIFICAR");
		btnModificar.setBounds(77, 264, 137, 35);
		btnModificar.setMinimumSize(new Dimension(89, 23));
		btnModificar.setMaximumSize(new Dimension(89, 23));
		btnModificar.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnModificar.addActionListener(this);
		btnModificar.setIcon(new ImageIcon(img_editar));
		contentPane.add(btnModificar);
		
		btnBuscar = new JButton("BUSCAR");
		btnBuscar.setBounds(320, 146, 137, 36);
		contentPane.add(btnBuscar);
		btnBuscar.setBackground(UIManager.getColor("Button.background"));
		btnBuscar.setBorder(null);
		btnBuscar.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnBuscar.setIcon(new ImageIcon(img_buscar));
		
		btnMenu = new JButton("MENU");
		btnMenu.setBounds(12, 482, 96, 36);
		btnMenu.addActionListener(this);
		btnMenu.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnMenu.setBorder(null);
		btnMenu.setBackground(SystemColor.menu);
		contentPane.add(btnMenu);
		btnBuscar.addActionListener(this);
		btnMenu.setIcon(new ImageIcon(img_menu));
		
		label_1 = new JLabel("USUARIO:");
		label_1.setBounds(10, 144, 96, 22);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Arial Black", Font.PLAIN, 11));
		contentPane.add(label_1);
		
		textUsuario = new JTextArea();
		textUsuario.setBounds(129, 144, 129, 22);
		contentPane.add(textUsuario);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 97, 21);
		contentPane.add(menuBar);
		
		mnReporte = new JMenu("Reportes ");
		menuBar.add(mnReporte);
		
		mntmCandidatos = new JMenuItem("Candidatos");
		mnReporte.add(mntmCandidatos);
		
		mntmVotantes = new JMenuItem("Votantes");
		mntmVotantes.addActionListener(this);
		mnReporte.add(mntmVotantes);
		
		mntmNewMenuItem = new JMenuItem("Encargados");
		mntmNewMenuItem.addActionListener(this);
		mnReporte.add(mntmNewMenuItem);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == mntmNewMenuItem) {
			do_mntmNewMenuItem_actionPerformed(arg0);
		}
		if (arg0.getSource() == mntmVotantes) {
			do_mntmVotantes_actionPerformed(arg0);
		}
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
	}
	
	VotanteArray vtnteA=new VotanteArray();
	VotoArray votoA=new VotoArray();
	private JButton btnBuscar;
	
	VotanteArray varray=new VotanteArray();
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnEliminar;
	private JButton btnModificar;
	private JButton btnMenu;
	private JLabel label_1;
	private JTextArea textUsuario;
	private JMenuBar menuBar;
	private JMenu mnReporte;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmVotantes;
	private JMenuItem mntmCandidatos;

	void Listado(){
		modelo.setRowCount(0);
		for(int i=0;i<vtnteA.tamaño();i++){
			Object[] registro={vtnteA.Obtener(i).getDni(),vtnteA.Obtener(i).getNombre(),vtnteA.Obtener(i).getApellido(),vtnteA.Obtener(i).getUsuario_votante()};	
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

	String ObtenerSexo(){
		return txtSex.toString();
	}
	String ObtenerUsuario(){
		return textUsuario.getText();
	}


	protected void do_btnBuscar_actionPerformed(ActionEvent arg0) {
		Buscar();
	}
	public void Buscar(){
		try{
			Votante v=vtnteA.buscar(ObtenerDNI());
			if(v!=	null){
				ListadoBuscar(v);
				mensaje("USUARIO ENCONTRADO");
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
;
		}
	}
	void Limpiar(){
		txtDNIVotante.setText("");
		txtNomVotante.setText("");
		txtApeVotante.setText("");
		textUsuario.setText("");

		txtDNIVotante.grabFocus();
	}


	protected void do_btnModificar_actionPerformed(ActionEvent arg0) {
		Editar();
	}
	public void Editar(){
		try{
			Votante v=vtnteA.buscar(ObtenerDNI());
			
			String nombre=ObtenerNombre();
			String apelli=ObtenerApellido();
			String usu=ObtenerUsuario();

			if(v!=null){

				
					v.setNombre(nombre);
					v.setApellido(apelli);
					v.setUsuario_votante(usu);;
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
			Votante v=vtnteA.buscar(ObtenerDNI());
			if(v!=null){
				vtnteA.eliminar(v);
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
		dispose();
		Principal principal = new Principal();
		principal.setVisible(true);
	}
	protected void do_mntmVotantes_actionPerformed(ActionEvent arg0) {
		FormReporteVotante reporteVotante = new FormReporteVotante();
		reporteVotante.setVisible(true);
		this.dispose();
	}
	protected void do_mntmNewMenuItem_actionPerformed(ActionEvent arg0) {
		FormReporteEncargado reporteEncargado = new FormReporteEncargado();
		reporteEncargado.setVisible(true);
		this.dispose();
	}
}
