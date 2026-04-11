package Day4;

public class SwitchAssignement {

	public static void main(String[] args) 
	{
		String weekday="FridaY";
		switch(weekday.toLowerCase())
		{
		case "monday": System.out.println("WeekDayNo :1"); break;
		case "tuesday": System.out.println("WeekDayNo :2"); break;
		case "wednesday": System.out.println("WeekDayNo :3"); break;
		case "thursday": System.out.println("WeekDayNo :4"); break;
		case "friday": System.out.println("WeekDayNo :5"); break;
		case "saturday": System.out.println("WeekDayNo :6"); break;
		case "sunday": System.out.println("WeekDayNo :7"); break;
		default: System.out.println("Invalid Week Number");	
		}
	}

}
