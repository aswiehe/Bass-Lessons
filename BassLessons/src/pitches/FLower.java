package pitches;
import javafx.scene.image.Image;

public class FLower {

	static Image standard = new Image("F_Lower_Clef.png");
	//static Image tab = new Image("F_Lower_Fret");
	static char letter = 'f';
	static boolean flat = false;
	static boolean sharp = false;
	static int octave = 1;
	static String note = Character.toUpperCase(letter) + Integer.toString(octave);
}
