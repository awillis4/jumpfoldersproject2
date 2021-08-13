package com.cognixia.jump.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class DateExamples {

	public static void main(String[] args) throws ParseException {

		// uncomment the methods for each example you wish to run
		
		//getDate();
		//dateFormat();
		//stringToDate();
		//getLocalDateTime();
		getZonedDate();

	}

	public static void getDate() {

		// A new date object will be set to today's date and time (will obtain this info from your system)
		// Though it lists a time zone, IT DOES NOT KEEP TRACK OF TIME ZONES, it grabs this info from
		// your system
		Date today = new Date();
		
		// Date object has a toString method that will print the date in a standard format.
		System.out.println(today);

	}

	public static void dateFormat() {

		// set up a new date object
		Date today = new Date();
		
		// will create two SimpleDateFormat objects
		// SimpleDateFormat can be used with Date objects to print dates in a desired format
		SimpleDateFormat sdf1, sdf2;

		// Below we specify the exact formatting for our dates
		// these are the way each section of a date is represented
		// M -> month (m is used to represent minute, so M is used for month)
		// d -> day
		// y -> year
		// H -> hour using military time (24 hour format)
		// h -> hour using AM/PM (12 hour format)
		// m -> minute
		// s -> second
		sdf1 = new SimpleDateFormat("MM/dd/yy HH:mm:ss");
		sdf2 = new SimpleDateFormat("MMMM dd, yyyy");

		// use format() to convert the date objects to these formatted strings
		String formattedDate1 = sdf1.format(today);
		String formattedDate2 = sdf2.format(today);

		System.out.println(formattedDate1);
		System.out.println(formattedDate2);

	}

	public static void stringToDate() throws ParseException {
		
		// Here is a date in a string object and in a  day, month, year format 
		// that we would like to work with as a Date object
		String dateStr = "15/10/2020";

		// Passing the string's format into a SimpleDateFormat's constructor will allow us to parse the string
		// Note that SimpleDateFormat's .format() method returns a String, but .parse() returns a Date object.
		Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateStr);
		System.out.println("date = " + date);

	}

	public static void getLocalDateTime() {

		// A LocalDate is an object that offers methods relating to dates
		// A LocalDate object can be created with the of syntax.
		LocalDate July3 = LocalDate.of(2015, 07, 03);
		System.out.println("July3 = " + July3);
		// The LocalDate can also be gotten from a string in the Year-Month-Day format
		LocalDate ld = LocalDate.parse("2015-07-03");
		System.out.println("ld = " + ld);

		// The LocalDate class gives access to several useful date methods
		LocalDate July6 = July3.plusDays(3);
		System.out.println(July6);
		System.out.println("July 6th, 2015 was a " + July6.getDayOfWeek());

		// A LocalTime is a time without a date
		LocalTime now = LocalTime.now();
		System.out.println("now = " + now);

		// A LocalTime can also parse a string in this exact format to get a time
		LocalTime eightFourtyFive = LocalTime.of(8, 45);
		// LocalTime eightFourtyFive = LocalTime.parse("08:45");
		System.out.println("eightFourtyFive = " + eightFourtyFive);

		// A LocalDateTime is a combination of Date and Time
		// The overloaded constructor can take date and time parameters, or a LocalDate and a LocalTime
		// LocalDateTime has access to many of the same methods as both LocalDate and LocalTime
		LocalDateTime ldt = LocalDateTime.of(July3, eightFourtyFive);
		System.out.println("ldt = " + ldt);
		
		LocalDateTime ldt2 = LocalDateTime.of(2015,7,3,8,45);
		System.out.println("ldt2 = " + ldt2);

	}

	public static void getZonedDate() {
		
		// A ZonesDateTime stores both date and time, but also time zone 

		
		LocalDateTime ldt = LocalDateTime.of(2015, 7, 3, 8, 45);
		
		// Each ZonedDateTime stores a ZoneId object, this object will keep track of the time zone
		// Below, the time zone we will use is the one for Paris
		ZoneId id = ZoneId.of("Europe/Paris");
		
		// Uncomment out the code below to see all the timezones 
		//System.out.println(ZoneId.getAvailableZoneIds());
		
		
		// There are different overloaded constructors for ZonedDateTime, but this one uses a LocalDateTime
		// and ZoneId to create the object
		ZonedDateTime zdt = ZonedDateTime.of(ldt, id);
		System.out.println("zdt = " + zdt);
		
		// Prints: 2015-07-03T08:45+02:00[Europe/Paris]
		// based on UTC time (Coordinated Universal Time), Greenwich time in UK
		
		// Additionally, can extract parts of the date and create new dates with added time
		// This methods can also be found in the other date classes
		System.out.println("zdt hour = " + zdt.getHour()); // returns hour
		
		
		// when using plus methods, will not actually change the date within the object,
		// but will create a new object with the added time
		ZonedDateTime plusFiveDays = zdt.plusDays(5);
		System.out.println("\nplusFiveDays = " + plusFiveDays); // date will be July 8th
		System.out.println("zdt = " + zdt); 					// date will be July 3rd
		
	}

}