package notes;
import javafx.scene.image.Image;

public class DLower {

	static Image standard = new Image("D_Lower_Clef.png");
	//static Image tab = new Image("D_Lower_Fret");
	static char letter = 'd';
	static boolean flat = false;
	static boolean sharp = false;
	static int octave = 1;
	static String note = Character.toUpperCase(letter) + Integer.toString(octave);
}
