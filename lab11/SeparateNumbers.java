import java.util.*;
import java.io.*;
public class SeparateNumbers
{
   public static void main(String[] args) throws IOException
   {
      if(args.length != 3)
      {
         System.out.println("Requires 3 file arguments");
      }
      else
      {
         File file = new File(args[0]);
         Scanner myFile = new Scanner(file);
         PrintStream positiveNumbers = new PrintStream(new File(args[1]));
         PrintStream negativeNumbers = new PrintStream(new File(args[2]));
         while(myFile.hasNext())
         {
            int number = myFile.nextInt();
            if(number > 0)
            {
               positiveNumbers.println(number);
            }
            else if(number < 0)
            {
               negativeNumbers.println(number);
            }
         }
         myFile.close();
         positiveNumbers.close();
         negativeNumbers.close();
      }
   }
}
