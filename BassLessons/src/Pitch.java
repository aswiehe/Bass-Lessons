import javafx.scene.image.Image;

public class Pitch extends Main{

	Image standard;
	Image tab;
	char letter;
	boolean flat;
	boolean sharp;
	int octave;
	
	public void pitch(Image standard, Image tab, char letter, boolean flat, boolean sharp, int octave) {
		this.standard = standard;
		this.tab = tab;
		this.letter = letter;
		this.flat = flat;
		this.sharp = sharp;
		this.octave = octave;		
	}
}