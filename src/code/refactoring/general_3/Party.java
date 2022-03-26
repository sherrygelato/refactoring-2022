package code.refactoring.general_3;

public abstract class Party {

    // 1. name 속성 상향처리
    private String _name;

    protected Party(String name) {
        this._name = name;
    }

    protected String getName() {
		return _name;
	}

    // 2. getAnnualCost() 하위 클래스에서 강제적으로 구현할 수 있도록 abstract 선언
    public abstract int getAnnualCost();
    
}
