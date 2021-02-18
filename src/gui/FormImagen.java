package gui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class FormImagen extends JPanel {

	/**
	 * Create the panel.
	 */
	public FormImagen() {
		
		this.setSize(400,280);

	}
	private Image imagen;
	
	 @Override
       public void paintComponent(Graphics g)
       {
          Dimension tamanio = getSize();
          ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/images/fondo.jpg"));
          g.drawImage(imagenFondo.getImage(), 0, 0, tamanio.width,tamanio.height,null);
          setOpaque(false);
          super.paintComponent(g);
          
       }

}
