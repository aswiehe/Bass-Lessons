package notes;
import javafx.scene.image.Image;

public class DUpper {

	static Image standard = new Image("D_Upper_Clef.png");
	//static Image tab = new Image("D_Upper_Fret");
	static char letter = 'd';
	static boolean flat = false;
	static boolean sharp = false;
	static int octave = 3;
	static String note = Character.toUpperCase(letter) + Integer.toString(octave);
}
