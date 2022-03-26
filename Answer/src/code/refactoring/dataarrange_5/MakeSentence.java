package code.refactoring.dataarrange_5;

public class MakeSentence {
	
	private String firstword;
	private String secondword;

	public MakeSentence(String firstword, String secondword) {
		this.firstword = firstword;
		this.secondword = secondword;
	}

	public void makeSentence() {
		System.out.println(firstword + "###" + secondword);
		
	}

}
