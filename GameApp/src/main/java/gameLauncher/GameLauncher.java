package gameLauncher;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import gameRunner.GameRunner;

@Configuration
@ComponentScan("game")
@ComponentScan("gameRunner")
public class GameLauncher {
	
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(GameLauncher.class))
		{
//		context.getBean("gameRun",MarioGame.class).up();
			context.getBean(GameRunner.class).run();;
		}
//		var mario = new MarioGame();
//		GameRunner run = new GameRunner(mario);
//		run.run();  //////////
	}
}
