package code.refactoring.conditionsimple_4;

public class SportCar extends CarType{

    @Override
    public int speedUp() {
        // currentSpeed = currentSpeed + 30;
        System.out.println("스포츠카가 선택되었습니다.");
        return currentSpeed + 30;
    }
    
}
