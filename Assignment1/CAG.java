import java.util.*;
public class CAG{
	public static void main(String[] args){
		double p = 1.2;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter take off weight (kgs): ");
		double w = keyboard.nextDouble();
		keyboard.nextLine();
		System.out.print("Enter aircraft name: ");
		String name = keyboard.nextLine();
		System.out.print("Enter surface area (sq m): ");
		double s = keyboard.nextDouble();
		System.out.print("Enter lift coefficient: ");
		double cl = keyboard.nextDouble();
		double L = w * 9.8;
		//formula is v = sqrt(2L/(p s cl))
		double v = Math.sqrt(2 * L /(p * s * cl));
		System.out.println("Aircraft: " + name + " requires a take off speed of " + v + " metres/sec");
	}
}
