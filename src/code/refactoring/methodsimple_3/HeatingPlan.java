package code.refactoring.methodsimple_3;

public class HeatingPlan {
	private TempRange _range = new TempRange();
		
	boolean withinRange (TempRange roomRange) {
	    return (roomRange.getLow() >= _range.getLow() && roomRange.getHigh() <= _range.getHigh());
	}
}
