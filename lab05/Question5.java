import java.util.*;
public class Question5{
   public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter an integer variable: ");
      int key = keyboard.nextInt();
      if(key % 4 == 0){
         System.out.println("Even again");
      }else if(key % 2 == 0){
         System.out.println("Even only");
      }else if(key < 0){
         System.out.println("Negatively odd");
      }else{
         System.out.println("Positively odd");
      }
   }
}
