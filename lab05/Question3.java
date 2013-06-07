import java.util.*;
public class Question3{
   public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter any integer number: ");
      int number = keyboard.nextInt();
      if(number < 0){
         System.out.printf("%d is negative number\n", number);
      }else if(number >=0 && number <= 100){
         System.out.printf("%d lies between 0 to 100 inclusive\n", number);
      }else{
         System.out.printf("%d is greater than 100\n", number);
      }
   }
}
