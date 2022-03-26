package code.refactoring.conditionsimple_4_2;

import java.util.Scanner;

public class CarClient {
	public static final int COMPACTCAR = 1;
	public static final int SEDANCAR = 2;
	public static final int SPORTCAR = 3;


	public static void main(String[] args) {
		
		CarType carType = null;
		Scanner input = new Scanner(System.in);
		int key = input.nextInt();
		int currentSpeed = 0; 
		  
		switch(key) {
		case COMPACTCAR :
			carType = new CompactCar();
			System.out.println("경차가 선택되었습니다.");
			break;
		case SEDANCAR :
			carType = new SedanCar();
			System.out.println("중형차가 선택되었습니다.");
			break;
		case SPORTCAR :
			carType = new SportCar();
			System.out.println("스포츠카가 선택되었습니다.");
			break;
		}
		
		System.out.println("선택한 자동차의 현재속도는 "+carType.speedUp()+ " 입니다.");
	}

}
