package notes;
import javafx.scene.image.Image;

public class GUpper {

	static Image standard = new Image("G_Upper_Clef.png");
	//static Image tab = new Image("G_Upper_Fret");
	static char letter = 'g';
	static boolean flat = false;
	static boolean sharp = false;
	static int octave = 3;
	static String note = Character.toUpperCase(letter) + Integer.toString(octave); 
}
