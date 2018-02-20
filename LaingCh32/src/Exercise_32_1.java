import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/*
 * Write a program that views, inserts, and updates staff information stored in a database, as shown in Figure
 * 32.27a. The View button displays a record with a specified ID. The Insert button inserts a new record. The 
 * Update button updates the record for the specified ID. 
 */
public class Exercise_32_1 extends Application{
	private TextField tfRecordStatus;
	@Override
	public void start(Stage primaryStage) {
		//create panes
		FlowPane pane = new FlowPane();
		pane.setPadding(new Insets(11,12,13,14));
		pane.setHgap(5);
		pane.setVgap(5);
		
		HBox hBox = new HBox();
		BorderPane bPane = new BorderPane();
		
		//create nodes
		//create buttons
		Button btView = new Button("View");
		Button btInsert = new Button("Insert");
		Button btUpdate = new Button("Update");
		Button btClear = new Button("Clear");
		
		//create labels
		Label lbID = new Label("ID");
		Label lbLastName = new Label("Last Name");
		Label lbFirstName = new Label("First Name");
		Label lbMI = new Label("MI");
		Label lbAddress = new Label("Address");
		Label lbCity = new Label("City");
		Label lbState = new Label("State");
		Label lbTelephone = new Label("Telephone");
		
		//create text field
		TextField tfID = new TextField();
		TextField tfLastName = new TextField();
		TextField tfFirstName = new TextField();
		TextField tfMI = new TextField();
		TextField tfAddress = new TextField();
		TextField tfCity = new TextField();
		TextField tfState = new TextField();
		TextField tfTelephone = new TextField();
		
		//add elements to pane
		pane.getChildren().addAll(lbID, tfID, lbLastName, tfLastName, lbFirstName, tfFirstName, lbMI, tfMI, lbAddress, tfAddress, lbCity, tfCity, lbState, tfState, lbTelephone, tfTelephone);
		
		//add elements to HBox
		hBox.getChildren().addAll(btView, btInsert, btUpdate, btClear);
		
		//add hBox to bPane
		bPane.setCenter(pane);
		bPane.setBottom(hBox); // create an HBox
		
		//create and register handler
		btView.setOnAction((ActionEvent e) -> {
			// insert method
			viewRecord();
		});
			
		//create Stage, add pane to scene
		Scene scene = new Scene(bPane, 400, 400);
		primaryStage.setTitle("ExtraExercise32_01");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

	public void viewRecord() {
		//take ID and place it into record
		//populate all the other fields
		//review sql
	}
}
