package simulator;

public class Strategy {
	public static final String STRATEGY_PREFIX = "strategy.";
	
	int id;
	String name;
	int cost;
	
	public Strategy(int id, String name, int cost) {
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

