import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;

public class DrawObject extends Canvas implements MouseListener{
	
	private Float _x, _y;
	private Canvas canvas;
	private int _counter;
	private int _sizeX = 0;
	private int _sizeY = 0;
	
	public DrawObject(int sizeX, int sizeY) {
		this._sizeX = sizeX;
		this._sizeY = sizeY;
		
		_x = _y = (float) 0;
		_counter = 0;
		
		setSize(_sizeX, _sizeY);
		setBackground(Color.green);	
		
		addMouseListener(this);
	}
	
	@Override
	public void paint(Graphics g) {
		if(_x == 0 && _y == 0) return;
		
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke(3.0F));
		
		Ellipse2D ellipse2D = new Ellipse2D.Float(
				_x, _y, 
				50, 50
				);
		
		g2d.draw(ellipse2D);			

		if(_counter > 1) {
			g2d.clearRect(0, 0, _sizeX, _sizeY);
			_counter = -1;
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		_x = (float) e.getX();
		_y = (float) e.getY();

		paint(getGraphics());
		_counter++;
		
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
