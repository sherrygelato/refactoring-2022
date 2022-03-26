package code.refactoring.complex_2;

public class PrintPrimes2 {

	public static void main(String[] args) {
		final int NUMBER_OF_PRIMES = 1000;		// 출력할 소스갯수
		final int ROWS_PER_PAGE = 50;		// 페이지당 Rows
		final int COLUMNS_PER_PAGE = 4;		// 페이지당 Columns
		
		int primes[] = PrimeGenerator2.generate(NUMBER_OF_PRIMES);
		RowColumnPagePrinter2 tablePrinter = new RowColumnPagePrinter2(ROWS_PER_PAGE, COLUMNS_PER_PAGE,
				"The First " + NUMBER_OF_PRIMES + " Prime Numbers", NUMBER_OF_PRIMES);
		
		tablePrinter.print(primes);

	}
}
