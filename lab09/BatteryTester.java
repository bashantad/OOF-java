public class BatteryTester
{
   public static void main(String[] args)
   {
      Battery b1 = new Battery("26 Noorong Avenue, Bundoora", 48);
      System.out.println(b1.getLocation());
      System.out.println(b1.getMonthsOfLife());
      System.out.println(b1.getCurrentAge());
      b1.incrementAge();
      System.out.println(b1.getCurrentAge());
      System.out.println(b1.replaceBattery());
      System.out.println(b1);
      for(int i = 0; i < 58; i++){   
         b1.incrementAge();
      }
      System.out.println(b1.getCurrentAge());
      System.out.println(b1.replaceBattery());
      System.out.println(b1);

   }
}
