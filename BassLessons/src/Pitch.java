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
	
	
	// Do some code that puts class objects passed in from pitch method on the screen
	
	// Method that shows or hides standard
	// Method that shows or hides tab
	// Method that shows or hides letter
	// Method that shows or hides flat
	// Method that shows or hides sharp
	// Method that shows or hides octave
}









	/*
	// Lower
	public void dLower() {
		Image standard = new Image("D_Lower_Clef.png");
		//Image tab = new Image("D_Lower_Fret");
		char letter = 'd';
		boolean flat = false;
		boolean sharp = false;
		int octave = 1;
		System.out.println(letter + "yeah");
	}
	
	public void eLower() {
		Image standard = new Image("E_Lower_Clef.png");
		//Image tab = new Image("E_Lower_Fret");
		char letter = 'e';
		boolean flat = false;
		boolean sharp = false;
		int octave = 1;
	}
	
	public void fLower() {
		Image standard = new Image("F_Lower_Clef.png");
		//Image tab = new Image("F_Lower_Fret");
		char letter = 'f';
		boolean flat = false;
		boolean sharp = false;
		int octave = 1;
	}
	
	public void gLower() {
		Image standard = new Image("G_Lower_Clef.png");
		//Image tab = new Image("G_Lower_Fret");
		char letter = 'g';
		boolean flat = false;
		boolean sharp = false;
		int octave = 1;
	}
	
	public void aLower() {
		Image standard = new Image("A_Lower_Clef.png");
		//Image tab = new Image("A_Lower_Fret");
		char letter = 'a';
		boolean flat = false;
		boolean sharp = false;
		int octave = 1;
	}
	
	public void bLower() {
		Image standard = new Image("B_Lower_Clef.png");
		//Image tab = new Image("B_Lower_Fret");
		char letter = 'b';
		boolean flat = false;
		boolean sharp = false;
		int octave = 1;
	}
	
	public void cLower() {
		Image standard = new Image("C_Lower_Clef.png");
		//Image tab = new Image("C_Lower_Fret");
		char letter = 'c';
		boolean flat = false;
		boolean sharp = false;
		int octave = 2;
	}
	
	//Middle
	public void dMiddle() {
		Image standard = new Image("D_Middle_Clef.png");
		//Image tab = new Image("D_Middle_Fret");
		char letter = 'd';
		boolean flat = false;
		boolean sharp = false;
		int octave = 2;
	}
	
	public void eMiddle() {
		Image standard = new Image("E_Middle_Clef.png");
		//Image tab = new Image("E_Middle_Fret");
		char letter = 'e';
		boolean flat = false;
		boolean sharp = false;
		int octave = 2;
	}
	
	public void fMiddle() {
		Image standard = new Image("F_Middle_Clef.png");
		//Image tab = new Image("F_Middle_Fret");
		char letter = 'f';
		boolean flat = false;
		boolean sharp = false;
		int octave = 2;
	}
	
	public void gMiddle() {
		Image standard = new Image("G_Middle_Clef.png");
		//Image tab = new Image("G_Middle_Fret");
		char letter = 'g';
		boolean flat = false;
		boolean sharp = false;
		int octave = 2;
	}
	
	public void aMiddle() {
		Image standard = new Image("A_Middle_Clef.png");
		//Image tab = new Image("A_Middle_Fret");
		char letter = 'a';
		boolean flat = false;
		boolean sharp = false;
		int octave = 2;
	}
	
	public void bMiddle() {
		Image standard = new Image("B_Middle_Clef.png");
		//Image tab = new Image("B_Middle_Fret");
		char letter = 'b';
		boolean flat = false;
		boolean sharp = false;
		int octave = 2;
	}
	
	public void cMiddle() {
		Image standard = new Image("C_Middle_Clef.png");
		//Image tab = new Image("C_Middle_Fret");
		char letter = 'c';
		boolean flat = false;
		boolean sharp = false;
		int octave = 3;
	}

	//Upper
	public void dUpper() {
		Image standard = new Image("D_Upper_Clef.png");
		//Image tab = new Image("D_Upper_Fret");
		char letter = 'd';
		boolean flat = false;
		boolean sharp = false;
		int octave = 3;
	}
	
	public void eUpper() {
		Image standard = new Image("E_Upper_Clef.png");
		//Image tab = new Image("E_Upper_Fret");
		char letter = 'e';
		boolean flat = false;
		boolean sharp = false;
		int octave = 3;
	}
	
	public void fUpper() {
		Image standard = new Image("F_Upper_Clef.png");
		//Image tab = new Image("F_Upper_Fret");
		char letter = 'f';
		boolean flat = false;
		boolean sharp = false;
		int octave = 3;
	}
	
	public void gUpper() {
		Image standard = new Image("G_Upper_Clef.png");
		//Image tab = new Image("G_Upper_Fret");
		char letter = 'g';
		boolean flat = false;
		boolean sharp = false;
		int octave = 3;
	}
	
	public void aUpper() {
		Image standard = new Image("A_Upper_Clef.png");
		//Image tab = new Image("A_Upper_Fret");
		char letter = 'a';
		boolean flat = false;
		boolean sharp = false;
		int octave = 3;
	}
	
	public void bUpper() {
		Image standard = new Image("B_Upper_Clef.png");
		//Image tab = new Image("B_Upper_Fret");
		char letter = 'b';
		boolean flat = false;
		boolean sharp = false;
		int octave = 3;
	}
	
	public void cUpper() {
		Image standard = new Image("C_Upper_Clef.png");
		//Image tab = new Image("C_Upper_Fret");
		char letter = 'c';
		boolean flat = false;
		boolean sharp = false;
		int octave = 4;
	}
	
	//High
	public void dHigh() {
		Image standard = new Image("D_High_Clef.png");
		//Image tab = new Image("D_High_Fret");
		char letter = 'd';
		boolean flat = false;
		boolean sharp = false;
		int octave = 5;
	}
	
	public void eHigh() {
		Image standard = new Image("E_High_Clef.png");
		//Image tab = new Image("E_High_Fret");
		char letter = 'e';
		boolean flat = false;
		boolean sharp = false;
		int octave = 5;
	}
	
	public void fHigh() {
		Image standard = new Image("F_High_Clef.png");
		//Image tab = new Image("F_High_Fret");
		char letter = 'f';
		boolean flat = false;
		boolean sharp = false;
		int octave = 5;
	}
	
	public void gHigh() {
		Image standard = new Image("G_High_Clef.png");
		//Image tab = new Image("G_High_Fret");
		char letter = 'g';
		boolean flat = false;
		boolean sharp = false;
		int octave = 5;
	}
	*/

