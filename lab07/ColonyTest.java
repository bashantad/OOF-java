public class ColonyTest
{
   public static void main(String[] args)
   {
      Colony myColony = new Colony();
      for(int i = 0; i < 12; i++)
      {
         myColony.aheadAMonth();
         System.out.println(myColony);
      }
      display(myColony.getNewBornPairs());
      display(myColony.getMonth());
      display(myColony.getOneMonthPairs());
      display(myColony.getMaturePairs());
      display(myColony.getPopulation());
      System.out.println(myColony.toString());
   }
   public static void display(int val){
      System.out.println(val);
   }
}
