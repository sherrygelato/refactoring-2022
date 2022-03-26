package code.refactoring.complex_2;

public class PrintPrimes {

	public static void main(String[] args) {
		final int NUMBER_OF_PRIMES = 1000;		// ����� �ҽ�����
		final int ROWS_PER_PAGE = 50;		// �������� Rows
		final int COLUMNS_PER_PAGE = 4;		// �������� Columns
		final int WW = 10;
		
		// int PAGENUMBER;
		// int PAGEOFFSET;
		// int ROWOFFSET;
		// int C;
		// boolean JPRIME;
		
		int primes[] = PrimeGenerator.generatePrimes(NUMBER_OF_PRIMES); // p�� �����ؼ� print input param�� �־���� �ؼ�
		
		// RowColumnPagePrinter
		// printPrimes(NUMBER_OF_PRIMES, ROWS_PER_PAGE, COLUMNS_PER_PAGE, primes);
		RowPageColumnPrinter pagePrinter = new RowPageColumnPrinter(NUMBER_OF_PRIMES, ROWS_PER_PAGE, COLUMNS_PER_PAGE, primes);
		pagePrinter.printPrimes(primes);
	}
}
