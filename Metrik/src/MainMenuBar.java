//import java.awt.BorderLayout;
//
//import javax.swing.*;
//
//public class MainMenuBar extends JFrame{
//	
//	private int _color;
//	private JMenuBar menuBar;
//	private JMenu fileMenu;
//	private JMenuItem rot;
//	private JMenuItem gruen;
//	private JMenuItem blau;
//	private JMenuItem closeItem;
//
//	public MainMenuBar(int windowSizeX, int windowSizeY, int color) {
//		this._color = color;
//		
//		menuBar = new JMenuBar();
//		 
//        fileMenu = new JMenu("Hintergrund");
// 
//        rot = new JMenuItem("Rot");
//        gruen = new JMenuItem("Gruen");
//        blau = new JMenuItem("Blau");
//        closeItem = new JMenuItem("Schlieﬂen");
//
// 
//        fileMenu.add(rot);
//        fileMenu.add(gruen);
//        fileMenu.add(blau);
//        fileMenu.add(closeItem);
//        
//        menuBar.add(fileMenu);
// 
//        this.add(menuBar, BorderLayout.NORTH);
//        
//        rot.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent e) {
//                _color = 1;
//                setVisible(false);
//                dispose();
//                MainWindow mw = new MainWindow(windowSizeX, windowSizeY, _color);
//        		mw.openWindow();
//            }
//        });
//        
//        gruen.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent e) {
//                _color = 2;
//                setVisible(false);
//                dispose();
//                MainWindow mw = new MainWindow(windowSizeX, windowSizeY, _color);
//        		mw.openWindow();
//            }
//        });
//        
//        blau.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent e) {
//                _color = 3;
//                setVisible(false);
//                dispose();
//                MainWindow mw = new MainWindow(windowSizeX, windowSizeY, _color);
//        		mw.openWindow();
//            }
//        });
//        
//        closeItem.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent e) {
//                System.exit(0);
//            }
//        });
//	}
//}