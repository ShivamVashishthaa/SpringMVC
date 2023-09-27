package GameLauncher;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import GameRunner.GameRunner;

@Configuration
@ComponentScan("com.in28minutes.learnspringframework.game")
@ComponentScan("com.in28minutes.learnspringframework.GameRunner")
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
