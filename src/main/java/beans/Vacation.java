// Craig Longnecker
package beans;

import java.util.Date;

public class Vacation {
	private long id;
	private String vacationSpot;
	private double cost;
	private Date reservedDate;
	private boolean reserved;
	
	public Vacation() {
		
	}
	
	public Vacation(long id, String vacationSpot, double cost) {
		this.id = id;
		this.vacationSpot = vacationSpot;
		this.cost = cost;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getVacationSpot() {
		return vacationSpot;
	}

	public void setVacationSpot(String vacationSpot) {
		this.vacationSpot = vacationSpot;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Date getReservedDate() {
		return reservedDate;
	}

	public void setReserveDate(Date reservedDate) {
		this.reservedDate = reservedDate;
	}

	public boolean isReserved() {
		return reserved;
	}

	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}
}
