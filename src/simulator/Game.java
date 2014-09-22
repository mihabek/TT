package simulator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Game {
	public static final String ATTENTION_PER_ROUND_KEY = "attentionPerTurn";
	public static final int FIRST_TURN = 1;
	
	int attentionPerRound;
	List<Player> players;
	EventCardDeck eventCardDeck;
	StrategyTree strategyTree;
	LinkedList<PlayerTurn> turns;
	boolean isOver;
	
	public Game(int attentionPerRound){
		this.attentionPerRound = attentionPerRound;
		this.players = new ArrayList<Player>();
		this.turns = new LinkedList<PlayerTurn>();
	}
	
	public int getAttentionPerTurn() {
		return this.attentionPerRound;
	}
	
	public void addPlayer(Player player) {
		players.add(player);
	}
	
	public void setCardDeck(EventCardDeck cardDeck) {
		this.eventCardDeck = cardDeck;
	}
	
	public void setStrategyTree(StrategyTree strategyTree) {
		this.strategyTree = strategyTree;
	}

	public void initialize() {
		eventCardDeck.shuffle();
		turns.add(new PlayerTurn(players.get(0).getPlayerNumber(), FIRST_TURN, getAttentionPerTurn()));
	}

	public boolean isOver() {
//		if(all 16 working functionalities collected, then return true)
		return isOver;
	}
	
	public boolean setIsOver(boolean isOver)
	{
		return this.isOver = isOver;
	}

	public PlayerTurn getCurrentTurn() {
		return turns.peekLast();
	}

	public ArrayList<Action> getAvailableActionsForTurn(PlayerTurn currentTurn) {
		return currentTurn.getAvailableActions(this);
	}
	
	public Player getPlayerByNumber (int playerNumber) {
		Player player = null;
		for (Player p : players) {
			if(p.getPlayerNumber() == playerNumber) {
				player = p;
			}
		}
		return player;
	}

}
