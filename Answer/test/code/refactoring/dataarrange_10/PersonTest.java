package code.refactoring.dataarrange_10;

public class PersonTest {
	public static void main(String[] args) {
		// Person kent = new Male();
		//Person kent = Person.createMale(); // 2
		Person kent = new Person(true,'M'); // 6
		System.out.println( kent.CreateMale()  );
	} 
}
