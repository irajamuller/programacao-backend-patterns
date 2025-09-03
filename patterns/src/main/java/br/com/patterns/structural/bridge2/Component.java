package br.com.patterns.structural.bridge2;

import javafx.scene.control.Control;

public abstract class Component {
	protected String text;
	public abstract Control getNativeComponent();
}
