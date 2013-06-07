import java.util.*;
public class Task2PC05{
   public static void main(String[] args){
      String name = "Suzie";
      String sport = "squash";
      char grade = 'B';
      int age = 22;
      double courtHire = 19.80;
      System.out.printf("%s plays %s.\n\n", name, sport);
      System.out.printf("%d year old %s playes %c grade %s\n\n", age, name, grade, sport);
      System.out.printf("Court hire is %.6f. %s must pay %.6f to play\n", courtHire, name, courtHire);
   }
}
