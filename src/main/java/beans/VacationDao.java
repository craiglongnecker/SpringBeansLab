// Craig Longnecker
package beans;

import java.util.List;

public interface VacationDao {
	
	public void insert(Vacation vacation);
	public void update(Vacation vacation);
	public void update(List<Vacation> vacations);
	public void delete(long vacationId);
	public Vacation find(long vacationId);
	public List<Vacation> find(List<Long> vacationIds);
	public List<Vacation> find(String vacationSpot);
	public List<Vacation> find(boolean reserved);

}
