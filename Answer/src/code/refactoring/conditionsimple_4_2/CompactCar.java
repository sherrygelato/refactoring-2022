package code.refactoring.conditionsimple_4_2;

public class CompactCar extends CarType {

	@Override
	public int speedUp() {
		// TODO Auto-generated method stub
		currentSpeed = currentSpeed + 10;
		return currentSpeed;
	}

}
