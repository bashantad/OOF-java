import java.util.*;
public class TwoWords{
	public static void main(String[] args){
		System.out.print("Enter 2 words, separated by a space: ");
		Scanner keyboard = new Scanner(System.in);
		String twoWords = keyboard.nextLine().trim();
		boolean isTwoWords=false;
		String secondWord;
		if(twoWords.length() !=0 ){
			int index = twoWords.indexOf(" ");
			if(index != -1){
				//Program assumes everything after first word is second word 
				secondWord = twoWords.substring(index).trim();
				isTwoWords = true;
				System.out.println("The second word is '" + secondWord + "' and it has " + secondWord.length() + " characters");
			}			
		}
		if(!isTwoWords){
			System.out.println("Please enter 2 words, separated by a space, on the same line");
			System.out.println("Please restart the program and try again");
		}
	}
}
