package pitches;
import javafx.scene.image.Image;

public class ELower {

	static Image standard = new Image("E_Lower_Clef.png");
	//static Image tab = new Image("E_Lower_Fret");
	static char letter = 'e';
	static boolean flat = false;
	static boolean sharp = false;
	static int octave = 1;
	static String note = Character.toUpperCase(letter) + Integer.toString(octave);
}
