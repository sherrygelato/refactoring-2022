package code.refactoring.conditionsimple_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class HeatingBill {
	
	private static final String SUMMER_START = "06-01";
	private static final String SUMMER_END = "08-30";
	private double _winterRate = 1.5;
	private double _summerRate = 2;
	private double _winterServiceCharge = 10;
	

	public HeatingBill() {}
	
	public double calculateBills (int quantity, Date date) {
		double charge = 0;

		if (notSummer(date))
			charge = winterCharge(quantity);
		else charge = summerCharge(quantity);
		
		return charge;
	}
	
	private boolean notSummer(Date date) {
		int startCompare = 0;
		int endCompare = 0;
		
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("MM-dd");
			Date startDate = formatter.parse(SUMMER_START);
			Date endDate = formatter.parse(SUMMER_END);
			startCompare = date.compareTo(startDate);
			endCompare = date.compareTo(endDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return startCompare < 0 || endCompare > 0;
	}

	private double winterCharge(int quantity) {
		double charge;
		charge  = quantity * _winterRate + _winterServiceCharge;
		return charge;
	}

	private double summerCharge(int quantity) {
		return quantity * _summerRate;
	}
}
