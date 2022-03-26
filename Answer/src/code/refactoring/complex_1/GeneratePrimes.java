package code.refactoring.complex_1;

/**
 * 이 클래스는 사용자가 지정한 최대 값까지 소수를 생성한다. 
 * 사용된 알고리즘은 에라스토네테스의 체다.
 * 2에서 시작하는 정수 배열을 대상으로 작업한다.
 * 처음으로 남아있는 정수를 찾아 배수를 모두 제거한다.
 * 배열에 더이상 배수가 없을 때까지 반복한다.
 * 
 * @author Bob
 * @version 2012.02.13
 *
 */

public class GeneratePrimes {

	private boolean[] crossedOut;	//  1번 멤버변수선언
	private int[] result;
	
    public int getPrimes(int maxValue) {
        
		if (maxValue <2) 
		    System.out.println("primes 수는 0 개 입니다.");
		else {
			initiateArray(maxValue);
			checkPrimes();
			putPrimesResult();
			System.out.println("primes 수는 " + result.length + "개 입니다.");
		}
		return result.length;
	}

    // 1번 작업 초기값 셋팅
	private void initiateArray(int maxValue) {
		crossedOut = new boolean[maxValue+1];
		for(int i=0; i<crossedOut.length; i++)
			crossedOut[i] = true;		
		crossedOut[0] = crossedOut[1]= false;
	}
	
	// 2번 소수체크
	private void checkPrimes() {
		// 배열에 있는 모든 배수는 배열 크기의 제곱근보다 작은 소수의 인수다.
		// 따라서 이 제곱근보다 더 큰 숫자의 배수는 제거할 필요가 없다.
		double iterationLimit = Math.sqrt(crossedOut.length);
		int limit = (int)iterationLimit;
		for(int i=2; i<limit+1; i++) {
			if(crossedOut[i]) {
				for(int multiple = 2*i; multiple < crossedOut.length; multiple +=i) 
					crossedOut[multiple] = false;
			}
		}
		
	}

	// 3번 소수내역을 결과값으로 이동
	private void putPrimesResult() {
		int count=0;
		// 배열의 크기를 구함
		for(int i=0; i<crossedOut.length; i++)
			if (crossedOut[i])
				count++;	
		result = new int[count];	
		// 결과값으로 이동
		for (int j=0, i=0; i<crossedOut.length; i++) {
			if (crossedOut[i])
				result[j++] = i;
		}
	}

}
