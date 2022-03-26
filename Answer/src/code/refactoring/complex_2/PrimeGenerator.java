package code.refactoring.complex_2;

import java.util.ArrayList;

public class PrimeGenerator {

	private static int[] primes;
	private static ArrayList<Integer> multiplesOfPrimeFactors;
	
	public static int[] generate(int n) {
		primes = new int[n];
		multiplesOfPrimeFactors = new ArrayList<Integer>();
		set2AsFirstPrime();
		checkOddNumbersForSubsequentPrimes();
		return primes;
	}

	private static void set2AsFirstPrime() {
		primes[0] = 2;
		multiplesOfPrimeFactors.add(2);		
	}

	private static void checkOddNumbersForSubsequentPrimes() {
		int primeIndex = 1;
		for(int candidate=3; primeIndex < primes.length; candidate += 2) {
			if(isPrime(candidate)) {
				primes[primeIndex++] = candidate;
			}
		}
	}

	private static boolean isPrime(int candidate) {
		int nextLargerPrimeFactor = primes[multiplesOfPrimeFactors.size()];
		int leastRelevantMultiple = nextLargerPrimeFactor * nextLargerPrimeFactor;
				
		if (candidate == leastRelevantMultiple) {
			multiplesOfPrimeFactors.add(candidate);
			return false;
		}
		
		for(int n=1; n < multiplesOfPrimeFactors.size(); n++) {
			int multiple = multiplesOfPrimeFactors.get(n);
			
			while(multiple < candidate) {
				multiple += 2 * primes[n];
			}
			multiplesOfPrimeFactors.set(n, multiple);
			
			if(candidate == multiple) {
				return false;
			}
		}
		return true;
	}
}
