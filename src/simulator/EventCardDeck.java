package simulator;

import java.util.Collections;
import java.util.LinkedList;

public class EventCardDeck {
	
LinkedList<EventCard> cards;
	
	public EventCardDeck() {
		super();
		cards = new LinkedList<EventCard>();
	}

	public void shuffle() {
		Collections.shuffle(cards);
		System.out.println(cards);
	}

	public void addCard(EventCard card) {
		this.cards.add(card);
	}
}
