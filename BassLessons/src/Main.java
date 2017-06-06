import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Scene;
import java.util.Random;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import pitches.PitchBuilder;

public class Main extends Application {
	public void start(Stage stage){
		
		//setting stage and scene
		Group group = new Group();
		Scene scene = new Scene(group, 1200, 800);
		stage.setTitle("Bass Lessons");		
		stage.setScene(scene);
		stage.show();
		
		//added two buttons
		Button transcription = new Button("Transcription");
		Button transposition = new Button("Transposition");
		
		//set transcription button on specific location
		transcription.setLayoutY(20);
		transcription.setLayoutX(20);
		
		//set transposition button to the right of transcription button
		transposition.setLayoutY(20);
		transposition.setLayoutX(120);
		
		//added two labels
		Label transcribing = new Label("Transcribing... ");
		Label transposing = new Label("Transposing... ");
		
		//set transcribing and transposing labels on specific location
		transcribing.setLayoutY(50);
		transcribing.setLayoutX(75);
		transposing.setLayoutY(50);
		transposing.setLayoutX(75);
		
		//set labels to default invisible
		transcribing.setVisible(false);
		transposing.setVisible(false);
		
		//adding functionality to buttons to make labels visible
		transcription.setOnAction(e -> {
			transcribing.setVisible(true);
			transposing.setVisible(false);
			new PitchBuilder().randomPitch(); // PitchBuilder class will be used to hold methods that "choose" which pitch classes will be needed and which attributes (class variables) will be needed.
		});
		transposition.setOnAction(e -> {
			transcribing.setVisible(false);
			transposing.setVisible(true);
			//char newnote = new RandNote().randNotes();
		});
		
		//used the addAll method to condense added group node for scene
		group.getChildren().addAll(transcription, transcribing, transposition, transposing);
		
		//to be implemented with random integer generator to generate assigned random notes
		//lower case letters indicate flats, naturals are indicated with upper case letters
	}
	public static void main(String[] args){
		Application.launch();
	}
}