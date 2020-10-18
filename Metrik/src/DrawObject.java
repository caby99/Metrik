import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class DrawObject extends Canvas implements MouseListener{
	

	private Float _x, _y;
	private int _counter;
	private int _sizeX = 0;
	private int _sizeY = 0;
	private Canvas canvas;
	private String text = "Koordinaten";
//	private int _mouseCounter = 0;
	
	public DrawObject(int sizeX, int sizeY, int color) {
		this._sizeX = sizeX;
		this._sizeY = sizeY;
		
		_x = _y = (float) 0;
		_counter = 0;
		
		setSize(_sizeX, _sizeY);		

		if (color == 1)
			setBackground(Color.red);
		else if (color == 2)
			setBackground(Color.green);
		else if (color == 3)
			setBackground(Color.blue);
		else if (color < 1 || color > 3)
			setBackground(Color.pink);


		
		addMouseListener(this);
	}

	@Override
	public void paint(Graphics g) {
		
		if(_x == 0 && _y == 0) return;
		
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke(3.0F));
		
		Graphics2D rec = (Graphics2D) g;
		rec.setStroke(new BasicStroke(3.0F));
		
		Graphics2D line = (Graphics2D) g;
		line.setStroke(new BasicStroke(3.0F));
		
		Ellipse2D ellipse2D = new Ellipse2D.Float(_x, _y, 50, 50);
		Rectangle2D rectangle2D = new Rectangle2D.Float(_x, _y, 50, 50);
		
		
		g2d.draw(ellipse2D);
		
		if(_y < 20) {
			g2d.drawString(text, _x-20, _y+65);
		} else {
			g2d.drawString(text, _x-20, _y-10);
		}
		
//		Point2D.Float point1 = null;
//		Point2D.Float point2 = null;
//		
//		if(_mouseCounter == 1) {
//			point1 = new Point2D.Float(_x, _y);
//		} else if(_mouseCounter == 2){
//			point2 = new Point2D.Float(_x, _y);
//		} else if(_mouseCounter > 2){
//			Line2D line2D = new Line2D.Float(point1, point2);
//			line.draw(line2D);
//			_mouseCounter = 0;
//		}
		
		
		
		if(_counter > 1) {
			rec.clearRect(0, 0, _sizeX, _sizeY);
			
			_counter = -1;
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		_x = (float) e.getX();
		_y = (float) e.getY();
		text = "Koordinaten: x: "+_x+" y: "+_y;
		
		Graphics graphic = getGraphics();
		paint(getGraphics());
		_counter++;
//		_mouseCounter++;
		
	}
	
	
	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}
	
}
