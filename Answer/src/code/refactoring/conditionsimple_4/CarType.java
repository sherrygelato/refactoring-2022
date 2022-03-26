package code.refactoring.conditionsimple_4;

public abstract class CarType {
	
	public static final int COMPACTCAR = 1;
	public static final int SEDANCAR = 2;
	public static final int SPORTCAR = 3;
	int currentSpeed = 0;
	
	public abstract int speedUp();

	public static CarType setType(int key) {
		switch(key) {
		case COMPACTCAR :
			return new CompactCar();
		case SEDANCAR :
			return new SedanCar();
		case SPORTCAR :
			return new SportCar();
		default:
			throw new IllegalArgumentException("Incorrect Car Type");
	}
	
	}
	

	


}
