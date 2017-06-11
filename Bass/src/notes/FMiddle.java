package notes;
import javafx.scene.image.Image;

public class FMiddle {

	static Image standard = new Image("F_Middle_Clef.png");
	//static Image tab = new Image("F_Middle_Fret");
	static char letter = 'f';
	static boolean flat = false;
	static boolean sharp = false;
	static int octave = 2;
	static String note = Character.toUpperCase(letter) + Integer.toString(octave);
}
