//use this dependency to use Jakarta CDI
//		<dependency>
//			<groupId>jakarta.inject</groupId>
//			<artifactId>jakarta.inject-api</artifactId>
//			<version>2.0.1</version>
//		</dependency>
package JakartaCDI;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;
//@Component									// @Name and @Component both are same
@Named
class BusinessService{
	DataService dataService;
//	@Autowired									//	@Inject and @Autowired both are same
	@Inject
	public DataService getDataService() {
		return dataService;
	}
	
	public void setDataService(DataService dataService) {
		System.out.println("Setter injection");
		this.dataService = dataService;
	}
	
}
@Component
class DataService{
	
}
@Configuration
@ComponentScan
public class CdiContextLauncherApplication {
	public static void main(String[] args) {
		try(var context = 
				new AnnotationConfigApplicationContext(CdiContextLauncherApplication.class)){
//			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(BusinessService.class));
		}
	}
}
