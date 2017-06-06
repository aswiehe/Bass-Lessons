package pitches;
import javafx.scene.image.Image;

public class BMiddle {

	static Image standard = new Image("B_Middle_Clef.png");
	//static Image tab = new Image("B_Middle_Fret");
	static char letter = 'b';
	static boolean flat = false;
	static boolean sharp = false;
	static int octave = 2;
	static String note = Character.toUpperCase(letter) + Integer.toString(octave);
}
