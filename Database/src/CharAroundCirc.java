import java.util.ArrayList;

import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;

public class CharAroundCirc extends Application {
	@Override
	public void start (Stage primaryStage) {
		// create pane
		Pane pane = new Pane();
		
		//create node
		
		//create an array of the text
		String[] list = new String[15];
		list[0] = "W";
		list[1] = "e";
		list[2] = "l";
		list[3] = "c";
		list[4] = "o";
		list[5] = "m";
		list[6] = "e";
		list[7] = " ";
		list[8] = "t";
		list[9] = "o";
		list[10] = " ";
		list[11] = "J";
		list[12] = "a";
		list[13] = "v";
		list[14] = "a";

		
		ArrayList<String> arrayList = new ArrayList<>();
		for (int i = 0; i < list.length; i++) {
			arrayList.add(list[i]);
		}
		
		//create scene
		Scene scene = new Scene (pane, 200,200);
		primaryStage.setTitle("Characters Around a Circle");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		//debug
		System.out.println(arrayList);
	}
	
	public static void main( String [] args ) {
		Application.launch(args);
	}
}
