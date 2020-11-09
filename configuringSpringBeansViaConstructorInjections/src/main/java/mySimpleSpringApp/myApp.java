
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
		
		Meal myNormalMeal=new Meal();
		
		System.out.println("Normal Meal: "+myNormalMeal.whatsInThisMeal());
		
		Meal mySpringMeal=appContext.getBean("meal",Meal.class);
		
		System.out.println("Spring Meal: "+mySpringMeal.whatsInThisMeal());
		
		Meal myAltSpringMeal=appContext.getBean("mealAlt",Meal.class);
		
		System.out.println("Spring Meal: "+myAltSpringMeal.whatsInThisMeal());
		
		
		((ClassPathXmlApplicationContext) appContext).close();
		
	}

}
