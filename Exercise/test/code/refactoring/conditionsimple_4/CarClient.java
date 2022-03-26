package code.refactoring.conditionsimple_4;

import java.util.Scanner;

public class CarClient {
	// public static final int COMPACTCAR = 1;
	// public static final int SEDANCAR = 2;
	// public static final int SPORTCAR = 3;

	public static void main(String[] args) {
		
		CarType cartype = null;
		Scanner input = new Scanner(System.in);
		int key = input.nextInt();

		cartype = CarType.setType(key);
		  
		// 경우의 수 조건 따라 처리 되는 파일 클래스 결정
		// switch(key) {
		// case COMPACTCAR :
		// 	cartype = new CompactCar();
		// 	break;
		// case SEDANCAR :
		// 	cartype = new SedanCar();
		// 	break;
		// case SPORTCAR :
		// 	cartype = new SportCar();
		// 	break;
		// }
		
		System.out.println("선택한 자동차의 속도는 "+ cartype.speedUp() + " 입니다.");
	}

}
