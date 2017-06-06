package pitches;
import javafx.scene.image.Image;

public class GLower extends PitchBuilder{

	static Image standard = new Image("G_Lower_Clef.png");
	//static Image tab = new Image("G_Lower_Fret");
	static char letter = 'g';
	static boolean flat = false;
	static boolean sharp = false;
	static int octave = 1;
	static String note = Character.toUpperCase(letter)+ Integer.toString(octave);
	//public Image circle = new Image("Cirlce.png");
	
	public void displayStandard(){} 	// Prints image of G_Lower_Clef to screen, which includes both the bass clef and also the G note
	public void displayTab(){} 			// Prints image of G_Lower_Fret to screen, which includes both the guitar neck and also the G notes
	public void displayLetter(){}		// Implements toUpperCase method to print the letter "G" to the screen, ideally, right over the quarter note or fret
	public void displayFlat(){}			// Prints image of flat sign to screen next to the letter "G" printed by displayLetter method
	public void displaySharp(){}		// Prints image of sharp sign to screen next to the letter "G" printed by displayLetter method
	public void displayOctave(){}		// Prints solid transparent image colored either red, yellow, green or blue depending on octave note is in across all notes or frets in that octave (starting at C)
	public void displayNote(){}			// Prints the note to the screen, in this context, a concatenation of the the capital letter of the note and the octave it is in
}
