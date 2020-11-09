
package mySimpleSpringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;

import food.Fruit;

public class myApp 
{


	public static void main(String[] args)
	{
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("myTestPackage/appContext.xml");
		
		
		
		
		Fruit myFruit=appContext.getBean("fruit",Fruit.class);
		
		
		
	
		
		System.out.println(myFruit.talkAboutYourself());
		
		
		
		

		
		((ClassPathXmlApplicationContext) appContext).close();
		
	}

}
