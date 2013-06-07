import java.util.*;
public class SellPetrol{
   public static void main(String[] args){
      System.out.print("Enter the litres of Petrol (a whole number): ");
      Scanner keyboard = new Scanner(System.in);
      int noLitres = keyboard.nextInt();
      double sum = 0;
      int i = 0;
      do{
         System.out.printf("Litre %d: $%s\n",i,sum);
         sum += 1.75;
         i++;
      }while(i != noLitres);
   }
}
