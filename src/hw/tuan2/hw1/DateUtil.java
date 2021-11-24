package hw.tuan2.hw1;

public class DateUtil {

    private static final String[] strDay = {"Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"};
    private static final String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    private static final int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean isLeapYear(int year) {

        return (year % 4 == 0) && ((year & 100) != 0);
    }

    public static boolean isValidDate(int year, int month, int day) {

        if (year < 1 || year > 9999) {
            return false;
        }

        if (month < 1 || month > 12) {
            return false;
        }

        if (isLeapYear(year) && month == 2) {
            return day <= 29;
        } else {
            return day <= daysInMonth[month - 1];
        }
    }

    public static int getDayOfWeek(int year, int month, int day) {

        int test = year % 400;
        int stE;
        int ndE;
        int rdE;
        int fourthE;
        int dayOfWeek;

        if (test < 100) {
            stE = 6;
        } else if (test < 200) {
            stE = 4;
        } else if (test < 300) {
            stE = 2;
        } else {
            stE = 0;
        }

        ndE = year % 100;

        rdE = ndE / 4;

        switch (month) {
            case 1:
                if (isLeapYear(year)) {
                    fourthE = 6;
                } else {
                    fourthE = 0;
                }
                break;
            case 2:
                if (isLeapYear(year)) {
                    fourthE = 2;
                } else {
                    fourthE = 3;
                }
                break;
            case 3, 11:
                fourthE = 3;
                break;
            case 4, 7:
                fourthE = 6;
                break;
            case 5:
                fourthE = 1;
                break;
            case 6:
                fourthE = 4;
                break;
            case 8:
                fourthE = 2;
                break;
            case 9, 12:
                fourthE = 5;
                break;
            case 10:
                fourthE = 0;
                break;

            default:
                System.out.println("Error.");
                fourthE = -1;
                break;
        }

        dayOfWeek = (stE + ndE + rdE + fourthE + day) % 7;

        return dayOfWeek;
    }

    public static String toString(int year, int month, int day) {

        int dayOfWeek = getDayOfWeek(year, month, day);

        return strDay[dayOfWeek] + " " + day + " " + strMonths[month - 1] + " " + year;
    }

    public void run() {

        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2012));

        System.out.println(isValidDate(2012, 2, 29));
        System.out.println(isValidDate(2011, 2, 29));
        System.out.println(isValidDate(2000, 12, 32));

        System.out.println(toString(2012, 2, 14));
    }
}
