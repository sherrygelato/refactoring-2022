package code.refactoring.dataarrange_3;

public class ReferenceMain {
	 public static void main(String[] args){ 
	        Sun s1 = null;            // ��ü ���� ���� 
	        Sun s2 = null;            // ��ü ���� ���� 
	        s1 = new Sun();          // �޸� �Ҵ� 
	        s2 = new Sun();          // �޸� �Ҵ� 
	        System.out.println("Sun�� ���� s1�� ����:" + s1);  //��ü ���� - ������ ��� (�޸� �ּҿ� ����� ������)
	        System.out.println("Sun�� ���� s2�� ����:" + s2);  //��ü ���� - ������ ���
	 }
}
