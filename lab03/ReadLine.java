import java.util.*;
public class ReadLine{
   public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter a line of string: ");
      String inputLine = keyboard.nextLine();
      System.out.println("The entered string is : "+inputLine);
   }
}
