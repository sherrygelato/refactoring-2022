package code.refactoring.complex_2;

public class PrintPrimes {

	public static void main(String[] args) {
		final int NUMBER_OF_PRIMES = 1000;		// 출력할 소스갯수
		final int ROWS_PER_PAGE = 50;		// 페이지당 Rows
		final int COLUMNS_PER_PAGE = 4;		// 페이지당 Columns
		final int WW = 10;
		
		// int PAGENUMBER;
		// int PAGEOFFSET;
		// int ROWOFFSET;
		// int C;
		// boolean JPRIME;
		
		int primes[] = PrimeGenerator.generatePrimes(NUMBER_OF_PRIMES); // p를 리턴해서 print input param에 넣어줘야 해서
		
		// RowColumnPagePrinter
		// printPrimes(NUMBER_OF_PRIMES, ROWS_PER_PAGE, COLUMNS_PER_PAGE, primes);
		RowPageColumnPrinter pagePrinter = new RowPageColumnPrinter(NUMBER_OF_PRIMES, ROWS_PER_PAGE, COLUMNS_PER_PAGE, primes);
		pagePrinter.printPrimes(primes);
	}
}
