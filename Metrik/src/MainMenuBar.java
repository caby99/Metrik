import java.awt.*;

public class MainMenuBar extends MenuBar {
	
	private Menu _menu;
	private DrawObject obj;

	public MainMenuBar() {
		_menu = new Menu("Hintergrundfarbe-Programm");
		_menu.add(new MenuItem("Farbe: rot"));
		_menu.add(new MenuItem("Farbe: gelb"));
		_menu.add(new MenuItem("Farbe: grün"));
		
		obj = new DrawObject(500, 500, 1);
		
		add(_menu);
		



	}
}
