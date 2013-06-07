import java.util.*;
import java.io.*;
public class SolveSudoku
{
   public static void main(String[] args) throws IOException
   {
      Scanner keyboard = new Scanner(System.in);

      System.out.print("Enter Sudoku file: ");
      String filename = keyboard.nextLine();

      SudokuPuzzle puzzle = new SudokuPuzzle(filename);

      puzzle.display();
      if (puzzle.isValidGrid() && !puzzle.isComplete())
      {
         int number;
         do
         {
            System.out.print("Enter number to add [-1 to end]: ");
            number = keyboard.nextInt();
            if (number == -1)
            {
               break;
            }
            System.out.print("Enter row number[1-9]: ");
            int row = keyboard.nextInt();
            System.out.print("Enter column number[1-9]: ");
            int column = keyboard.nextInt();

            if (number > 0 && number < 10 &&
                row > 0 && row < 10 && column > 0 && column < 10)
            {
               if (puzzle.add(number, row - 1, column - 1))
               {
                  puzzle.display();
               }
               else
               {
                  System.out.println("Could not add number");
                  puzzle.display();
               }
            }
            else
            {
               System.out.println("Sorry, invalid entry");
            }
         } while(number != -1 && !puzzle.isComplete());
         if (puzzle.isComplete())
         {
            System.out.println("Well done!");
         }
         System.out.print("Enter file name to save: ");
         keyboard.nextLine(); // consume \n
         String outfilename = keyboard.nextLine();
         PrintStream p = new PrintStream(new File(outfilename));
         puzzle.display(p);
         p.close();
      } 
      else
      {
         if (puzzle.isComplete())
         {
            System.out.println("Well done!");
         }
         else
         {
            System.out.println("That is not a valid Sudoku");
         }
      }
   }
}
