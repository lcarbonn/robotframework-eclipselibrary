package org.lcx.robotframework.swtbot.eclipse.finder.waits;

import org.lcx.robotframework.swtbot.swt.finder.waits.ICondition;

public class Condition implements ICondition {
	
	Object condition;

	public Condition(Object o) {
		condition = o;
	}

	public Object getCondition() {
		return condition;
	}

}
