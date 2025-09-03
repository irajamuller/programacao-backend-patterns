package br.com.patterns.structural.bridge2;

import javafx.scene.control.Control;

public class Button extends Component {
	private NativeAPI nativeComponent;

	public Button(String text, NativeAPI nativeComponent) {
		this.text = text;
		this.nativeComponent = nativeComponent;
	}
	
	@Override
	public Control getNativeComponent() {
		return nativeComponent.create(this);
	}
}
