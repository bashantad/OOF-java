import java.util.*;
public class Q64{
   public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Please enter a string: ");
      String str = keyboard.nextLine();
      boolean isPalindrome = true;
      for(int i = 0; i < str.length()/2; i++){
         if(str.charAt(i) != str.charAt(str.length()-i-1)){
            isPalindrome = false;
            break;
         }
      }
      if(isPalindrome){
         System.out.printf("%s is palindrome\n",str);
      }else{
         System.out.printf("%s is not palindrome\n",str);
      }
   }
}
