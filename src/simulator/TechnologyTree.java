package simulator;

import java.util.HashSet;
import java.util.Set;

public class TechnologyTree {
	
	Set<Technology> technologies;

	public TechnologyTree() {
		super();
		this.technologies = new HashSet<Technology>();
	}

	public void addTechnology(Technology technology) {
		technologies.add(technology);
	}
	
	
}
