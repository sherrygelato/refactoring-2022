package code.refactoring.dataarrange_9;

public class Employee {

	// private int _type;
   private EmployeeType _Type;
   // static final int ENGINEER = 0;
   // static final int SALESMAN = 1;
   // static final int MANAGER = 2;
   // int  _monthlySalary=1, _commission=1,  _bonus=1;

    
   public Employee(int type) {
   	// _type = type;
      this._Type = EmployeeType.setType(type);
   }

   // 1. EmployeeType - 선언, 생성 
   // 2. 각각의 하위 클래스 Engineer, SalesMan, Manager - 구현 부분 담당
    
   int payAmount() {

      return _Type.payAmount();
      // switch (_type) {
      //    case ENGINEER:
      //       return _monthlySalary;
      //    case SALESMAN:
      //       return _monthlySalary + _commission;
      //    case MANAGER:
      //       return _monthlySalary + _bonus;
      //    default:
      //       throw new RuntimeException("Incorrect Employee");
      //   }
    }
}
