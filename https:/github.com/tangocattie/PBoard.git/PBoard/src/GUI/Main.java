package GUI;
import java.awt.*; 
import javax.swing.*; 

public class Main {

	public static void main(String[] args) 
	{ 
		JFrame window = new JFrame("pBOARD"); // sets bounds of window frame that panel appears in
		window.setBounds(300, 300, 200, 150);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GamePanel panel = new GamePanel(); // gamepanel
		panel.setBackground(Color.WHITE);
		Container c = window.getContentPane();
		c.add(panel);
		window.setVisible(true); // makes window visible at all time	
	}
}
