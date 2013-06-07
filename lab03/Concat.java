import java.util.*;
public class Concat{
   public static void main(String[] args){
      String str1 = "Cup";
      String str2 = "Of";
      String str3 = "java";
      String conc;
      //using concat method
      //String concatenatedString= "".concat(str1).concat(str2).concat(str3);
      //System.out.println(concatenatedString);
      conc = str1 +" " + str2+" " + str3;
      System.out.println("Concatenated String is : "+conc);
      System.out.println("Length of "+ str1+ " is "+str1.length());
    
      System.out.println("Length of "+ str2+ " is "+str2.length());
      System.out.println("Length of "+ str3+ " is "+str3.length());
      System.out.println("Length of "+ conc+ " is "+conc.length());



   }
}
