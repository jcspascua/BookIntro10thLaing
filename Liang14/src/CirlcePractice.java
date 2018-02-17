import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CirlcePractice extends Application {
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		Circle circle = new Circle(200, 200, 100); // Circle(<<x coord>>, <<y coord>>, <<radius>>)
		pane.getChildren().add(circle);
		
		//set the scene
		Scene scene = new Scene(pane, 400, 400);
		primaryStage.setTitle("CirclePractice");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		Application.launch(args);
	}

	

}
