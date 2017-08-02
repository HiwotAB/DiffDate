
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class numberOfDays {

    public static void main(String[] args) throws ParseException {

        Scanner scan=new Scanner(System.in);        

        DateFormat df=new SimpleDateFormat("MMddyyyy");
        Date date =new Date();

        System.out.printf("Current Date"+ date);
        System.out.println("\nEnter Your Date of birth :MMddyyyy ");
        String dateOfBirths=scan.nextLine();
        String today = df.format(date);

        Date dateB=df.parse(dateOfBirths);
        Date dateC=df.parse(today);
        long difference=dateC.getTime()-dateB.getTime();
        long numberOfDays=difference/86400000;
        System.out.println("Number of days between  "+
                Math.abs(numberOfDays));

    }

}
