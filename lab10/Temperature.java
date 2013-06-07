import java.util.*;
public class Temperature
{
   public static double calculateAverage(double[] data)
   {
      double average = 0;
      for(int i = 0; i < data.length; i++){
         average += data[i];
      }
      return average/data.length;
   }
   public static double calculateLowest(double[] data)
   {
      double min = data[0];
      for(int i = 1; i < data.length; i++)
      {
         if(min > data[i]){
            min = data[i];
         }
      }
      return min;
   }
   public static double calculateHighest(double[] data)
   {
      double max = data[0];
      for(int i = 1; i < data.length; i++)
      {
         if(max < data[i]){
            max = data[i];
         }
      }
      return max;

   }
   public static void differenceFromAverage(double[] data, double average)
   {
      double diff;
      for(int i = 0; i < data.length; i++)
      {
         diff = data[i] - average; 
         if(diff < 0){
            diff = -diff;
            System.out.println(data[i] + " Below average: " + diff);
         }else{
            System.out.println(data[i] + " Above average: " + diff);
         }
      }
   }
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Please enter number of hours: ");
      int numhours = keyboard.nextInt();
      double[] numbers = new double[numhours];
      System.out.println("Please enter temperature for each hours: ");
      for(int i = 0; i < numhours; i++)
      {
         numbers[i] = keyboard.nextInt();
      }
      double average = calculateAverage(numbers);
      System.out.println("Average: " + average);
      System.out.println("Lowest: " + calculateLowest(numbers));
      System.out.println("Highest: " + calculateHighest(numbers));
      System.out.println("Deviation from average");
      differenceFromAverage(numbers, average);
   }
}
