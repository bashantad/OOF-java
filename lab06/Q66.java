import java.util.*;
public class Q66{
   public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Please enter an integer value: ");
      int number = keyboard.nextInt();
      int newnumber = (number < 0 )? number * -1: number;
      System.out.printf("\n The absolute value of %d is %d\n",number, newnumber);
   }
}
