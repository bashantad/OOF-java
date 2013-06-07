public class Rabbits
{
   public static void main(String[] args)
   {
      final int START_PAIRS = 1;

      int month = 0;
      int newBornPairs = START_PAIRS;
      int oneMonthPairs = 0;
      int maturePairs = 0;

      while (month < 12)
      {
         maturePairs += oneMonthPairs;
         int birthPairs = maturePairs;
         oneMonthPairs = newBornPairs;
         newBornPairs = birthPairs;
         month++;
         System.out.println("month: " + month + " pairs:" +
                           (newBornPairs+oneMonthPairs + maturePairs));
      }
      int pop12months = (newBornPairs + oneMonthPairs + maturePairs) * 2;
      System.out.println("Population after 12 months: " + pop12months);
      System.out.println();

      month = 0;
      newBornPairs = START_PAIRS;
      oneMonthPairs = 0;
      maturePairs = 0;

      int pairs = START_PAIRS;
      while(pairs < 500000)
      {
         maturePairs += oneMonthPairs;
         int birthPairs = maturePairs;
         oneMonthPairs = newBornPairs;
         newBornPairs = birthPairs;
         pairs = newBornPairs + oneMonthPairs + maturePairs;
         month++;
         System.out.println("month: " + month + " pairs: " +
                           (newBornPairs + oneMonthPairs + maturePairs));
      }
      System.out.println("1 million: " + month + " Months");
   }
}
