package code.refactoring.conditionsimple_4_2;

public class SportCar extends CarType {

	@Override
	public int speedUp() {
		// TODO Auto-generated method stub
		currentSpeed = currentSpeed + 30;
		return currentSpeed;
	}

}
