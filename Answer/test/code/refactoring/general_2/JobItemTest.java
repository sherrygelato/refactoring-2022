package code.refactoring.general_2;

public class JobItemTest {
	
	public static void main(String[] args) {
		Employee kent = new Employee(1);
		//	JobItem jobitem = new JobItem(0, 5, true, kent);
		JobItem jobitem = new JobItem(10, 15);
		LaborItem laboritem = new LaborItem(15, kent);
	
		System.out.println("jobitem.getTotalPrice() --> " + jobitem.getTotalPrice());
		System.out.println("jobitem.getQuantity() --> " + jobitem.getQuantity());
		System.out.println("jobitem.getUnitPrice() --> " + jobitem.getUnitPrice());
		System.out.println("jobitem.getEmployee().getRate() --> " + laboritem.getEmployee().getRate());
		System.out.println("jobitem.getUnitPrice() --> " + laboritem.getUnitPrice());
		
	}

}
