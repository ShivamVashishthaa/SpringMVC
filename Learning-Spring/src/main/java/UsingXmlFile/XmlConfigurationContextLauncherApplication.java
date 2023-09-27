package UsingXmlFile;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlConfigurationContextLauncherApplication {
	public static void main(String[] args) {
		try(var context = new ClassPathXmlApplicationContext("UsingXmlFile/config.xml")){
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean("name"));
		}
	}
}
