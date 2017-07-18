package test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			HashMap<Integer, String> tt = new HashMap<>();
			tt.put(1, "tt1");
			tt.put(2, "tt2");
			
			tt.remove(3);
			System.out.println("After"+new Date());
			System.out.println(new Date(System.currentTimeMillis()-5*1000));
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

			LocalDateTime dateTime1= LocalDateTime.parse(formatter.format((TemporalAccessor) new Date()), formatter);
			
			Calendar cale2out = Calendar.getInstance();
	    	cale2out.add(Calendar.DATE, -2);
	    	cale2out.add(Calendar.HOUR, -4);
	    	
	    	Date logoutDatee2 = cale2out.getTime();
			
			LocalDateTime dateTime2= LocalDateTime.parse(formatter.format((TemporalAccessor) logoutDatee2), formatter);

			long diffInMilli = java.time.Duration.between(dateTime1, dateTime2).toMillis();
			long diffInSeconds = java.time.Duration.between(dateTime1, dateTime2).getSeconds();
			long diffInMinutes = java.time.Duration.between(dateTime2, dateTime1).toMinutes();
			
			System.out.println(diffInMinutes);
	}

}
