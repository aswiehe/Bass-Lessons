package pitches;
import javafx.scene.image.Image;

public class FHigh {

	static Image standard = new Image("F_High_Clef.png");
	//static Image tab = new Image("F_High_Fret");
	static char letter = 'f';
	static boolean flat = false;
	static boolean sharp = false;
	static int octave = 5;
	static String note = Character.toUpperCase(letter) + Integer.toString(octave);
}
