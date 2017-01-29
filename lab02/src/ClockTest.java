//class Clock

public class ClockTest
{
    public static void main(String args[]) throws Exception
    {
        ExtClock clock1 = new ExtClock(6, 30, 0, 2);

        System.out.println(clock1);
        clock1.changeZone(2);
        System.out.println(clock1);
        clock1.changeZone(-3);
        System.out.println(clock1);
        clock1.changeZone(-12);
        System.out.println(clock1);
        clock1.changeZone(0);
        System.out.println(clock1);
        clock1.changeZone(11);
        System.out.println(clock1);
        clock1.changeZone(-10);
        System.out.println(clock1);
        clock1.changeZone(-6);
        System.out.println(clock1);
        clock1.changeZone(2);
        System.out.println(clock1);

        /*Clock clock2 = new ExtClock(0, 9, 0, 0);

        System.out.println(clock2);

        Clock clock3 = new ExtClock(24, 20, 0, 0);

        System.out.println(clock3);*/
    }
}
