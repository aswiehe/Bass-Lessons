package pitches;
import javafx.scene.image.Image;

public class GMiddle {

	static Image standard = new Image("G_Middle_Clef.png");
	//static Image tab = new Image("G_Middle_Fret");
	static char letter = 'g';
	static boolean flat = false;
	static boolean sharp = false;
	static int octave = 2;
	static String note = Character.toUpperCase(letter) + Integer.toString(octave);
}
