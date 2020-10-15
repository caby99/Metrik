import java.awt.*;
import java.awt.event.*;

public class MainWindow extends Frame implements WindowListener{

		private int _x;
		private int _y;
		
		public MainWindow(int windowSizeX, int windowSizeY) {
			this._x = windowSizeX;
			this._y = windowSizeY;
			
			setTitle("Programm f�r Softwaretechnik");
			setSize(_x, _y);
			
			addWindowListener(this);
			add(new DrawObject(_x, _y));
			setMenuBar(new MainMenuBar());
		}
		
		public int getX() {
			return _x;
		}
		
		public int getY() {
			return _y;
		}
		
		
		public void openWindow() {
			setVisible(true);
		}

		@Override
		public void windowOpened(WindowEvent e) {
			
		}

		@Override
		public void windowClosing(WindowEvent e) {
			dispose();
			System.exit(0);
		}

		@Override
		public void windowClosed(WindowEvent e) {
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			
		}

		@Override
		public void windowActivated(WindowEvent e) {
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			
		}
}
