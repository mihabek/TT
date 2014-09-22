package simulator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class PlayerTurn {
	
	int playerNumber;
	int attentionPerTurn;
	int turnCounter;
	LinkedList<Action> actions;
	
	public PlayerTurn(int playerNumber, int turnCounter, int attentionPerTurn) {
		super();
		this.playerNumber = playerNumber;
		this.attentionPerTurn = attentionPerTurn;
		this.turnCounter = turnCounter;
		this.actions = new LinkedList<Action>();
	}
	
	public boolean isOver() {
		return isAttentionSpent();
	}
	
	public boolean isAttentionSpent() {
		System.out.println(getAttentionSpentDuringTurn() + "       " + attentionPerTurn);
		return getAttentionSpentDuringTurn() == attentionPerTurn;
	}
	
	private int getAttentionSpentDuringTurn() {
		int attentionSpentPerTurn = 0;
		return attentionSpentPerTurn;
	}
	
	public ArrayList<Action> getAvailableActions(Game game) {
		ArrayList<Action> availableActions = new ArrayList<Action>(); 
		if(game.getPlayerByNumber(playerNumber).getAmountOfFunctionalitiesOnHands() == 0){
			game.setIsOver(true);
		}
		
		if(!isActionPerformed(ActionType.MOVE_FORWARD)) {
			Action action = new Action(ActionType.MOVE_FORWARD, 0, 0);
			availableActions.add(action);
			//if functionality equals 6, when user should pay for it
			if(game.getPlayerByNumber(playerNumber).getLevelOfcurrentFunctionalityInProgress() != 6 && game.getPlayerByNumber(playerNumber).getAmountOfFunctionalitiesOnHands() !=0){
				game.getPlayerByNumber(playerNumber).setLevelOfcurrentFunctionalityInProgress(1); // player moves one functionality
			} 
			else {
				pickRanomAction(game);
			}
			return availableActions;
		}
		return null;
	}
	
	private void pickRanomAction(Game game) {
		/*
		 * pick random event
		 * move functionality to implementation for 3 AP 
		 * or get new functionality for 3 AP if there is no 3 FN in release
		 * or improve strategy for X AP
		 * MOVE FUNCTIONALITY FOR MONEY ???????
		 */
		pickNextFunctionality(game);
		if(game.getPlayerByNumber(playerNumber).getLevelOfcurrentFunctionalityInProgress() == 6){
			putFunctionalityToImplementation(game);
			System.out.println("added new  " + game.getPlayerByNumber(playerNumber).getWorkingFunctionalities() + "  " +
			game.getPlayerByNumber(playerNumber).getBrokenFunctionalities() + "  " + game.getPlayerByNumber(playerNumber).getAmountOfFunctionalitiesOnHands());
		}
	}
	
	private void putFunctionalityToImplementation(Game game) {
		Random r = new Random();
		int rnd = r.nextInt(3-1) + 1;
		game.getPlayerByNumber(playerNumber).setLevelOfcurrentFunctionalityInProgress(0); // FN is in implementation and put it to working or broken
		if(rnd==1){
			game.getPlayerByNumber(playerNumber).setWorkingFunctionalities(1);
		} else {
			game.getPlayerByNumber(playerNumber).setBrokenFunctionalities(1);
		}
	}

	private void pickNextFunctionality(Game game) {
		game.getPlayerByNumber(playerNumber).setAmountOfFunctionalitiesOnHands(1);
		
	}

	private boolean isActionPerformed(ActionType actionType) {
		for(Action action : actions){
			if(action.getActionType() == actionType) {
				return true;
			}
		}
		return false;
	}
	
	
}
