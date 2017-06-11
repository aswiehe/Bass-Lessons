package notes;
import javafx.scene.image.Image;

public class EHigh {

	static Image standard = new Image("E_High_Clef.png");
	//static Image tab = new Image("E_High_Fret");
	static char letter = 'e';
	static boolean flat = false;
	static boolean sharp = false;
	static int octave = 5;
	static String note = Character.toUpperCase(letter) + Integer.toString(octave);
}
