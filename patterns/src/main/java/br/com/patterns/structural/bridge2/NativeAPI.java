package br.com.patterns.structural.bridge2;

import javafx.scene.control.Control;

public interface NativeAPI {
	public Control create(Component component);
}
