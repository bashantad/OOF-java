import java.util.*;
public class Question7{
   public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter number of # to be displayed: ");
      int count = 0;
      int iteration = keyboard.nextInt();
      do{
         System.out.print("#");
         count++;
      }while(count < iteration);
      System.out.println();
   }
}
