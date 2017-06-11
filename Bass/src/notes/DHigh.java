package notes;
import javafx.scene.image.Image;

public class DHigh {

	static Image standard = new Image("D_High_Clef.png");
	//static Image tab = new Image("D_High_Fret");
	static char letter = 'd';
	static boolean flat = false;
	static boolean sharp = false;
	static int octave = 5;
	static String note = Character.toUpperCase(letter) + Integer.toString(octave);
}
