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
			System.out.println("������ ���õǾ����ϴ�.");
			break;
		case SEDANCAR :
			carType = new SedanCar();
			System.out.println("�������� ���õǾ����ϴ�.");
			break;
		case SPORTCAR :
			carType = new SportCar();
			System.out.println("������ī�� ���õǾ����ϴ�.");
			break;
		}
		
		System.out.println("������ �ڵ����� ����ӵ��� "+carType.speedUp()+ " �Դϴ�.");
	}

}
