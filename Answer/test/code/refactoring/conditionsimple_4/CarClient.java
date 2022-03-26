package code.refactoring.conditionsimple_4;

import java.util.Scanner;

public class CarClient {


	
	public static void main(String[] args) {
		
		CarType cartype = null;
		Scanner input = new Scanner(System.in);
		int key = input.nextInt();
		
		cartype = CarType.setType(key);

//		switch(key) {
//			case COMPACTCAR :
//				cartype = new CompactCar();
//				break;
//			case SEDANCAR :
//				cartype = new SedanCar();
//				break;
//			case SPORTCAR :
//				cartype = new SportCar();
//				break;
//			default:
//				throw new IllegalArgumentException("Incorrect Car Type");
//		}
//		
		int currentSpeed = cartype.speedUp();
		System.out.println("선택한 자동차의 현재속도는 "+currentSpeed+ " 입니다.");
	}
	
}
