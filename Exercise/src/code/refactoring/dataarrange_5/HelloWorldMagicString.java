package code.refactoring.dataarrange_5;

public class HelloWorldMagicString {

    private static final String FIRSTWORD = "Hello";
    private static final String SECONDWORD = "World";

    public static void main(String[] args) {
        // 하드 코딩 없애기
        // System.out.println("Hello World");
        // 출력 부분 별도 클래스 생성
        MakeSentence  makeSentence = new MakeSentence(FIRSTWORD, SECONDWORD);
        makeSentence.printSentence();
    }

}
