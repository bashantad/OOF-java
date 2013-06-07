import java.util.*;
public class Q63{
   public static void main(String[] args){
      final int BALANCE = 10000;
      final double RATE = 0.05;
      final int YEAR = 20;
      double runningBalance = BALANCE;
      for(int i = 1; i <= YEAR; i++){
         runningBalance += runningBalance * RATE;
         System.out.printf("Running Balance at year %d is %.2f\n", i, runningBalance);
      }
   }
}
