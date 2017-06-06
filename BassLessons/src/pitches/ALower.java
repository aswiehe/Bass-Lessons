package pitches;
import javafx.scene.image.Image;

public class ALower {

	static Image standard = new Image("A_Lower_Clef.png");
	//static Image tab = new Image("A_Lower_Fret");
	static char letter = 'a';
	static boolean flat = false;
	static boolean sharp = false;
	static int octave = 1;
	static String note = Character.toUpperCase(letter) + Integer.toString(octave);
}
