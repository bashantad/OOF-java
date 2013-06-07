import java.util.*;
public class Question4{
   public static void main(String[] args){
      String gender;
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter your height in cm: ");
      boolean eligible = false;
      int height = keyboard.nextInt();
      if(height>110){
         System.out.print("Enter your gender(Male/Female): ");
         gender = keyboard.nextLine();
         if(gender.equalsIgnoreCase("female")){
            System.out.print("Are you pregnent(yes/no)? ");
            String isPregnent = keyboard.nextLine();
            if(isPregnent.equalsIgnoreCase("no")){
               eligible = true;
            }
         }else{
            eligible = true;
         }
     }
     if(eligible){
        System.out.println("You are eligible to ride rollercoaster");
     }else{
        System.out.println("You are not eligible to ride on rollercoaster");
     }
   }
}


   
