package code.refactoring.dataarrange_5;

public class MakeSentence {

    // 멤버 변수 선언
    private String firstword;
    private String secondword;

    public MakeSentence(String firstword, String secondword) {
        this.firstword = firstword;
        this.secondword = secondword;
    }

    public void printSentence() {
        System.out.println(firstword + " " + secondword);
    }

}
