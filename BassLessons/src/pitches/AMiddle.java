package pitches;
import javafx.scene.image.Image;

public class AMiddle {

	static Image standard = new Image("A_Middle_Clef.png");
	//static Image tab = new Image("A_Middle_Fret");
	static char letter = 'a';
	static boolean flat = false;
	static boolean sharp = false;
	static int octave = 2;
	static String note = Character.toUpperCase(letter) + Integer.toString(octave);
}
