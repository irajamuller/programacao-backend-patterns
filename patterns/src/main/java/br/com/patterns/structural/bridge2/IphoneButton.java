package br.com.patterns.structural.bridge2;

import javafx.scene.control.Control;

public class IphoneButton implements NativeAPI {

	@Override
	public Control create(Component component) {
		javafx.scene.control.Button button = new javafx.scene.control.Button(component.text);
		button.setStyle("-fx-background-color: #a6b5c9, " + 
						 "linear-gradient(#303842 0%, #3e5577 20%, #375074 100%), " + 
						 "linear-gradient(#768aa5 0%, #849cbb 5%, #5877a2 50%, #486a9a 51%, #4a6c9b 100%);" + 
						 "-fx-background-insets: 0 0 -1 0,0,1;" + 
						 "-fx-background-radius: 5,5,4;" + 
						 "-fx-padding: 7 30 7 30;" + 
						 "-fx-text-fill: #242d35;" + 
						 "-fx-font-family: 'Helvetica';" + 
						 "-fx-font-size: 12px;" + 
						 "-fx-text-fill: white;");		
		return button;
	}

}
