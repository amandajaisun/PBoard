package keyboard;

import java.awt.Graphics;
import java.awt.*;
import javax.swing.*;
/**
 * This class sets properties of a Piano's Key object. 
 * 
 * @author rithika, amanda, and keertana
 *4/5/18 V1
 */
public class Key extends JPanel{
	
	private String letter;
	private Sound sound;
	private int width, height; 
	
	/**
	 * Creates a piano key with a letter and sound.
	 * @param l the letter that identifies the key
	 * @param s the sound specified by the key
	 * @param w the width of the key
	 * @param h the height of the key
	 */
	public Key(String l, Sound s, int w, int h) {
		letter = l;
		sound = s; 
		width = w;
		height = h;
	}
	
	//isPressed() not finished
	/**
	 * Returns if the key has been pressed.
	 * @return true or false if a user has pressed this key
	 */
	public boolean isPressed() {
		return false;
	}
	
	/**
	 * Returns the identifying letter of the key.
	 * @return the letter as a String
	 */
	public String getLetter() {
		return letter;
	}
	
	/**
	 * Returns the identifying sound of the key.
	 * @return the sound as a String
	 */
	public Sound getSound() {
		return sound;
	}
	
	/**
	 * Returns String version of the key.
	 * @return letter as a String
	 */
	public String toString() {
		return letter;
	}
	
	
	/**
	 * Draws one key.
	 * @param g the Graphics object the method is acting on.
	 * @param x the x-value of the key's top left corner 
	 * @param y the y-value of the key's top left corner 
	 * @post calls super.paintComponent, makes rectangle of (x,y,width, height) to draw key, 
	 * has sharp notes filled in black and normal notes filled in white, outline color of key is black.
	 */
		public void paintComponent(Graphics g, int x, int y)  
		{
			super.paintComponent(g);
			
			g.setColor(Color.BLACK); 
			g.drawRect(x, y, width, height);
			
			if(letter.length() == 1) 
				g.setColor(Color.WHITE);
			else 
				g.setColor(Color.BLACK);
		
			g.fillRect(x, y, width, height); 
 
			
		}
	
	
	

}
