package pitches;
import javafx.scene.image.Image;

public class EMiddle {

	static Image standard = new Image("E_Middle_Clef.png");
	//static Image tab = new Image("E_Middle_Fret");
	static char letter = 'e';
	static boolean flat = false;
	static boolean sharp = false;
	static int octave = 2;
	static String note = Character.toUpperCase(letter) + Integer.toString(octave);
}
