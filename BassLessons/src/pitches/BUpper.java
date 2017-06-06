package pitches;
import javafx.scene.image.Image;

public class BUpper {

	static Image standard = new Image("B_Upper_Clef.png");
	//static Image tab = new Image("B_Upper_Fret");
	static char letter = 'b';
	static boolean flat = false;
	static boolean sharp = false;
	static int octave = 3;
	static String note = Character.toUpperCase(letter) + Integer.toString(octave);
}
