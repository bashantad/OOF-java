import java.util.*;
public class Q64b{
   public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Please enter a string: ");
      String str = keyboard.nextLine().toUpperCase();
      for(int i = 0; i < str.length()-1; i++){
         if((int)str.charAt(i) <65 || (int)str.charAt(i) > 90){
            System.out.println(str.charAt(i));
            str = str.replace(""+str.charAt(i),""); 
         }
      }
      System.out.println(str);
      int length = str.length();
      boolean isPalindrome = true;
      for(int i = 0; i < length/2; i++){
         if(str.charAt(i) != str.charAt(length-i-1)){
            isPalindrome = false;
         }
      }
      if(isPalindrome){
         System.out.printf("%s is palindrome\n",str);
      }else{
         System.out.printf("%s is not palindrome\n",str);
      }
   }
}
