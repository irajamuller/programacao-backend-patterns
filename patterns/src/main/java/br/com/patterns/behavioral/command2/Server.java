package br.com.patterns.behavioral.command2;

import java.util.HashMap;
import java.util.Map;

public class Server {
	private Map<String, Object> cmds = new HashMap<>();

	public Server() {
		initCommands();
	}

	private void initCommands() {
		cmds.put("new", new NewCommand()); // object parameter
		cmds.put("del", new DeleteCommand()); // object parameter
		// ...
	}
	
	public void service(String cmd, Object data) {
		Command command = (Command) cmds.get(cmd);
		command.execute(data);
		// ...
	}
}
