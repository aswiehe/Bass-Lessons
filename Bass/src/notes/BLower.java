package notes;
import javafx.scene.image.Image;

public class BLower {

	static Image standard = new Image("B_Lower_Clef.png");
	//static Image tab = new Image("B_Lower_Fret");
	static char letter = 'b';
	static boolean flat = false;
	static boolean sharp = false;
	static int octave = 1;
	static String note = Character.toUpperCase(letter) + Integer.toString(octave);
}
