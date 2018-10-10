// Craig Longnecker
package beans;

public class VacationServiceImpl implements VacationService {
	
	private VacationDao vacationDao;
	
	public VacationServiceImpl(VacationDao vacationDao) {
		this.vacationDao = vacationDao;
	}
	
	public VacationDao getVacationDao() {
		return vacationDao;
	}
	
	public void setVacationDao(VacationDao vacationDao) {
		this.vacationDao = vacationDao;
	}
	
	public void summerDiscount(long sourceVacationId, long targetVacationId, double amount) {
		Vacation sourceVacation = vacationDao.find(sourceVacationId);
		Vacation targetVacation = vacationDao.find(targetVacationId);
		
		sourceVacation.setCost(sourceVacation.getCost() - amount);
		targetVacation.setCost(targetVacation.getCost() + amount);
		
		vacationDao.update(sourceVacation);
		vacationDao.update(targetVacation);
	}
	
	public void winterPremium(long vacationId, double amount) throws Exception {
		Vacation vacation = vacationDao.find(vacationId);
		vacation.setCost(vacation.getCost() + amount);
		vacationDao.update(vacation);
	}
	
	public Vacation getVacation(long vacationId) {
		return vacationDao.find(vacationId);
	}
}
