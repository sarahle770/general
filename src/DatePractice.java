import java.util.Calendar;

/**
 * This file is a part of Exerecising project.
 *
 * @author Sarah Cynamon
 * @version 1.0.0
 */
public class DatePractice {

    public static void main(String[] args) {
        int year = 2020;
        int month = 10; // November
        int date = 1;

        Calendar cal = Calendar.getInstance ();
        // Sets the given calendar field value and the time value
        // (millisecond offset from the Epoch) of this Calendar undefined.
        System.out.println ();
        cal.set (Calendar.YEAR, year);
        cal.set (Calendar.MONTH, month);
        cal.set (Calendar.DATE, date);

        System.out.println (cal.getTime ());
        System.out.println ();
    }
}

