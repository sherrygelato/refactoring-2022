package code.refactoring.methodarrange_4;

public class Distance {

	private int _primaryForce = 10;
	private int _secondaryForce = 20;
	private int _mass = 3; 
	private int _delay = 1;
	
	public double getDistanceTravelled (int time) {
		
		double result;
		//  acc ������ ���� 2�� �Ҵ�Ǿ�  primaryAcc, secondaryAcc �� �и���
		//  final �� �����ϸ� ���� 2�� �Է��� �Ұ�����
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
