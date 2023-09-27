package PostConstructAndPreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass{
	private SomeDependency someDependency;

	public SomeClass(SomeDependency someDependency) {
		super();
		System.out.println("all dependency are ready");
		this.someDependency = someDependency;
	}
	@PostConstruct                 // no need to call this method seprately using object 
	public void initialization() { // because it call automatically after the creation of someDependency object
		someDependency.getReady(); // which is autowired by the spring using constructor
	}
	@PreDestroy
	public void cleanUp() {
		System.out.println("Clean up code");

	}
	
}

@Component
class SomeDependency{
	public void getReady() {
		System.out.println("some logic using SomeDependency");
	}
}

@Configuration
@ComponentScan
public class PrePostAnnotationContextLauncherApplication {
	public static void main(String[] args) {
		try(var context = 
				new AnnotationConfigApplicationContext(
						PrePostAnnotationContextLauncherApplication.class)){
//			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			context.getBean(SomeClass.class);
		}
	}
}
