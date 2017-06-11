package notes;
import javafx.scene.image.Image;

public class CLower {

	static Image standard = new Image("C_Lower_Clef.png");
	//static Image tab = new Image("C_Lower_Fret");
	static char letter = 'c';
	static boolean flat = false;
	static boolean sharp = false;
	static int octave = 2;
	static String note = Character.toUpperCase(letter) + Integer.toString(octave);
}
