
	/*
   * This program is used to display the two date difference and turns there difference in to number of days.
   * Assume that the user follow this format MM/dd/YYYY
   *@Hiwot 
   */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class numberOfDays {

    public static void main(String[] args) throws ParseException {
    	long difference=0;
    	long numberOfDays=0;
        Scanner scan=new Scanner(System.in);   
        
        /*Used date and date Format from java utility package to get the current system date and there format*/
        DateFormat df=new SimpleDateFormat("MM/dd/yyyy");
        Date date =new Date();
        System.out.printf("Current Date"+ date);
        //Used to accept the date of birth from the user and prompt this message and accept the date of birth 
        System.out.println("\nEnter Your Date of birth :MM/dd/yyyy ");
        String dateOfBirths=scan.nextLine();
        //change the current date into date format 
        String today = df.format(date);
        //and parse to date using date format 
        Date dateB=df.parse(dateOfBirths);
        Date dateC=df.parse(today);
        //Calculate the difference of the current date and the date of birth
        difference=dateC.getTime()-dateB.getTime();
        //Calculate the the number of days between them by difference divide to the milliseconds. 
        numberOfDays=difference/86400000;
        //Used Math.abs to get absoulate value of the number of days 
        System.out.println("Number of days between  "+
                Math.abs(numberOfDays));

    }

}
