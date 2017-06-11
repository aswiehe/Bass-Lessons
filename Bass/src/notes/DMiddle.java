package notes;
import javafx.scene.image.Image;

public class DMiddle {

	static Image standard = new Image("D_Middle_Clef.png");
	//static Image tab = new Image("D_Middle_Fret");
	static char letter = 'd';
	static boolean flat = false;
	static boolean sharp = false;
	static int octave = 2;
	static String note = Character.toUpperCase(letter) + Integer.toString(octave);
}
