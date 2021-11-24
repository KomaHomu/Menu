package hw.tuan4.mytime;

public class MyTime {

    private int hour;
    private int minute;
    private int second;

    public MyTime() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    public MyTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        try {
            if (hour < 0 || hour > 24) {
                System.out.println("Value(s) is out of range.");
                return;
            }

            if (minute < 0 || minute > 59) {
                System.out.println("Value(s) is out of range.");
                return;
            }

            if (second < 0 || second > 59) {
                System.out.println("Value(s) is out of range.");
                return;
            }

            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid hour, minute, or second!");
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        try {
            if (hour >= 0 && hour <= 23) {
                this.hour = hour;
            } else {
                System.out.println("Hour value is out of range.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid hour!");
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        try {
            if (minute >= 0 && minute <= 59) {
                this.minute = minute;
            } else {
                System.out.println("Minute value is out of range.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid minute!");
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        try {
            if (second >= 0 && second <= 59) {
                this.second = second;
            } else {
                System.out.println("Second value is out of range.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid second!");
        }
    }

    public String toString() {
        String hourString;
        String minuteString;
        String secondString;

        if (getHour() < 10) {
            hourString = "0" + hour;
        } else {
            hourString = Integer.toString(hour);
        }
        if (getMinute() < 10) {
            minuteString = "0" + minute;
        } else {
            minuteString = Integer.toString(minute);
        }
        if (getSecond() < 10) {
            secondString = "0" + second;
        } else {
            secondString = Integer.toString(second);
        }

        return (hourString + ":" + minuteString + ":" + secondString);
    }

    public MyTime nextSecond() {
        int newSecond = getSecond() + 1;
        if (newSecond == 60) {
            newSecond = 0;
            int newMinute = getMinute() + 1;
            if (newMinute == 60) {
                newMinute = 0;
                int newHour = getHour() + 1;
                if (newHour == 24) {
                    newHour = 0;
                }
                this.hour = newHour;
            }
            this.minute = newMinute;
        }
        this.second = newSecond;

        return this;
    }

    public MyTime nextMinute() {
        int newMinute = getMinute() + 1;
        if (newMinute == 60) {
            newMinute = 0;
            int newHour = getHour() + 1;
            if (newHour == 24) {
                newHour = 0;
            }
            this.hour = newHour;
        }
        this.minute = newMinute;

        return this;
    }

    public MyTime nextHour() {
        int newHour = getHour() + 1;
        if (newHour == 24) {
            newHour = 0;
        }
        this.hour = newHour;

        return this;
    }

    public MyTime previousSecond() {
        int newSecond = getSecond() - 1;
        if (newSecond == -1) {
            newSecond = 59;
            int newMinute = getMinute() - 1;
            if (newMinute == -1) {
                newMinute = 59;
                int newHour = getHour() - 1;
                if (newHour == -1) {
                    newHour = 23;
                }
                this.hour = newHour;
            }
            this.minute = newMinute;
        }
        this.second = newSecond;

        return this;
    }

    public MyTime previousMinute() {
        int newMinute = getMinute() - 1;
        if (newMinute == -1) {
            newMinute = 59;
            int newHour = getHour() - 1;
            if (newHour == -1) {
                newHour = 23;
            }
            this.hour = newHour;
        }
        this.minute = newMinute;

        return this;
    }

    public MyTime previousHour() {
        int newHour = getHour() - 1;
        if (newHour == -1) {
            newHour = 23;
        }
        this.hour = newHour;

        return this;
    }
}
