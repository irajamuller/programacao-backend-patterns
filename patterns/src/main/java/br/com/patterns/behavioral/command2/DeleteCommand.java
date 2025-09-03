package br.com.patterns.behavioral.command2;

public class DeleteCommand implements Command {
	@Override
	public Object execute(Object arg) {
		// Delete from DB
		return null; // object deleted
	}
}
