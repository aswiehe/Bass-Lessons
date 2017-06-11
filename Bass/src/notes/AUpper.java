package notes;
import javafx.scene.image.Image;

public class AUpper{

	static Image standard = new Image("A_Upper_Clef.png");
	//static Image tab = new Image("A_Upper_Fret");
	static char letter = 'a';
	static boolean flat = false;
	static boolean sharp = false;
	static int octave = 3;
	static String note = Character.toUpperCase(letter) + Integer.toString(octave);

}
