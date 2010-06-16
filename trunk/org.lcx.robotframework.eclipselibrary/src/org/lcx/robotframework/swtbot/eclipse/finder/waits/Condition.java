package org.lcx.robotframework.swtbot.eclipse.finder.waits;

import org.lcx.robotframework.swtbot.commons.AbstractSWTBotObject;
import org.lcx.robotframework.swtbot.swt.finder.waits.ICondition;

public class Condition extends AbstractSWTBotObject implements ICondition {
	
	public Condition(Object o) {
		super(o);
	}

	public Object getCondition() {
		return distantObject;
	}

}
