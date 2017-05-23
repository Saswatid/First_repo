import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;



public class Calender{
	
	public static void main(String[] args) throws ParseException {
		
		String dateInString = "2016-09-30 00:00:00.04:00";
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		Date date = sdf.parse(dateInString);

		SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd");
		Calendar calendar = GregorianCalendar.getInstance();
		calendar.setTime(date);
		
		System.out.println(dt1.format(date));
		
	}
	
}