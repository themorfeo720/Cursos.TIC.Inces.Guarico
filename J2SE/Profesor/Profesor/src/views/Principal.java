package views;

import java.awt.BorderLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JMenuBar barraMenu = null;
	private JMenu menuOpciones = null;
	private JMenuItem menuItemCalculadora = null;
	private IniciarSesion iniciar_Sesion;
	private JMenu menuAyuda = null;
	private JMenuItem menuItemSalir = null;
	private JDesktopPane contenedorPrincipal = null;
	private JInternalFrame jInternalFrame = null;
	private JPanel jContentPane = null;


	private JMenuBar getBarraMenu() {
		if (barraMenu == null) {
			barraMenu = new JMenuBar();
			barraMenu.setVisible(false);
			barraMenu.setToolTipText("Barra de Menus");
			barraMenu.add(getMenuOpciones());
			barraMenu.add(getMenuAyuda());
		}
		return barraMenu;
	}

	private JMenu getMenuOpciones() {
		if (menuOpciones == null) {
			menuOpciones = new JMenu();
			menuOpciones.setText("Menu Opciones");
			menuOpciones.add(getMenuItemCalculadora());
		}
		return menuOpciones;
	}

	private JMenuItem getMenuItemCalculadora() {
		if (menuItemCalculadora == null) {
			menuItemCalculadora = new JMenuItem();
			menuItemCalculadora.setText("Calculadora");
			menuItemCalculadora.addActionListener(new ActionListener()
			{
		public void actionPerformed(ActionEvent e)
		{
		if(iniciar_Sesion == null || iniciar_Sesion.isVisible()==false)
		{
			iniciar_Sesion = new IniciarSesion();
			iniciar_Sesion.setVisible(true);
			contenedorPrincipal.add(iniciar_Sesion);
		   
		  
		}			            	
		}
			        });
				
				
		}
		return menuItemCalculadora;
	}

	private JMenu getMenuAyuda() {
		if (menuAyuda == null) {
			menuAyuda = new JMenu();
			menuAyuda.setText("Ayuda");
			menuAyuda.add(getMenuItemSalir());
		}
		return menuAyuda;
	}

	private JMenuItem getMenuItemSalir() {
		if (menuItemSalir == null) {
			menuItemSalir = new JMenuItem();
			menuItemSalir.setText("Salir");
		}
		return menuItemSalir;
	}

	/**
	 * This method initializes contenedorPrincipal	
	 * 	
	 * @return javax.swing.JDesktopPane	
	 */
	private JDesktopPane getContenedorPrincipal() {
		if (contenedorPrincipal == null) {
			contenedorPrincipal = new JDesktopPane();
			contenedorPrincipal.add(getJInternalFrame(), null);
		}
		return contenedorPrincipal;
	}

	/**
	 * This method initializes jInternalFrame	
	 * 	
	 * @return javax.swing.JInternalFrame	
	 */
	private JInternalFrame getJInternalFrame() {
		if (jInternalFrame == null) {
			jInternalFrame = new JInternalFrame();
			jInternalFrame.setBounds(new Rectangle(192, 98, 278, 98));
			jInternalFrame.setVisible(true);
			jInternalFrame.setContentPane(getJContentPane());
		}
		return jInternalFrame;
	}

	/**
	 * This method initializes jContentPane	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
		}
		return jContentPane;
	}

	public static void main(String[] args) {
		Principal thisClass = new Principal();
		thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		thisClass.setVisible(true);

	}
	public Principal() {

		initialize();
	}

	private void initialize() {
		this.setSize(800, 600);
		this.setContentPane(getContenedorPrincipal());
		this.setJMenuBar(getBarraMenu());
		this.setTitle("Ventana Principal");

	}
	
}  //  @jve:decl-index=0:visual-constraint="10,10"
