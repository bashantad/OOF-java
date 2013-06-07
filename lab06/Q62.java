import java.util.*;
public class Q62{
   public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Please enter number of # to be displayed: ");
      int num = keyboard.nextInt();
      for(int i = 0; i < num; i++){
         System.out.print("#");
      }
      System.out.println();
   }
}
