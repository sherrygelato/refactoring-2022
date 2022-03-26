package code.refactoring.dataarrange_5;

public class HelloWorldMagicString2 {
	
	private static final String FIRSTWORD = "Hello";
	private static final String SECODWORD = "World";

    public static void main(String[] args) {
        //System.out.println("Hello World");
    	MakeSentence sentence = new MakeSentence(FIRSTWORD, SECODWORD);
    	sentence.makeSentence();
    }
    
}
