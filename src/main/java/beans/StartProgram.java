// Craig Longnecker
package beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartProgram {

	public static void main(String[] args) throws Exception {
		
		//AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans/beans.xml");
		
		VacationService vacationService = applicationContext.getBean("vacationService", VacationService.class);
		
		System.out.println("Vacation Costs Before Seasonal Adjustments");
		System.out.println("Vacation " + vacationService.getVacation(9).getId() + " Cost: " + vacationService.getVacation(9).getCost() + " to " + vacationService.getVacation(9).getVacationSpot() + ".");
		System.out.println("Vacation " + vacationService.getVacation(18).getId() + " Cost: " + vacationService.getVacation(18).getCost() + " to " + vacationService.getVacation(18).getVacationSpot() + ".");
		System.out.println("");
		
		vacationService.summerDiscount(9, 18, 1000);
		
		System.out.println("Vacation Costs After Seasonal Adjustments");
		System.out.println("Vacation " + vacationService.getVacation(9).getId() + " Summer Cost: " + vacationService.getVacation(9).getCost() + " to " + vacationService.getVacation(9).getVacationSpot() + ".");
		System.out.println("Vacation " + vacationService.getVacation(18).getId() + " Winter Cost: " + vacationService.getVacation(18).getCost() + " to " + vacationService.getVacation(18).getVacationSpot() + ".");
		System.out.println("");
		
		vacationService.winterPremium(9, 2000);
		vacationService.winterPremium(18, 0);
		
		System.out.println("Vacation Costs After Winter Premium Adjustments");
		System.out.println("Vacation " + vacationService.getVacation(9).getId() + " Winter Cost: " + vacationService.getVacation(9).getCost() + " to " + vacationService.getVacation(9).getVacationSpot() + ".");
		System.out.println("Vacation " + vacationService.getVacation(18).getId() + " Winter Cost: " + vacationService.getVacation(18).getCost() + " to " + vacationService.getVacation(18).getVacationSpot() + ".");
	}
}
