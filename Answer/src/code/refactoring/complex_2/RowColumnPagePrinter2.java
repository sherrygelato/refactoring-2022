package code.refactoring.complex_2;

import java.io.PrintStream;

public class RowColumnPagePrinter2 {
	private int ROWS_PER_PAGE;
	private int COLUMNS_PER_PAGE;
	private int NUMBER_OF_PRIMES;
	private String pageHeader;
	private PrintStream printStream;

	public RowColumnPagePrinter2(int rowsPerPage, int columnsPerPage, String pageHeader, int NUMBER_OF_PRIMES) {
		this.ROWS_PER_PAGE = rowsPerPage;
		this.COLUMNS_PER_PAGE = columnsPerPage;
		this.pageHeader = pageHeader;
		this.NUMBER_OF_PRIMES = NUMBER_OF_PRIMES;		
	}

	public void print(int[] primes) {
		
		int PAGENUMBER;
		int PAGEOFFSET;
		int ROWOFFSET;
		int C;

		// RowColumnPagePrinter
		{
			PAGENUMBER = 1;
			PAGEOFFSET = 1;
			while(PAGEOFFSET <= NUMBER_OF_PRIMES) {
				System.out.println(pageHeader + PAGENUMBER);  //페이지 헤더 (변경될수 있으므로 Input을 받아야함
				System.out.println("");
				// 페이지단위 프린트
				for(ROWOFFSET = PAGEOFFSET; ROWOFFSET < PAGEOFFSET + ROWS_PER_PAGE; ROWOFFSET++) {
					for(C=0; C < COLUMNS_PER_PAGE; C++)
						if (ROWOFFSET + C * ROWS_PER_PAGE <= NUMBER_OF_PRIMES)
							System.out.format("%10d", primes[ROWOFFSET + C * ROWS_PER_PAGE]);
					System.out.println("");
				}
				System.out.println("\f");
				PAGENUMBER = PAGENUMBER + 1;
				PAGEOFFSET = PAGEOFFSET + ROWS_PER_PAGE * COLUMNS_PER_PAGE;
			}
		}
		
	}

}
