package com.lessayer;

import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.stream.Collectors;

public class CalendarPractice {
	
	public static void main (String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		// Show current date in the format of "YEAR + MONTH + DAY_OF_MONTH" with the separator "/".
		// Example: 2022/5/22
		System.out.println(printDate(calendar));
		
		// Show current date and time. Concate the previous date format with a space and HH:MM:SS.
		// Example: 2022/5/22 21:09:22
		System.out.println(printDateTime(calendar));
		
		// Set the Locale to "Europe/Paris" and print the date and time again.
		calendar.setTimeZone(TimeZone.getTimeZone("Europe/Paris"));
		System.out.println(printDateTime(calendar));
		
		// Use getDisplayNames to print the full name of each month in French.
		List<String> monthsInFrench = getMonthNameListByLocale(calendar, Locale.FRANCE); 
		System.out.println(monthsInFrench);
		
		// Use getDisplayNames to print the full name of each day in French. The Locale should be set to France.
		List<String> daysInFrench = getDayNameListByLocale(calendar, Locale.FRANCE);  
		System.out.println(daysInFrench);
		
		// Set the date to 2024.7.26 and print the DAY_OF_WEEK with getDisplayName. Again, set the Locale to France.
		// This time, use the SHORT_FORMAT style.
		calendar.set(2024, 6, 26);
		System.out.println(printDate(calendar) + " " + null);
		
	}

	private static List<String> getDayNameListByLocale(Calendar calendar, Locale locale) {
		return null;
	}

	private static List<String> getMonthNameListByLocale(Calendar calendar, Locale locale) {
		return null;
	}

	private static String printDateTime(Calendar calendar) {
		return null;
	}

	private static String printDate(Calendar calendar) {
		return null;
	}
	
}