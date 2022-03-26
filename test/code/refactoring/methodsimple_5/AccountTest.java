package code.refactoring.methodsimple_5;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class AccountTest {
	Vector _entries = new Vector();

	// 두 날짜 사이의 계좌 입출금 현황을 알아내는 메서드
	double getFlowBetween (DateRange dateRange) {
		double result = 0;
		_entries.addElement(new Entry(10, new Date(2016, 1, 2)));
		_entries.addElement(new Entry(20, new Date(2016, 1, 3)));
		_entries.addElement(new Entry(30, new Date(2016, 1, 4)));
		
		Enumeration e = _entries.elements();

		while (e.hasMoreElements()) {
			Entry each = (Entry) e.nextElement();
			if (each.getDate().equals(dateRange.get_startDate()) ||
					each.getDate().equals(dateRange.get_endDate()) ||
					(each.getDate().after(dateRange.get_startDate()) && each.getDate().before(dateRange.get_endDate())))
			{
				result += each.getValue();
			}
		}
		return result;
	}
}
