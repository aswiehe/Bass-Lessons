package pitches;
import javafx.scene.image.Image;

public class CUpper {

		static Image standard = new Image("C_Upper_Clef.png");
		//static Image tab = new Image("C_Upper_Fret");
		static char letter = 'c';
		static boolean flat = false;
		static boolean sharp = false;
		static int octave = 4;
		static String note = Character.toUpperCase(letter) + Integer.toString(octave);
}
