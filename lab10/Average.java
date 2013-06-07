import java.util.*;
public class Average
{
   public static double calculateAverage(int[] data)
   {
      float average = 0;
      for(int i = 0; i < data.length; i++){
         average += data[i];
      }
      return average/data.length;
   }
   public static int totalBelowAverage(int[] data, double average)
   {
      int count = 0;
      for(int i = 0; i < data.length; i++)
      {
         if(average < data[i]){
            count++;
         }
      }
      return count;
   }
   public static int totalAboveAverage(int[] data, double average)
   {
      int count = 0;
      for(int i = 0; i < data.length; i++)
      {
         if(average > data[i]){
            count++;
         }
      }
      return count;

   }
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int[] numbers = new int[10];
      int arrayLength;
      System.out.println("Please enter 10 integers: ");
      for(int i = 0; i < 10; i++)
      {
         numbers[i] = keyboard.nextInt();
      }
      double average = calculateAverage(numbers);
      System.out.println("Average: " + average);
      System.out.println("Above average: " + totalBelowAverage(numbers, average));
      System.out.println("Below Average: " + totalAboveAverage(numbers, average));
   }
}
