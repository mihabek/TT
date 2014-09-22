package simulator;

public class GameStep {
	
	GameStepType gameStepType;
	
	public GameStep(GameStepType gameStepType) {
		super();
		this.gameStepType = gameStepType;
	}

	public String toString(){
		return "" + gameStepType;
	}
}
