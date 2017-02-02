//class Clock

public class ClockTest
{
   public static void main(String args[]) throws Exception
   {
      ExtClock clock1 = new ExtClock(6, 30, 0, 2);
      ExtClock clock2 = new ExtClock(6, 30, 0, 3);
      Clock clock3 = new Clock(6, 30, 0);

      System.out.println(clock1.equals(clock2));

      clock1.makeCopy(clock2);

      System.out.println(clock1.equals(clock2));
   }
}
