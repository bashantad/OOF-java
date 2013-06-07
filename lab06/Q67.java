import java.util.*;
public class Q67{
   public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);
      System.out.print("How big is the box? ");
      int number = keyboard.nextInt();
      for(int i = 1; i <= number; i++){
         for(int j = 1; j <= number; j++){
            if(i == 1 || j == 1 || i == number || j == number){
               System.out.print("*");
            }else{
               System.out.print(" ");
            }
         }
         System.out.println();
      }
   }
}
