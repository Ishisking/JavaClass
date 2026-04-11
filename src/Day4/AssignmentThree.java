package Day4;

public class AssignmentThree 
{	public static void main(String[] args) 
{
String weekday="MONDAY";	// to be in lowercase but equalsignorecase does the work
		
		if(weekday.equalsIgnoreCase("monday"))
		{
			System.out.println("WeekDayNo: 1");
		} else if(weekday.equalsIgnoreCase("tuesday"))
		{
			System.out.println("WeekDayNo :2");
		} else if(weekday.equalsIgnoreCase("wednesday"))
		{
			System.out.println("WeekDayNo :3");
		} else if(weekday.equalsIgnoreCase("thursday"))
		{
			System.out.println("WeekDayNo :4");
		} else if(weekday.equalsIgnoreCase("friday"))
		{
			System.out.println("WeekDayNo :5");
		} else if(weekday.equalsIgnoreCase("saturday"))
		{
			System.out.println("WeekDayNo :6");
		}  else if(weekday.equalsIgnoreCase("sunday"))
		{
			System.out.println("WeekDayNo :7");
		}
		else
		{
			System.out.println("Invalid weekday");
		}
		
	}

}
