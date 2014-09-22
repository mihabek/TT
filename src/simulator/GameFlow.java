package simulator;

import java.util.LinkedList;

public class GameFlow {
	LinkedList<GameStep> gameSteps;
	
	public GameFlow(LinkedList<GameStep> gameSteps) {
		super();
		this.gameSteps = gameSteps;
	}
	
	public LinkedList<GameStep> getGameSteps() {
		return gameSteps;
	}

	public void setGameSteps(LinkedList<GameStep> gameSteps) {
		this.gameSteps = gameSteps;
	}
	
	public String toString(){
		return "Step: " + gameSteps;
	} 
			
}
