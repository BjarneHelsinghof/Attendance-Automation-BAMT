/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendenceautomation.UTIL;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Was going to be used to convert dates to a formatted String.
 * However, with the change to database this is not needed.
 * @author Theis
 */
public class DateConverter
{

    private Date currentDate;
    private Calendar currentCalendar;

    public DateConverter(Date currentDate)
    {
        this.currentDate = currentDate;
       
    }
    
 public String convertDate()
    {
        Date date = currentCalendar.getTime();
        DateFormat dateFormat = new SimpleDateFormat("YYYY-mm-dd");
        String strDate = dateFormat.format(date);
        return strDate;
    }   
}
