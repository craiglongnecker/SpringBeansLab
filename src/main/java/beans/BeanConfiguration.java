// Craig Longnecker
package beans;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public VacationDao vacationDao() {
		VacationDaoInMemoryImpl bean = new VacationDaoInMemoryImpl();
		return bean;
	}
	
	@Bean(autowire = Autowire.BY_NAME)
	public VacationService vacationService() {
		VacationServiceImpl bean = new VacationServiceImpl();
		//bean.setVacationDao(vacationDao());
		return bean;
	}
	
	@Bean
	public VacationDao vacationDaoJdbc() {
		VacationDaoJdbcImpl bean = new VacationDaoJdbcImpl();
		return bean;
	}
}
