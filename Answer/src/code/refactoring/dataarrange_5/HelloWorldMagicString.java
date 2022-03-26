package code.refactoring.dataarrange_5;

public class HelloWorldMagicString {

    private static final String FIRST_WORD = "Hello";
    private static final String SECOND_WORD = "World";
    private String firstWord;
    private String secondWord;

    public HelloWorldMagicString(String firstWord, String secondWord) {
        this.firstWord = firstWord;
        this.secondWord = secondWord;
    }
    
    private void saySentence() {
        String finalSentence = firstWord + " " + secondWord;
        System.out.println(finalSentence);
    }

    public static void main(String[] args) {
        HelloWorldMagicString makeSentence = new HelloWorldMagicString(FIRST_WORD, SECOND_WORD);
        makeSentence.saySentence();
    }


}
