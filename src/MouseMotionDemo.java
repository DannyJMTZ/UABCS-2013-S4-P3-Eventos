import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;


public class MouseMotionDemo extends JFrame implements MouseMotionListener, MouseListener, KeyListener{
	
	private int x;
	private int y;
	
	private int x2;
	private int y2;
	
	private boolean isClicked = false;
	private boolean paint = false;
	private String figure = "linea";
	
	public MouseMotionDemo(){
		
		this.setSize( 500, 500 );
		this.setTitle("MouseMotionDemo");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		this.addMouseMotionListener(this);
		this.addMouseListener(this);
		this.addKeyListener(this);
		
	}
	
	@Override
	public void mouseDragged(MouseEvent arg0) {
		
		System.out.println("mouseDragged");
		// System.out.println("X: " + arg0.getXOnScreen());
		// System.out.println("Y: " + arg0.getYOnScreen());
		
		System.out.println("X: " + arg0.getX());
		System.out.println("Y: " + arg0.getY());
				
		// this.x = arg0.getX();
		// this.y = arg0.getY();
		
		this.x2 = arg0.getX();
		this.y2 = arg0.getY();
		
		this.repaint();
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		
		System.out.println("mouseMoved");
		System.out.println("X: " + arg0.getXOnScreen());
		System.out.println("Y: " + arg0.getYOnScreen());
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) { 
		
		System.out.println("MouseClicked");
		
		this.x = arg0.getX();
		this.y = arg0.getY();
		
		paint = true;
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) { }
	@Override
	public void mouseExited(MouseEvent arg0) { }
	@Override
	public void mousePressed(MouseEvent arg0) { }
	@Override
	public void mouseReleased(MouseEvent arg0) { 
		paint = false;
	}
	
	@Override
	public void paint(Graphics g) {
		
		Graphics2D g2 = (Graphics2D)g;
		
		if(paint){
			
			switch(figure){
				case "linea":
					g2.drawLine( this.x , this.y ,  this.x2 , this.y2 );
					break;
				case "elipse":
					g2.drawOval( this.x, this.y, this.x2 , this.y2 );
					break;
			}
			
		}
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if( arg0.getKeyCode() == 17)
			this.figure = "elipse";
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		this.figure = "linea";
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
