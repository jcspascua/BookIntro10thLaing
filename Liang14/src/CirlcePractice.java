import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CirlcePractice extends Application {
	@Override
	public void start(Stage primaryStage) {
		HBox hb = new HBox();
		Circle circle = new Circle(10,10, 0);
		hb.getChildren().add(circle);
		
		//set the scene
		Scene scene = new Scene(hb, 200,200);
		primaryStage.setTitle("Stuff");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		Application.launch(args);
	}

	

}
