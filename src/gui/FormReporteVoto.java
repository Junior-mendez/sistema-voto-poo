package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import claseHijos.Candidato;
import claseHijos.Voto;
import claseHijos.VotoArray;
import clasePadre.Data;

import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class FormReporteVoto extends JFrame implements ActionListener {
	private Image img_menu= new ImageIcon(FormLogin.class.getResource("/resources/menu.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
	private Image img_salir= new ImageIcon(FormLogin.class.getResource("/resources/logout.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);

	private JPanel contentPane;
	private JTable table;
	private JButton btnCargar;
	private DefaultTableModel tablaModelo;
	private JScrollPane scrollPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormReporteVoto frame = new FormReporteVoto();
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
	public FormReporteVoto() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 822, 564);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(100, 149, 237), 2));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		tablaModelo =new DefaultTableModel(){
		    public boolean isCellEditable(int rowIndex,int columnIndex){return false;}
		};
		tablaModelo.addColumn("PORCENTAJE DE VOTOS");
		tablaModelo.addColumn("PARTIDO");
		tablaModelo.addColumn("CANDIDATO");

		
		btnCargar = new JButton("PROCESAR VOTOS");
		btnCargar.setFont(new Font("Arial Black", Font.PLAIN, 16));
		btnCargar.addActionListener(this);
		btnCargar.setBounds(10, 11, 307, 38);
		contentPane.add(btnCargar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 60, 764, 116);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(tablaModelo);
		
		btnMenu = new JButton("");
		btnMenu.addActionListener(this);
		btnMenu.setBounds(10, 494, 61, 59);
		contentPane.add(btnMenu);
		btnMenu.setIcon(new ImageIcon(img_menu));
		
		btnSalir = new JButton("");
		btnSalir.addActionListener(this);
		btnSalir.setBounds(719, 494, 65, 59);
		contentPane.add(btnSalir);
		btnSalir.setIcon(new ImageIcon(img_salir));
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnMenu) {
			do_btnRegresar_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnSalir) {
			do_btnSalir_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnCargar) {
			do_btnCargar_actionPerformed(arg0);
		}
	}
	protected void do_btnCargar_actionPerformed(ActionEvent arg0) {
		ContarVotos();
		Listado();
		Graficar();
	}
	ArrayList<Voto> voto = new ArrayList<Voto>();
//	Candidato can=new Candidato();
	public void CargarDatos(){

		for(int i=0; i<Data.votoA.tamaño();i++){
			voto.add(Data.votoA.Obtener(i));
		}
	}
	void Listado(){
		tablaModelo.setRowCount(0);
		for(int i=0;i<Data.candA.tamaño();i++){
			Object[] registro={votos.get(i),Data.candA.Obtener(i).getPartido().getNom_part(),Data.candA.Obtener(i).getNombre()+" "+Data.candA.Obtener(i).getApellido()};	
			tablaModelo.addRow(registro);
		}
	}
	ArrayList votos = new ArrayList();
	private JButton btnMenu;
	private JButton btnSalir;
	public void ContarVotos(){
		for (int i=0;i<Data.partA.tamaño();i++ ){	
			int cont=0;
			Data.partA.Obtener(i).getSigla();
			for (int j=0;j<Data.votoA.tamaño();j++ ){
				Data.votoA.Obtener(j).getCandidato_Voto().getNombre();
				if (Data.partA.Obtener(i).getSigla()==Data.votoA.Obtener(j).getPartido_Voto().getSigla()){
					cont=cont+1;
				}
			}
			votos.add(cont);
		}
	}
	public void Graficar(){
		DefaultCategoryDataset graf = new DefaultCategoryDataset();
		for (int i=0;i<tablaModelo.getRowCount();i++ ){
			graf.setValue(Integer.parseInt(tablaModelo.getValueAt(i, 0).toString()), tablaModelo.getValueAt(i, 1).toString(), tablaModelo.getValueAt(i, 2).toString());
		} 
		JFreeChart ch = ChartFactory.createBarChart3D("Votos Registrados", "Candidatos", "Voto", graf,PlotOrientation.VERTICAL, true, true, false);
		
		ChartPanel cp = new ChartPanel(ch);
        getContentPane().add(cp);
        cp.setBounds(20,180,764,300);
	}
	protected void do_btnSalir_actionPerformed(ActionEvent arg0) {
		if (JOptionPane.showConfirmDialog(null, "Deseas Salir de la Aplicación?","Confirmar",JOptionPane.YES_NO_OPTION)==0){
			this.dispose();
		}
	}
	protected void do_btnRegresar_actionPerformed(ActionEvent arg0) {
		this.dispose();
		Principal principal =new Principal();
		principal.setVisible(true);
	}
}
