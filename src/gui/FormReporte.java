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

public class FormReporte extends JFrame implements ActionListener {
	private Image img_buscar= new ImageIcon(FormLogin.class.getResource("/resources/buscar.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image img_registrar= new ImageIcon(FormLogin.class.getResource("/resources/registrar.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image img_borrar= new ImageIcon(FormLogin.class.getResource("/resources/borrar.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image img_editar= new ImageIcon(FormLogin.class.getResource("/resources/editar.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image img_menu= new ImageIcon(FormLogin.class.getResource("/resources/menu.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	
	private JPanel contentPane;
	private JTable tabla_votante;
	private DefaultTableModel modelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormReporte frame = new FormReporte();
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
	public FormReporte() {
		setTitle("Reportes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 420, 460);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		modelo =new DefaultTableModel();
		setLocationRelativeTo(null);
		
		modelo.addColumn("DNI");
		modelo.addColumn("NOMBRE");
		modelo.addColumn("APELLIDOS");
		modelo.addColumn("USUARIO");
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 97, 21);
		contentPane.add(menuBar);
		
		mnReporte = new JMenu("Reportes ");
		menuBar.add(mnReporte);
		
		mntmCandidatos = new JMenuItem("Candidatos");
		mntmCandidatos.addActionListener(this);
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
		if (arg0.getSource() == mntmCandidatos) {
			do_mntmCandidatos_actionPerformed(arg0);
		}
	}
	
	VotanteArray vtnteA=new VotanteArray();
	VotoArray votoA=new VotoArray();
	
	VotanteArray varray=new VotanteArray();
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
	

	
	protected void do_mntmCandidatos_actionPerformed(ActionEvent arg0) {
		FormReporteCandidato reporteCandidato = new FormReporteCandidato();
		reporteCandidato.setVisible(true);
		this.dispose();
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
