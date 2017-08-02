
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class numberOfDays {

    public static void main(String[] args) throws ParseException {

        Scanner scan=new Scanner(System.in);
        

        DateFormat df=new SimpleDateFormat("MM/dd//yyyy");
        Date date =new Date();

        System.out.printf("Current Date"+ date);
        System.out.println("Enter Your Date of birth :\"MM/dd//yyyy\" ");
        String dateOfBirths=scan.nextLine();
        String today = df.format(date);

        Date dateB=df.parse(dateOfBirths);
        Date dateC=df.parse(today);
        long difference=dateC.getTime()-dateB.getTime();
        long numberOfDays=difference/86400000;
        System.out.printf("Number of days between date %s and %s is : %d %n",
                Math.abs(numberOfDays));

    }

}
