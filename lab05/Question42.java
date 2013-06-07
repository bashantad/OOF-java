import java.util.*;
public class Question42{
   public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter a string variable(red, blue, white or any other): ");
      String strVariable = keyboard.nextLine().toLowerCase();
      switch(strVariable){
         case "red":
            System.out.println("Red Dwarf");
            break;
         case "blue":
            System.out.println("Blue Moon");
            break;
         case "white":
            System.out.println("White Star");
            break;
         default:
            System.out.println("Black Hole");
      }
   }
}
