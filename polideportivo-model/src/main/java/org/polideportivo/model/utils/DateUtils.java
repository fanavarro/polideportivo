package org.polideportivo.model.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	
	/**
	 * Create a Date object transforming the dateString using the format specified.
	 * @param dateString
	 * @param format
	 * @return Date
	 * @throws ParseException 
	 */
	public static Date getDateByString(String dateString, String format) throws ParseException{
		SimpleDateFormat dt = new SimpleDateFormat(format); 
		Date date = dt.parse(dateString); 
		return date;
	}
}
