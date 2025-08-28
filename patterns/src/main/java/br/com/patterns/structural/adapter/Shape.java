package br.com.patterns.structural.adapter;

public interface Shape {
	public void draw();
	public void resize();
	public String show();
	public boolean isHidden();
}