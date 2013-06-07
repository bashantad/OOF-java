import java.util.*;
public class NumberRolls{
   public static void main(String[] args){
      int numberOfComputers;
      double cableLength;
      double rollLength;
      double computersPerRoll;
      double numberOfRolls;
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter number of Computers to be secured: ");
      numberOfComputers = keyboard.nextInt();
      System.out.println("Enter cable length required for computer: ");
      cableLength = keyboard.nextDouble();
      System.out.println("Enter Length of Roll: ");
      rollLength = keyboard.nextDouble();
      computersPerRoll = Math.floor(rollLength/cableLength);
      numberOfRolls = Math.ceil(numberOfComputers/computersPerRoll);
      System.out.println("Computers per roll: "+computersPerRoll);
      System.out.println("Number of Rolls required: "+numberOfRolls);
   }
}
