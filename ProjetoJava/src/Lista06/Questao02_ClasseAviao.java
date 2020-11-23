package Lista06;

public class Questao02_ClasseAviao 
{
	/* attributes */
	public String code;
	public String model;
	public int capacity;
	public String company;
	public String pilote;
	public String routeFrom;
	public String routeTo;
	public boolean stopover;
	/* constructor */
	public Questao02_ClasseAviao(String code, String model, int capacity, String company, 
			String pilote, String routeFrom, String routeTo, boolean stopover) {
		super();
		this.code = code;
		this.model = model;
		this.capacity = capacity;
		this.company = company;
		this.pilote = pilote;
		this.routeFrom = routeFrom;
		this.routeTo = routeTo;
		this.stopover = stopover;
	}
	/* methods */
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getPilote() {
		return pilote;
	}
	public void setPilote(String pilote) {
		this.pilote = pilote;
	}

	public String getRouteFrom() {
		return routeFrom;
	}
	public void setRouteFrom(String routeFrom) {
		this.routeFrom = routeFrom;
	}

	public String getRouteTo() {
		return routeTo;
	}
	public void setRouteTo(String routeTo) {
		this.routeTo = routeTo;
	}
	public String getAllRoute() {
		String AllRoute = "partindo de: " + routeFrom + " | indo para: " + routeTo;
		return AllRoute;
	}
	public String isStopover() {
		String stop;
		if (stopover == true)
			stop = "O voo tem escala.";
		else
			stop = "O voo não tem escala.";
		return stop;
	}
	public void setStopover(boolean stopover) {
		this.stopover = stopover;
	}
}
