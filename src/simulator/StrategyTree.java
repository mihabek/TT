package simulator;

import java.util.HashSet;
import java.util.Set;

public class StrategyTree {
	
	Set<Strategy> strategies;

	public StrategyTree() {
		super();
		this.strategies = new HashSet<Strategy>();
	}

	public void addStrategy(Strategy strategy) {
		strategies.add(strategy);
	}
	
	
}
