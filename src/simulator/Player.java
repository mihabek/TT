package simulator;

import java.util.Random;

public class Player {
	
	int playerNumber;
	int amountOfFunctionalitiesOnHands;
	int levelOfcurrentFunctionalityInProgress;
	int workingFunctionalities;
	int brokenFunctionalities;
	int turns;
	int functionalitiesInGame;
	
	public Player(int playerNumber) {
		super();
		this.playerNumber = playerNumber;
		this.amountOfFunctionalitiesOnHands = 32;
		this.workingFunctionalities = 16;
		this.brokenFunctionalities = 16;
	}
	
	public int getPlayerNumber(){
		return playerNumber;
	}
	
	public int getLevelOfcurrentFunctionalityInProgress() {
		return levelOfcurrentFunctionalityInProgress;
	}
	
	//level of FN in hands 1-6
	public void setLevelOfcurrentFunctionalityInProgress(int functionalityLevel) {
		Random r = new Random();
		int rnd = r.nextInt(3-1) + 1;
		
		if (functionalityLevel == 0) {
			this.levelOfcurrentFunctionalityInProgress = 0;
		} else {
			this.levelOfcurrentFunctionalityInProgress += functionalityLevel;
		}
	}
	
	//FN-s in the player-s deck
	public void setAmountOfFunctionalitiesOnHands(int amountOfFunctionalitiesOnHands){
		this.amountOfFunctionalitiesOnHands -= amountOfFunctionalitiesOnHands;
	}
	
	public int getAmountOfFunctionalitiesOnHands() {
		return amountOfFunctionalitiesOnHands;
	}
	
	public int getWorkingFunctionalities() {
		return workingFunctionalities;
	}

	public void setWorkingFunctionalities(int workingFunctionalities) {
		this.workingFunctionalities -= workingFunctionalities;
	}

	public int getBrokenFunctionalities() {
		return brokenFunctionalities;
	}

	public void setBrokenFunctionalities(int brokenFunctionalities) {
		this.brokenFunctionalities -= brokenFunctionalities;
	}
	
	public int getTurns() {
		return turns;
	}

	public void setTurns(int turns) {
		this.turns += turns;
	}

	public int getFunctionalitiesInGame() {
		return functionalitiesInGame;
	}
	//amount of FN currently on board
	public void setFunctionalitiesInGame(int functionalitiesInGame) {
		this.functionalitiesInGame += functionalitiesInGame;
	}

}
