package simulator;

public class EventCard {
	
	public static final String CARD_PREFIX = "card.";
	
	String name;
	int effectOnAttention;
	int negatedByTechnologyId;
	int effectOnStrategyInProgress;
	int goBack;
	int goRandomBack;
	int brokenFunctionalityToWorking;
	int functionalityDoNotMove;
	int getFreeFunToRelease;
	int getAdditionalApForStrategy;
	
	public EventCard(String name, int effectOnAttention,
			int negatedByTechnologyId, int effectOnStrategyInProgress,
			int goBack, int goRandomBack, int brokenFunctionalityToWorking,
			int functionalityDoNotMove, int getFreeFunToRelease,
			int getAdditionalApForStrategy) {
		super();
		this.name = name;
		this.effectOnAttention = effectOnAttention;
		this.negatedByTechnologyId = negatedByTechnologyId;
		this.effectOnStrategyInProgress = effectOnStrategyInProgress;
		this.goBack = goBack;
		this.goRandomBack = goRandomBack;
		this.brokenFunctionalityToWorking = brokenFunctionalityToWorking;
		this.functionalityDoNotMove = functionalityDoNotMove;
		this.getFreeFunToRelease = getFreeFunToRelease;
		this.getAdditionalApForStrategy = getAdditionalApForStrategy;
	}

	public String toString() {
		return "Card: name: " + name + 
				", effectOnAttention: " + effectOnAttention + 
				", negatedByTechnologyId: " + negatedByTechnologyId + 
				", effectOnStrategyInProgress: " + effectOnStrategyInProgress +
				", goBack: " + goBack + 
				", goRandomBack: " + goRandomBack +
				", brokenFunctionalityToWorking: " + brokenFunctionalityToWorking +
				", getFreeFunToRelease: " + getFreeFunToRelease + 
				", getAdditionalApForStrategy: " + getAdditionalApForStrategy;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEffectOnAttention() {
		return effectOnAttention;
	}

	public void setEffectOnAttention(int effectOnAttention) {
		this.effectOnAttention = effectOnAttention;
	}

	public int getNegatedByTechnologyId() {
		return negatedByTechnologyId;
	}

	public void setNegatedByTechnologyId(int negatedByTechnologyId) {
		this.negatedByTechnologyId = negatedByTechnologyId;
	}

	public int getEffectOnStrategyInProgress() {
		return effectOnStrategyInProgress;
	}

	public void setEffectOnStrategyInProgress(int effectOnStrategyInProgress) {
		this.effectOnStrategyInProgress = effectOnStrategyInProgress;
	}

	public int getGoBack() {
		return goBack;
	}

	public void setGoBack(int goBack) {
		this.goBack = goBack;
	}

	public int getGoRandomBack() {
		return goRandomBack;
	}

	public void setGoRandomBack(int goRandomBack) {
		this.goRandomBack = goRandomBack;
	}

	public int getBrokenFunctionalityToWorking() {
		return brokenFunctionalityToWorking;
	}

	public void setBrokenFunctionalityToWorking(int brokenFunctionalityToWorking) {
		this.brokenFunctionalityToWorking = brokenFunctionalityToWorking;
	}

	public int getFunctionalityDoNotMove() {
		return functionalityDoNotMove;
	}

	public void setFunctionalityDoNotMove(int functionalityDoNotMove) {
		this.functionalityDoNotMove = functionalityDoNotMove;
	}

	public int getGetFreeFunToRelease() {
		return getFreeFunToRelease;
	}

	public void setGetFreeFunToRelease(int getFreeFunToRelease) {
		this.getFreeFunToRelease = getFreeFunToRelease;
	}

	public int getGetAdditionalApForStrategy() {
		return getAdditionalApForStrategy;
	}

	public void setGetAdditionalApForStrategy(int getAdditionalApForStrategy) {
		this.getAdditionalApForStrategy = getAdditionalApForStrategy;
	}

}
