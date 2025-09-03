package br.com.patterns.structural.bridge2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ButtonTest extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane root = new GridPane();
		Button button1 = new Button("mac button", new MacButton());
		Button button2 = new Button("window button", new WindowsButton());
		Button button3 = new Button("iphone button", new IphoneButton());

		root.add(button1.getNativeComponent(), 0, 0);
		root.add(button2.getNativeComponent(), 1, 0);
		root.add(button3.getNativeComponent(), 2, 0);
		
		Scene scene = new Scene(root, 450, 40);
		primaryStage.setTitle("Bridge");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
