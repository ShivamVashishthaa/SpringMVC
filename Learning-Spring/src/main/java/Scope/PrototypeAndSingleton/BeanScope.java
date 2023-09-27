package Scope.PrototypeAndSingleton;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)  // No need to use because by default all beans are singleton
@Component
class NormalClass{
	
}
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)  // always create a new object of a class while calling with context
@Component
class PrototypeClass{
	
}

@Configuration
@ComponentScan
public class BeanScope {
	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(BeanScope.class)){
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));
			
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
		}
	}
}
