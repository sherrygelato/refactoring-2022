package code.refactoring.conditionsimple_4;

public class SedanCar extends CarType{

    @Override
    public int speedUp() {
        // currentSpeed = currentSpeed + 20;
		System.out.println("중형차가 선택되었습니다.");
        return currentSpeed + 20;
    }
    
}
