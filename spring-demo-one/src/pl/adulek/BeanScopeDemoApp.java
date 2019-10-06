package pl.adulek;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		Coach theBestCoach = context.getBean("theBestCoach", Coach.class);
		Coach najlepszyTrener = context.getBean("theBestCoach", Coach.class);
		
		//check if they are the same
//		System.out.println("pointing to the same object: " + (theCoach == alphaCoach));
//		System.out.println("Memory location for theCoach " + theCoach);
//		System.out.println("Memory location for alphaCoach " + alphaCoach);
		
		System.out.println("pointing to the same object: " + (theBestCoach == najlepszyTrener));
		System.out.println("Memory location for theBestCoach " + theBestCoach);
		System.out.println("Memory location for najlepszyTrener " + najlepszyTrener);
		System.out.println(theBestCoach.getDailyFortune());
		System.out.println(theBestCoach.getDailyWorkout());
		System.out.println(najlepszyTrener.getDailyFortune());
		System.out.println(najlepszyTrener.getDailyWorkout());
		
		context.close();
	}

}
