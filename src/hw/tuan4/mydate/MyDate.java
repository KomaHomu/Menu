package hw.tuan4.mydate;

public class MyDate {

    private int year;
    private int month;
    private int day;

    private final String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    private final String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"};
    private final int[] DAY_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public boolean isLeapYear(int year) {

        return (year % 4 == 0) && ((year & 100) != 0);
    }

    public boolean isValidDate(int year, int month, int day) {

        if (year < 1 || year > 9999) {
            return false;
        }

        if (month < 1 || month > 12) {
            return false;
        }

        if (isLeapYear(year) && month == 2) {
            return day <= 29;
        } else {
            return day <= DAY_IN_MONTHS[month - 1];
        }
    }

    public int getDayOfWeek(int year, int month, int day) {

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

    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }

    public void setDate(int year, int month, int day) {
        try {
            if (isValidDate(year, month, day)) {
                this.year = year;
                this.month = month;
                this.day = day;
            } else {
                System.out.println("Invalid year, month or day!");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid year, month or day!");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        try {
            if (year >= 1 && year <= 9999) {
                this.year = year;
            } else {
                System.out.println("Year value is out of range.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid year!");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        try {
            if (month >= 1 && month <= 9999) {
                this.month = month;
            } else {
                System.out.println("Month value is out of range.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid month!");
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        int maxDay;
        try {
            if (isLeapYear(getYear()) && getMonth() == 2) {
                maxDay = 29;
            } else {
                maxDay = DAY_IN_MONTHS[getMonth() - 1];
            }

            if (day >= 1 && day <= maxDay) {
                this.day = day;
            } else {
                System.out.println("Day value is out of range.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid day!");
        }
    }

    public String toString() {

        return DAYS[getDayOfWeek(getYear(), getMonth(), getDay())] + " " + getDay() + " " + MONTHS[getMonth() - 1] + " " + getYear();
    }

    public MyDate nextDay() {
        int maxDay;
        if (isLeapYear(getYear()) && getMonth() == 2) {
            maxDay = 29;
        } else {
            maxDay = DAY_IN_MONTHS[getMonth() - 1];
        }

        int newDay = getDay() + 1;
        if (newDay == maxDay + 1) {
            newDay = 1;
            int newMonth = getMonth() + 1;
            if (newMonth == 12) {
                newMonth = 1;
                int newYear = getYear() + 1;
                if (newYear == 10000) {
                    System.out.println("Year out of range!");
                }
                this.year = newYear;
            }
            this.month = newMonth;
        }
        this.day = newDay;

        return this;
    }

    public MyDate nextMonth() {
        int newMonth = getMonth() + 1;
        if (newMonth == 12) {
            newMonth = 1;
            int newYear = getYear() + 1;
            if (newYear == 10000) {
                System.out.println("Year out of range!");
            }
            this.year = newYear;
        }
        this.month = newMonth;

        return this;
    }

    public MyDate nextYear() {
        int newYear = getYear() + 1;
        if (newYear == 10000) {
            System.out.println("Year out of range!");
        }
        this.year = newYear;

        return this;
    }

    public MyDate previousDay() {
        int maxDay;
        if (isLeapYear(getYear()) && getMonth() - 1 == 2) {
            maxDay = 29;
        } else {
            if (getMonth() == 1) {
                maxDay = 31;
            } else {
                maxDay = DAY_IN_MONTHS[getMonth() - 2];
            }
        }

        int newDay = getDay() - 1;
        if (newDay == 0) {
            newDay = maxDay;
            int newMonth = getMonth() - 1;
            if (newMonth == 0) {
                newMonth = 12;
                int newYear = getYear() - 1;
                if (newYear == 0) {
                    System.out.println("Year out of range!");
                }
                this.year = newYear;
            }
            this.month = newMonth;
        }
        this.day = newDay;

        return this;
    }

    public MyDate previousMonth() {
        int newMonth = getMonth() - 1;
        if (newMonth == 0) {
            newMonth = 12;
            int newYear = getYear() - 1;
            if (newYear == 0) {
                System.out.println("Year out of range!");
            }
            this.year = newYear;
        }
        this.month = newMonth;

        if (getDay() > DAY_IN_MONTHS[newMonth - 1]) {
            this.day = DAY_IN_MONTHS[newMonth - 1];
        }

        return this;
    }

    public MyDate previousYear() {
        int newYear = getYear() - 1;
        if (!isLeapYear(newYear) && getDay() == 29 && getMonth() == 2) {
            this.day = 28;
        }
        if (newYear == 0) {
            System.out.println("Year out of range!");
        }
        this.year = newYear;

        return this;
    }
}
