package domain;

public class Vaucher {
	private VaucherType type;
	private String transport;
	private String food;
	private Integer days;

	public VaucherType getType() {
		return type;
	}

	public void setType(VaucherType type) {
		this.type = type;
	}

	public String getTransport() {
		return transport;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}
}
