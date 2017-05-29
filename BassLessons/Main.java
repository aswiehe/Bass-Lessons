import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class Main extends Application {
	public void start(Stage stage){
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
		Label transcribing = new Label("Transcribing...");
		Label transposing = new Label("Transposing...");
		//set transcribing and transposing labels on specific location
		transcribing.setLayoutY(100);
		transcribing.setLayoutX(50);
		transposing.setLayoutY(100);
		transposing.setLayoutX(50);
		//set labels to default invisible
		transcribing.setVisible(false);
		transposing.setVisible(false);
		//adding functionality to buttons to make labels visible
		transcription.setOnAction(e -> {
			transcribing.setVisible(true);
			transposing.setVisible(false);
		});
		transposition.setOnAction(e -> {
			transcribing.setVisible(false);
			transposing.setVisible(true);
		});
		//used the addAll method to condense added group node for scene
		group.getChildren().addAll(transcription, transcribing, transposition, transposing);
		
		//to be implemented with random integer generator to generate assigned random notes
		//lower case letters indicate flats, naturals are indicated with upper case letters
		int C = 0;
		int d = 1;
		int D = 2;
		int e = 3;
		int E = 4;
		int F = 5;
		int g = 6;
		int G = 7;
		int a = 8;
		int A = 9;
		int b = 10;
		int B = 11;
		int c = 12;		
	}
}