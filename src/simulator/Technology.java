package simulator;

public class Technology {
	public static final String TECHNOLOGY_PREFIX = "technology.";
	
	int id;
	String name;
	int cost;
	
	public Technology(int id, String name, int cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	
	public String toString(){
		return "Technology ID: " + id + 
				", Name: " + name + 
				", cost: " + cost;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getCost() {
		return cost;
	}
	
}

