import java.util.*;
public class ZooTickets{
   public static void main(String[] args){
      int noAdults, noChilds, noFamilyTickets, noChildTickets, noAdultTickets, totalCost;
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter number of adults: ");
      noAdults = keyboard.nextInt();
      System.out.print("Enter number of childrens: ");
      noChilds = keyboard.nextInt();
      //if(noAdults>=2 && noChilds>=2){
         if(noAdults>noChilds){
            noFamilyTickets = noChilds/2;            
         }else{
            noFamilyTickets = noAdults/2;
         }
         noAdultTickets = noAdults - noFamilyTickets * 2;
         noChildTickets = noChilds - noFamilyTickets * 2;
      /*}else{
         noFamilyTickets = 0;
         noChildTickets = noChilds;
         noAdultTickets = noAdults;
      }*/
      totalCost = noFamilyTickets * 26 + noChildTickets * 5 + noAdultTickets *10;
      if(noFamilyTickets>0){
         System.out.println("The number of family tickets : " + noFamilyTickets);
      }
      if(noChildTickets>0){
         System.out.println("The number of Children Tickets : " + noChildTickets);
      }
      if(noAdultTickets>0){
         System.out.println("The number of Adult Tickets : " + noAdultTickets);
      }
      System.out.println("Total Cost for above data is : "+totalCost);
   }
}
