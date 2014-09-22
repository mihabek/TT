package simulator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Properties;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Simulation {
	public static final String PROPERTY_FILE_NAME = "bin/game.properties";
	public static final String PROPERTY_DELIMITER = ";";
	
	// SET UP LOGGING
		private final static Logger  log = Logger.getLogger(Simulation.class.getName());
		{
			log.setLevel(Level.ALL);
			ConsoleHandler handler = new ConsoleHandler();
			handler.setFormatter(new SimpleFormatter());
			handler.setLevel(Level.ALL);
			log.addHandler(handler);
		}
		
		public static void main(String args[]){
			Properties defaultProps = new Properties();
			FileInputStream in;
			try {
				in = new FileInputStream(PROPERTY_FILE_NAME);
				defaultProps.load(in);
				in.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			// set up game
			Game game = setUpGame(defaultProps);
			
			// build technology tree
			StrategyTree strategyTree = setUpStrategyTree(defaultProps);
			
			// add card deck
			EventCardDeck cardDeck = setUpCardDeck(defaultProps, strategyTree);
			
			// add player
			game.addPlayer(new Player(1));
			
			// initialize and start game
			game.setCardDeck(cardDeck);
			game.setStrategyTree(strategyTree);
			game.initialize();
			
			//MAIN LOOP
			while(!game.isOver()) {
				while (!game.getCurrentTurn().isOver()){
					// check next possible actions
					ArrayList<Action> availableActions = game.getAvailableActionsForTurn(game.getCurrentTurn());
				}
			}
		}
		
		private static EventCardDeck setUpCardDeck(Properties properties, StrategyTree strategyTree) {
			EventCardDeck cardDeck = new EventCardDeck();
			for(String property : properties.stringPropertyNames())  {
				if(property.startsWith(EventCard.CARD_PREFIX)) {
					String propertyValue = properties.getProperty(property);
					String[] parts = propertyValue.split(PROPERTY_DELIMITER);
					/* 
					0 name,
					1 effectOnAttention;
					2 effectOnAttentionWithUsabilityModifier;   negatedByTechnologyId
					3 effectOnWorkInProgress;                   effectOnStrategyInProgress
					4 effectOnWorkInProgressWithSimplicityModifier;   goBack
					5 effectOnWorkDone;                         goRandomBack
					6 effectOnBug;                              brokenFunctionalityToWorking
					7 negatedByTechnologyId;                    functionalityDoNotMove
					8 noOfCards                                 getFreeFunToRelease
					9 											getAdditionalApForStrategy
					*/
					
						String name = parts[0];
						int effectOnAttention = Integer.parseInt(parts[1]);
						int negatedByStrategyId = Integer.parseInt(parts[2]);
						int effectOnStrategyInProgress = Integer.parseInt(parts[3]);
						int goBack = Integer.parseInt(parts[4]);
						int goRandomBack = Integer.parseInt(parts[5]);
						int brokenFunctionalityToWorking = Integer.parseInt(parts[6]);
						int functionalityDoNotMove = Integer.parseInt(parts[7]);
						int getFreeFunToRelease = Integer.parseInt(parts[8]);
						int getAdditionalApForStrategy = Integer.parseInt(parts[9]);
						
						EventCard card = new EventCard (
								name, 
								effectOnAttention, 
								negatedByStrategyId, 
								effectOnStrategyInProgress, 
								goBack, 
								goRandomBack,
								brokenFunctionalityToWorking, 
								functionalityDoNotMove,
								getFreeFunToRelease,
								getAdditionalApForStrategy
								);
						System.out.println(card);
//						int negatedByTechnologyId = technologyTree.findTechnologyIdByName(negatedByTechnology);
						cardDeck.addCard(card);
				}
				
				}
			System.out.println("\n");
			return cardDeck;
		}

		private static StrategyTree setUpStrategyTree(Properties properties) {
			StrategyTree strategyTree = new StrategyTree();
			for(String property : properties.stringPropertyNames())  {
				if(property.startsWith(Strategy.STRATEGY_PREFIX)) {
					String propertyValue = properties.getProperty(property);
					String[] parts = propertyValue.split(PROPERTY_DELIMITER);
					
					Strategy strategy = new Strategy(
							Integer.parseInt(parts[0]), 
							parts[1], 
							Integer.parseInt(parts[2]));
					strategyTree.addStrategy(strategy);
					System.out.println(strategy);
				}}
			System.out.println("\n");
			return strategyTree;
		}
		
		static Game setUpGame(Properties defaultProps) {
			// set up game
			Game game = new Game(
					Integer.parseInt(defaultProps.getProperty(Game.ATTENTION_PER_ROUND_KEY))
					);
			
			log.info("Game initialized with variables: ");
			log.info("Attention per turn: " + game.getAttentionPerTurn());
			return game;
		}
}
