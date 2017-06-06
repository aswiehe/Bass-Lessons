package pitches;
import javafx.scene.image.Image;

public class EUpper {

	static Image standard = new Image("E_Upper_Clef.png");
	//static Image tab = new Image("E_Upper_Fret");
	static char letter = 'e';
	static boolean flat = false;
	static boolean sharp = false;
	static int octave = 3;
	static String note = Character.toUpperCase(letter) + Integer.toString(octave);
}
