package pitches;
import javafx.scene.image.Image;

public class FUpper {

	static Image standard = new Image("F_Upper_Clef.png");
	//static Image tab = new Image("F_Upper_Fret");
	static char letter = 'f';
	static boolean flat = false;
	static boolean sharp = false;
	static int octave = 3;
	static String note = Character.toUpperCase(letter) + Integer.toString(octave);
}
