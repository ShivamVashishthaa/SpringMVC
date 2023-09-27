package GameRunner;

import org.springframework.stereotype.Component;

import game.Console;

@Component
public class GameRunner {
	private Console console;

	public GameRunner(Console console) {
		super();
		this.console = console;
	}
	
	public void run() {
		console.up();
		console.down();
		console.left();
		console.right();
	}
	
}
