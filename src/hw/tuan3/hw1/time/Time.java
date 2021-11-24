package hw.tuan3.hw1.time;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {

        if (second == -1) {
            minute -= 1;
            second = 59;
        }
        if (minute == -1) {
            hour -= 1;
            minute = 59;
        }
        if (hour == -1) {
            hour = 23;
        }

        minute += second / 60;
        this.second = second % 60;
        hour += minute / 60;
        this.minute = minute % 60;
        if (hour == 24) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {

        if (second == -1) {
            minute -= 1;
            second = 59;
        }
        if (minute == -1) {
            hour -= 1;
            minute = 59;
        }
        if (hour == -1) {
            hour = 23;
        }

        minute += second / 60;
        this.second = second % 60;
        hour += minute / 60;
        this.minute = minute % 60;
        if (hour == 24) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }
    }

    public String toString() {
        String hh = Integer.toString(getHour());
        String mm = Integer.toString(getMinute());
        String ss = Integer.toString(getSecond());

        if (hh.length() == 1) {
            hh = "0" + hh;
        }

        if (mm.length() == 1) {
            mm = "0" + mm;
        }

        if (ss.length() == 1) {
            ss = "0" + ss;
        }

        return hh + ":" + mm + ":" + ss;
    }

    public Time nextSecond() {

        setTime(getHour(), getMinute(), getSecond() + 1);

        return this;
    }

    public Time previousSecond() {

        setTime(getHour(), getMinute(), getSecond() - 1);

        return this;
    }

}
