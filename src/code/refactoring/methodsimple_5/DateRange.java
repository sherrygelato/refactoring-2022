package code.refactoring.methodsimple_5;

import java.util.Date;

public class DateRange {
    private Date _startDate;
    private Date _endDate;

    public Date get_startDate() {
        return _startDate;
    }

    public Date get_endDate() {
        return _endDate;
    }

    

    public DateRange(Date startDate, Date endDate) {
        this._startDate = startDate;
        this._endDate = endDate;
    }
    
}
