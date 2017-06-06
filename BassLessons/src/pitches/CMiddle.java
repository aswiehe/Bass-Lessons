package pitches;
import javafx.scene.image.Image;

public class CMiddle {

	static Image standard = new Image("C_Middle_Clef.png");
	//Image tab = new Image("C_Middle_Fret");
	static char letter = 'c';
	static boolean flat = false;
	static boolean sharp = false;
	static int octave = 3;
	static String note = Character.toUpperCase(letter) + Integer.toString(octave);
}
