package code.refactoring.dataarrange_2;

public class Customor {

    private String _customor;

    public String get_customer() {
        return _customor;
    }

    // 매번 노출 시키기 부담 스럽기에 생성자 통해서 
    // public void set_customer(String _customer) {
    //     this._customer = _customer;
    // }

    // 이런 생성자
    public Customor(String _customor2) {
        this._customor = _customor2;
    }
    
}
