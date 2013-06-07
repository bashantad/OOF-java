import java.util.*;
public class Q65{
   public static void main(String[] args)
   {
      final int num = 12;
      for(int i = 1; i <= num; i++){
         for(int j = 1; j <= num; j++){
            System.out.printf("%4d", i*j);
         }
         System.out.println();
      }
   }
}
