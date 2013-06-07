import java.util.*;
public class SumAverage{
   public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter first number: ");
      int num1 = keyboard.nextInt();
      System.out.println("Enter second number: ");
      int num2 = keyboard.nextInt();
      int sum = num1+num2;
      double average = (double)sum/2;
      System.out.println("Sum of "+ num1 + " and " + num2 + " is "+sum);
      System.out.println("Average of " + num1 + " and " + num2+ " is " +average);
   }
}

