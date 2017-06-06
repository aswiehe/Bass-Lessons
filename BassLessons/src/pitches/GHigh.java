package pitches;
import javafx.scene.image.Image;

public class GHigh {

	static Image standard = new Image("G_High_Clef.png");
	//static Image tab = new Image("G_High_Fret");
	static char letter = 'g';
	static boolean flat = false;
	static boolean sharp = false;
	static int octave = 5;
	static String note = Character.toUpperCase(letter) + Integer.toString(octave);
}
