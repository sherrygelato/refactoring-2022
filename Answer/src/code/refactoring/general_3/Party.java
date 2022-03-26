package code.refactoring.general_3;

public abstract class Party {
	
	private String _name;
	abstract public int getAnnualCost();
	
	protected Party (String name) {
		_name = name;
	}
	
	public String getName() {
		return _name;
	}
	
}
