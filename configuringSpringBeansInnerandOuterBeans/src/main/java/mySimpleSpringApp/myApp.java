
package mySimpleSpringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;

import food.Meal;

public class myApp 
{


	public static void main(String[] args)
	{
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("myTestPackage/appContext.xml");
		
		
		
		
		
		Meal mySpringMeal=appContext.getBean("meal",Meal.class);
		
		System.out.println("Spring Meal: "+mySpringMeal.whatsInThisMeal());
		

		Meal myInnerSpringMeal=appContext.getBean("mealOuterBean",Meal.class);
		
		System.out.println("Spring Meal: "+myInnerSpringMeal.whatsInThisMeal());
		
		
		((ClassPathXmlApplicationContext) appContext).close();
		
	}

}
