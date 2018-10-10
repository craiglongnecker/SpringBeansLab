// Craig Longnecker
package beans;

public interface VacationService {
	
	public void summerDiscount(long sourceVacationId, long targetVacationId, double amount);
	public void winterPremium(long vacationId, double amount) throws Exception;
	public Vacation getVacation(long vacationId);

}
