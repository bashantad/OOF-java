import java.util.*;
public class Replace{
   public static void main(String[] args){
      String toBeReplaced = "purple pot";
      String newString = toBeReplaced.replace("p","t");
      System.out.println(newString);
      System.out.println(newString.replace("t","p"));
   }
}
