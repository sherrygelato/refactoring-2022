package code.refactoring.general_2;

public class JobItemTest {
	
	public static void main(String[] args) {
		Employee kent = new Employee(1);
		JobItem jobitem = new JobItem(0, 5);
		LaborItem laborItem = new LaborItem(0, 5, kent);
	
		System.out.println("jobitem.getTotalPrice() --> " + jobitem.getTotalPrice());
		System.out.println("jobitem.getQuantity() --> " + jobitem.getQuantity());
		System.out.println("jobitem.getUnitPrice() --> " + jobitem.getUnitPrice());
		System.out.println("jobitem.getEmployee().getRate() --> " + laborItem.getEmployee().getRate());
		System.out.println("jobitem.getUnitPrice() --> " + laborItem.getUnitPrice());
		
	}

}
