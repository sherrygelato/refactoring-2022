package code.refactoring.conditionsimple_4_2;

public class SedanCar extends CarType {

	@Override
	public int speedUp() {
		// TODO Auto-generated method stub
		currentSpeed = currentSpeed + 20;
		return currentSpeed;
	}

}
