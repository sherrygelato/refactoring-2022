package code.refactoring.methodsimple_3;

public class Room {
	boolean withinPlan(HeatingPlan plan) {
//	    int low = daysTempRange().getLow();
//	    int high = daysTempRange().getHigh();
	    return plan.withinRange(daysTempRange());		//�Ķ���͸� ��ü�� ��ȯ
	}
	
	TempRange daysTempRange() {   
		TempRange temp=new TempRange() ;  
		return temp;
	}

}
