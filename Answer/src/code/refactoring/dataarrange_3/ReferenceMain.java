package code.refactoring.dataarrange_3;

public class ReferenceMain {
	 public static void main(String[] args){ 
	        Sun s1 = null;            // 객체 변수 선언 
	        Sun s2 = null;            // 객체 변수 선언 
	        s1 = new Sun();          // 메모리 할당 
	        s2 = new Sun();          // 메모리 할당 
	        System.out.println("Sun의 변수 s1의 값은:" + s1);  //객체 변수 - 참조값 출력 (메모리 주소에 연결된 참조값)
	        System.out.println("Sun의 변수 s2의 값은:" + s2);  //객체 변수 - 참조값 출력
	 }
}
