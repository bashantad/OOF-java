import java.util.*;
public class SellPrice{
	public static void main(String[] args){
		System.out.print("Enter integer product id: ");
		Scanner keyboard = new Scanner(System.in);
		int productId = keyboard.nextInt();
		keyboard.nextLine();
		System.out.print("Enter product description: ");
		String productDesc = keyboard.nextLine();
		System.out.print("Enter cost price: ");
		double costPrice = keyboard.nextDouble();
		System.out.print("Enter integer markup percentage: ");
		int markupPercentage = keyboard.nextInt();
		double sellPrice = costPrice + costPrice * markupPercentage / 100;
		System.out.println("The selling price of " + productDesc + " is $" + sellPrice);
	}
}
