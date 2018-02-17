import javafx.application.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.*;
import java.sql.*;

public class FindGrade extends Application{
	// Statement for executing queries
	private Statement stmt;
	private TextField tfSSN = new TextField();
	private TextField tfCourseId = new TextField();
	private Label lblStatus = new Label();
	
	@Override
	public void start(Stage primaryStage) {
		//Initialize database connection and create a Statement object
		initializeDB();
		
		Button btShowGrade = new Button("Show Grade");
		HBox hBox = new HBox(5);
		// add to the hBox a label (SSN), the TextField (tfSSN), a label (Course ID, Textfield (tfCourseId), and button (Show Grade)
		hBox.getChildren().addAll(new Label("SSN"), tfSSN, new Label("Course ID"), tfCourseId, (btShowGrade));
		VBox vBox = new VBox(10); //create a VBox with I think width of 10
		vBox.getChildren().addAll(hBox, lblStatus);
		
		tfSSN.setPrefColumnCount(6);
		tfCourseId.setPrefColumnCount(6);
		btShowGrade.setOnAction(e -> showGrade());
		
		//Create scene and place it on the stage
		Scene scene = new Scene(vBox, 420, 80);
		primaryStage.setTitle("FindGrade");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main (String [] args) {
		Application.launch(args);
	}
	
	private void initializeDB() {
		try {
			// Load the JDBC driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded");
			
			//Establish a connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/javabook", "root", "com-mys-mys-22751");
			System.out.println("Database connected");
			
			//Create a statement
			stmt = connection.createStatement();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	private void showGrade() {
		String ssn = tfSSN.getText();
		String courseId = tfCourseId.getText();
		try {
			String queryString = "select firstName, mi, lastName, title, grade from Student, Enrollment, Course where Student.ssn = " + ssn + " and Enrollment.courseId " + "= " + courseId + "and Enrollment.courseId = Course.courseId" + " and Enrollment.ssn = Student.ssn";
			
			ResultSet rset = stmt.executeQuery(queryString);
			
			if (rset.next()) {
				String lastName = rset.getString(1);
				String mi = rset.getString(2);
				String firstName = rset.getString(3);
				String title = rset.getString(4);
				String grade = rset.getString(5);
				
				//Display result in a label
				lblStatus.setText(firstName + " " + mi + " " + lastName + "'s grade on course " + title + " is " + grade);
			} else {
				lblStatus.setText("Not found");
				
			} 
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}
