package com.LazyAndEagerInitialization;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA{
	
}

@Component
@Lazy                              // this bean executes when we trying to use it
class ClassB{
	private ClassA a;
	public ClassB(ClassA a) {
		super();
		this.a = a;
	}
}


@Configuration
@ComponentScan
public class LazyAndEager {
	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(LazyAndEager.class)){
			
		}	
	}
	
}
