import java.util.*;
public class AustralianElection{
   public static void main(String[] args){
      int numberLiberal = 5874104;
      int numberLabor = 6545759;
      int totalVotes = numberLiberal + numberLabor;
      double percentLiberal = (double)numberLiberal/totalVotes * 100;
      double percentLabor = (double)numberLabor/totalVotes * 100;
      System.out.println("The total number of formal votes: " + totalVotes);
     
      System.out.println(percentLiberal + "% is the  percentage of Liberal/National Coalition");
      System.out.println(percentLabor+"% is the percentage of Labor Party");
   }
}
