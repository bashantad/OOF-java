import java.util.*;
public class Question8{
   public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter a student's final mark 0 and 100: ");
      int marks = keyboard.nextInt();
      if(marks >= 0 && marks <= 100){
         switch(marks/10){
            case 8:
            case 9:
            case 10:
               System.out.println("A");
               break;
            case 7:
               System.out.println("B");
               break;
            case 6:
               System.out.println("C");
               break;
            case 5:
               System.out.println("C");
               break;
            default:
               System.out.println("F");
               break;
         }
      }else{
         System.out.println("Please enter marks between 0 to 100");
      }
   }
}
