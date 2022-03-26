package code.refactoring.complex_2;

public class PrimeGenerator2 {

	public static int[] generate(int NUMBER_OF_PRIMES) {
		int primes[] = new int[NUMBER_OF_PRIMES+1];
		boolean JPRIME;
		primes[1] = 2;
		int J = 1;
		int K = 1;
		int ORD = 2;
		int SQUARE = 9;
		int N;
		final int ORDMAX = 30;
		int MULT[] = new int[ORDMAX+1];


		while(K < NUMBER_OF_PRIMES) {	// 소수 Max 개수까지 반복
			do {
				J = J+2;
				if(J==SQUARE) {
					ORD = ORD + 1;
					SQUARE = primes[ORD] * primes[ORD];
					MULT[ORD-1] = J;
				}
				N = 2;
				JPRIME = true;
				while(N<ORD && JPRIME) {
					while (MULT[N] < J)
						MULT[N] = MULT[N] + primes[N] + primes[N];
					if (MULT[N]==J)
						JPRIME = false;
					N = N + 1;
				}
			} while(!JPRIME);
			K = K + 1;
			primes[K] = J;
		}
		return primes;
	}

}
