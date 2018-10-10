// Craig Longnecker
package beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VacationDaoInMemoryImpl implements VacationDao {
	
	private Map<Long, Vacation> vacationsMap = new HashMap<Long, Vacation>();{
		Vacation vacation1 = new Vacation(9, "Maui", 3500);
		Vacation vacation2 = new Vacation(18, "Australia", 7500);
		
		vacationsMap.put(vacation1.getId(), vacation1);
		vacationsMap.put(vacation2.getId(), vacation2);
	}
	
	public void insert(Vacation vacation) {
		vacationsMap.put(vacation.getId(), vacation);
	}
	
	public void update(Vacation vacation) {
		vacationsMap.put(vacation.getId(), vacation);
	}
	
	public void update(List<Vacation> vacations) {
		for (Vacation vacation: vacations) {
			update(vacation);
		}
	}
	
	public void delete(long vacationId) {
		vacationsMap.remove(vacationId);
	}
	
	public Vacation find(long vacationId) {
		return vacationsMap.get(vacationId);
	}
	
	public List<Vacation> find(List<Long> vacationIds){
		List<Vacation> vacations = new ArrayList<Vacation>();
		for (Long id: vacationIds) {
			vacations.add(vacationsMap.get(id));
		}
		return vacations;
	}
	
	public List<Vacation> find(String vacationSpot){
		List<Vacation> vacations = new ArrayList<Vacation>();
		for (Vacation vacation: vacationsMap.values()) {
			if (vacationSpot.equals(vacation.getVacationSpot())) {
				vacations.add(vacation);
			}
		}
		return vacations;
	}
	
	public List<Vacation> find(boolean reserved){
		List<Vacation> vacations = new ArrayList<Vacation>();
		for (Vacation vacation: vacationsMap.values()) {
			if (reserved == (vacation.isReserved())) {
				vacations.add(vacation);
			}
		}
		return vacations;
	}

}
