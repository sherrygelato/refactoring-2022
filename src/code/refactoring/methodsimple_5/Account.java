package code.refactoring.methodsimple_5;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class Account {
	Vector _entries = new Vector();

	// �� ��¥ ������ ��������� ��Ȳ�� �˾Ƴ��� �޼���
	double getFlowBetween (Date start, Date end) {
		double result = 0;
		_entries.addElement(new Entry(10, new Date(2016, 1, 2)));
		_entries.addElement(new Entry(20, new Date(2016, 1, 3)));
		_entries.addElement(new Entry(30, new Date(2016, 1, 4)));
		
		Enumeration e = _entries.elements();

		while (e.hasMoreElements()) {
			Entry each = (Entry) e.nextElement();
			if (each.getDate().equals(start) ||
					each.getDate().equals(end) ||
					(each.getDate().after(start) && each.getDate().before(end)))
			{
				result += each.getValue();
			}
		}
		return result;
	}
}
