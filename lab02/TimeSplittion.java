import java.util.*;
public class TimeSplittion
{
   public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter number of seconds to calculate number of hours, mins and second: ");
      int numSec = keyboard.nextInt();
      int hour;
      int min;
      int sec;
      hour = numSec/(60*60);
      numSec = numSec%(60*60);
      min = numSec/60;
      sec = numSec%60;
      System.out.println("Time in hour, min and second format =>"+ hour + " : "+ min + " : " + sec);
   }
}

