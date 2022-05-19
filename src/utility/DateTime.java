package utility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
	
	public static String getTime()	{
		DateTimeFormatter d = DateTimeFormatter.ofPattern("d MMM yyyy HH-mm-ss");
		LocalDateTime current = LocalDateTime.now();
		String time = d.format(current);
		System.out.println(time);
		return time;
	}

	public static void main(String[] args) {
		DateTime.getTime();
	}
}
