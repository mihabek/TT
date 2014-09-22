package simulator;

import java.util.List;

public class Game {
	public static final String ATTENTION_PER_ROUND_KEY = "attentionPerTurn";
	
	int attentionPerRound;
	List<Player> players;
	EventCardDeck eventCardDeck;
	TechnologyTree technologyTree;
	
	public Game(int attentionPerRound){
		this.attentionPerRound = attentionPerRound;
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

	public void setTechnologyTree(TechnologyTree technologyTree) {
		this.technologyTree = technologyTree;
	}

}
