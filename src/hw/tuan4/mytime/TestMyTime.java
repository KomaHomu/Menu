package hw.tuan4.mytime;

public class TestMyTime {

    public static void main(String[] args) {

        MyTime time1 = new MyTime();
        MyTime time2 = new MyTime(20, 16, 54);
        MyTime time3 = new MyTime(25, 61, 60); //error

        System.out.println(time1);
        System.out.println(time1.previousSecond());
        System.out.println(time1.nextSecond());
        System.out.println(time1.previousMinute());
        System.out.println(time1.nextMinute());
        System.out.println(time1.previousHour());
        System.out.println(time1.nextHour());

        time2.setHour(1);
        time2.setMinute(2);
        time2.setSecond(3);
        System.out.println(time2);
    }
}
