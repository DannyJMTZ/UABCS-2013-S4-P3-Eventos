import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class WindowHandlerDemo extends JFrame implements WindowListener{
	
	
	public WindowHandlerDemo(){
		
		this.setLayout( null );
		// this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle( "WindowHandlerDemo" );
		this.setSize( 500 , 500 );
		this.setLocationRelativeTo( null );
		
		this.addWindowListener(this);
		
	}
	
	@Override
	public void windowActivated(WindowEvent arg0) { System.out.println("WindowActivated\nActivado\n"); }
	
	@Override
	public void windowClosed(WindowEvent arg0) { System.out.println("WindowClosed\nCerrado\n"); }
	
	@Override
	public void windowClosing(WindowEvent arg0) { 
		System.out.println("WindowClosing\nCerrando\n");
		
		int option = JOptionPane.showConfirmDialog( this , "Desea cerrar?", "D:", JOptionPane.YES_NO_OPTION);
		
		if(option == 0)
			System.exit( 0 );
		else{
			
			
		}
		
	}
	
	@Override
	public void windowDeactivated(WindowEvent arg0) { System.out.println("WindowDeactivated\nDesactivada\n"); }
	
	@Override
	public void windowDeiconified(WindowEvent arg0) { System.out.println("WindowDeiconified\nMaximizar\n"); }
	
	@Override
	public void windowIconified(WindowEvent arg0) { System.out.println("WindowIconified\nMinimizar\n"); }
	
	@Override
	public void windowOpened(WindowEvent arg0) { System.out.println("WindowOpened\nAbrierto\n"); }
	
}
