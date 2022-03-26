package code.refactoring.methodarrange_4;

public class Distance {

	private int _primaryForce = 10;
	private int _secondaryForce = 20;
	private int _mass = 3; 
	private int _delay = 1;
	
	public double getDistanceTravelled (int time) {
		
		double result;
		//  acc 변수에 값이 2번 할당되어  primaryAcc, secondaryAcc 로 분리함
		//  final 로 설정하면 변수 2번 입력이 불가능함
		final double primaryAcc = _primaryForce / _mass;
		int primaryTime = Math.min(time, _delay);
		result = 0.5 * primaryAcc * primaryTime * primaryTime;
		
		int secondaryTime = time - _delay;
		if (secondaryTime > 0) {
			double primaryVel = primaryAcc * _delay;
			final double secondaryAcc = (_primaryForce + _secondaryForce) / _mass;
			result += primaryVel * secondaryTime + 0.5 * secondaryAcc * secondaryTime * secondaryTime;
		}
		return result;
	}
}
