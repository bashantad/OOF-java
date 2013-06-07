import java.util.Scanner;
import java.io.*;

public class EmployeeModify{
   public static void main(String[] args) throws IOException {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter the name of the file: ");
      String fileName = keyboard.nextLine();
      File txtFile = new File(fileName);
      Scanner file = new Scanner(txtFile);
      String name = file.nextLine();
      double hours = file.nextDouble();
      double rate = file.nextDouble();
      double totalSales = file.nextDouble();
      System.out.println("Name: " + name);
      System.out.println("Hours: " + hours);
      System.out.println("Rate: " + rate);
      System.out.println("Total Sales: " + totalSales);
      double bonus = 0;
      if(200*hours < totalSales){
         bonus = (totalSales - 200*hours) * 0.1;
      }
      double pay = rate * hours + bonus;
      System.out.println("Total Pay is: " + pay);
   }
}
