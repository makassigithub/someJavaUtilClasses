package dates;

import java.util.Date;

// The date class encapsulate the current date and time
public class Case_Date {

	public static void main(String...args){
	// date can constructed in 2 differents ways
	   Date date1 = new Date();
	   Date date2 =new Date(1254555444);
	   
	  //Display date1
	 System.out.println("The current date is : "+date1);
	 System.out.println("The specific date is :"+date2);
	 
	 
	 //Compare date using after() and before()
	 System.out.println("\ndate1 is after date2: "+date1.after(date2));
	 System.out.println("date1 is before date2: "+date1.before(date2));
	 
	 // date can be cloned as any other object and print hashcodes
	 System.out.println();
	 Date date3 = (Date) date1.clone();
	 System.out.println("DATES\t\t\t\tHASHCODES");
	 System.out.println(date1+"\t"+date1.hashCode());
	 System.out.println(date2+"\t"+date2.hashCode());
	 System.out.println(date3+"\t"+date3.hashCode());
	 
	 //When date is cloned, the clone contains the same date
	 System.out.println();
	 System.out.println("date1 and date2 point to the same time: "+date1.equals(date3));
	 
	 //get number of milliseconds that has elapsed between a date and January 1, 1970 use getTime
	 System.out.println("Number of millisecond from January 1,1970 to date 1 is: "+date1.getTime());
	
	}	
}
