import java.util.*;
public class Question41{
   public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter a string variable(red, blue, white or any other): ");
      String strVariable = keyboard.nextLine();
      if(strVariable.equalsIgnoreCase("red")){
         System.out.println("Red Dwarf");
      }else if(strVariable.equalsIgnoreCase("blue")){
         System.out.println("Blue Moon");
      }else if(strVariable.equalsIgnoreCase("white")){
         System.out.println("White Star");
      }else{
         System.out.println("Black Hole");
      }
   }
}
