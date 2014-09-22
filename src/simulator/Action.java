package simulator;

public class Action {
	
	ActionType actionType;
	int attentionAcquired;
	int attentionSpentOnEvent;

	public Action(ActionType actionType, int attentionAcquired, int attentionSpentOnEvent) {
		super();
		this.actionType = actionType;
		this.attentionAcquired = attentionAcquired;
		this.attentionSpentOnEvent = attentionSpentOnEvent;
	}

	public ActionType getActionType() {
		return actionType;
	}
	
}
