package code.refactoring.methodsimple_3;

public class Room {

	boolean withinPlan(HeatingPlan plan) {
		return plan.withinRange(daysTempRange());
	}
	
	TempRange daysTempRange() {   
		TempRange temp=new TempRange() ;  
		return temp;
	}

}
