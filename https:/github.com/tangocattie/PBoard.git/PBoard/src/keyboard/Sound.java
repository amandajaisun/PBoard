package keyboard;

import java.net.MalformedURLException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 * The Sound will 
 * @author amandasun
 * @version 1.0 [5/4/18]
 */
public class Sound {
	private static URL sound;

	public Sound(String url) {
		sound = getClass().getClassLoader().getResource(url);
		
	}

	public static void playSound() throws Exception{
		try {
			Clip clip = AudioSystem.getClip();
			AudioInputStream inputStream = AudioSystem.getAudioInputStream(sound);
			clip.open(inputStream);
			clip.start(); 
		} catch (Exception e) {
			e.printStackTrace();
		}/*
	      URL url = new URL("http://pscode.org/media/leftright.wav");
	          Clip clip = AudioSystem.getClip();
	          // getAudioInputStream() also accepts a File or InputStream
	          AudioInputStream ais = AudioSystem.
	              getAudioInputStream( url );
	          clip.open(ais);
	          clip.loop(Clip.LOOP_CONTINUOUSLY);
	          SwingUtilities.invokeLater(new Runnable() {
	              public void run() {
	                  // A GUI element to prevent the Clip's daemon Thread
	                  // from terminating at the end of the main()
	                  JOptionPane.showMessageDialog(null, "Close to exit!");
	              }
	          });*/
	}
	
	
}

