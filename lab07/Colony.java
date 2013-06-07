public class Colony{
   private final int START_PAIRS = 1;
   private int month;
   private int newBornPairs;
   private int oneMonthPairs;
   private int maturePairs;
   public Colony(){
      month = 0;
      newBornPairs = START_PAIRS;
      oneMonthPairs = 0;
      maturePairs = 0;
   }
   public void aheadAMonth()
   {  
      maturePairs += oneMonthPairs;
      int birthPairs = maturePairs;
      oneMonthPairs = newBornPairs;
      newBornPairs = birthPairs;
      newBornPairs = maturePairs;
      month++;
   }
   public int getMonth()
   {
      return month;
   }
   public int getNewBornPairs()
   {
      return newBornPairs;
   }
   public int getOneMonthPairs()
   {
      return oneMonthPairs;
   }
   public int getMaturePairs()
   {
      return maturePairs;
   }
   public int getPopulation()
   {
      return (newBornPairs + maturePairs + oneMonthPairs) * 2;
   }
   public String toString()
   {
      return "Colony[month: " + month + "][pairs: "+ getPopulation()/2 + "][population: " + getPopulation() + "]";
   }
}
