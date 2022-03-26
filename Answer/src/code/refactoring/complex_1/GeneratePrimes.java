package code.refactoring.complex_1;

/**
 * �� Ŭ������ ����ڰ� ������ �ִ� ������ �Ҽ��� �����Ѵ�. 
 * ���� �˰����� ��������׽��� ü��.
 * 2���� �����ϴ� ���� �迭�� ������� �۾��Ѵ�.
 * ó������ �����ִ� ������ ã�� ����� ��� �����Ѵ�.
 * �迭�� ���̻� ����� ���� ������ �ݺ��Ѵ�.
 * 
 * @author Bob
 * @version 2012.02.13
 *
 */

public class GeneratePrimes {

	private boolean[] crossedOut;	//  1�� �����������
	private int[] result;
	
    public int getPrimes(int maxValue) {
        
		if (maxValue <2) 
		    System.out.println("primes ���� 0 �� �Դϴ�.");
		else {
			initiateArray(maxValue);
			checkPrimes();
			putPrimesResult();
			System.out.println("primes ���� " + result.length + "�� �Դϴ�.");
		}
		return result.length;
	}

    // 1�� �۾� �ʱⰪ ����
	private void initiateArray(int maxValue) {
		crossedOut = new boolean[maxValue+1];
		for(int i=0; i<crossedOut.length; i++)
			crossedOut[i] = true;		
		crossedOut[0] = crossedOut[1]= false;
	}
	
	// 2�� �Ҽ�üũ
	private void checkPrimes() {
		// �迭�� �ִ� ��� ����� �迭 ũ���� �����ٺ��� ���� �Ҽ��� �μ���.
		// ���� �� �����ٺ��� �� ū ������ ����� ������ �ʿ䰡 ����.
		double iterationLimit = Math.sqrt(crossedOut.length);
		int limit = (int)iterationLimit;
		for(int i=2; i<limit+1; i++) {
			if(crossedOut[i]) {
				for(int multiple = 2*i; multiple < crossedOut.length; multiple +=i) 
					crossedOut[multiple] = false;
			}
		}
		
	}

	// 3�� �Ҽ������� ��������� �̵�
	private void putPrimesResult() {
		int count=0;
		// �迭�� ũ�⸦ ����
		for(int i=0; i<crossedOut.length; i++)
			if (crossedOut[i])
				count++;	
		result = new int[count];	
		// ��������� �̵�
		for (int j=0, i=0; i<crossedOut.length; i++) {
			if (crossedOut[i])
				result[j++] = i;
		}
	}

}
