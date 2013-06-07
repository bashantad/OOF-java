import java.util.*;
public class TicketMachine{
   public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);
      int noAdult = 0, noFamily = 0, noChild = 0;
      String selection;
      do{
         System.out.print("Ticket menu:\nA - Adult ticket\nC - Child ticket\nF - Family ticket\nQ - Quit\nSelection is: ");
         selection = keyboard.next().toLowerCase();
         switch(selection){
            case "a":
               noAdult++;
               break;
            case "f":
               noFamily++;
               break;
            case "q":
               break;
            case "c":
               noChild++;
               break;
            default:
               System.out.println("Please enter valid character");
         }
         System.out.printf("%d adult tickets, %d child tickets, %d family tickets ", noAdult, noChild, noFamily);
      }while(!selection.equals("q"));
      System.out.printf("\n\nReceipt:\n");
      System.out.println("-----------------------");
      System.out.printf("%d adult tickets %d child tickets %d family tickets\n", noAdult, noChild, noFamily);
      System.out.println("----------------------");
      int totalCost = noFamily * 26 + noChild * 5 + noAdult * 10;
      System.out.println("Total: $"+totalCost);
   }
}
