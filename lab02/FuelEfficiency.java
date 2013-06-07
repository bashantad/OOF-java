import java.util.*;
public class FuelEfficiency
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("How many litres does your fuel tank hold?");
      double tankSize = keyboard.nextDouble();
      System.out.print("How many kilometers do you travel on one fuel tank?");
      double kilometres = keyboard.nextDouble();
       System.out.print("How much do you pay per litre for fuel?");
       double pricePerLitre = keyboard.nextDouble();
      double litresPer100Km;
      double costPerKilometer;
      litresPer100Km = tankSize/kilometres * 100;
      costPerKilometer = litresPer100Km * pricePerLitre/100;
      System.out.println("Litres per 100km =" + litresPer100Km);
      System.out.println("It costs you $" + costPerKilometer + "for each kilometer you drive.");
   }
}
