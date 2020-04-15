/*
 Hovhannes Margaryan
 CS/IS 112 - 1251
 12.14.2019
*/
import java.util.Scanner;
public class MonthDays{
        private int month;
        private int year;

                public int getNumberOfDays()
        {
                int number_Of_Days;
                switch (month) {
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                                number_Of_Days = 31;
                                break;
                        case 2:
                                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                                        number_Of_Days = 29;
                                } else {
                                        number_Of_Days = 28;
                                }
                                break;
                        case 4:
                        case 6:
                        case 9:
                        case 11:
                                number_Of_Days = 30;
                                break;
                        default:
                                number_Of_Days = 0;
                }

                return number_Of_Days;
        }

        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                MonthDays Month = new MonthDays();
                int days;
                System.out.println("Enter month(range of 1 through 12) and year:");
                Month.month = in.nextInt();
                Month.year = in.nextInt();
                days = Month.getNumberOfDays();
                System.out.println("Number of days:" + days);
        }

}