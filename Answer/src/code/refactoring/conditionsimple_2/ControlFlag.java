package code.refactoring.conditionsimple_2;

public class ControlFlag {
	
	public ControlFlag() {}
	
	public void checkSecurity(String[] people) {
		String found = foundMiscreant(people);
	
	}

	private String foundMiscreant(String[] people) {
		
		String found = "";
		
		for (int i = 0; i < people.length; i++) {
			if (people[i].equals("Don")) {
				sendAlert(people[i]);
				return "Don";
			}
			if (people[i].equals("John")) {
				sendAlert(people[i]);
				return "John";
			}
		}
		return found;
	}

	private void sendAlert(String user) {
		System.out.println(user + " Access Permitted!!");
		
	}

}
