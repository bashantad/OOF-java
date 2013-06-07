import java.util.*;
import java.io.*;
public class SudokuPuzzle
{
   private int[][] grid;
   public SudokuPuzzle()
   {
      this.grid = new int[9][9];
   }
   public SudokuPuzzle(String fileName) throws IOException
   {
      File filePtr = new File(fileName);
      Scanner file = new Scanner(filePtr);
      this.grid = new int[9][9];
      for(int i = 0; i < 9; i++)
      {
         for(int j = 0; j < 9; j++)
         {
            this.grid[i][j] = file.nextInt();
         }
      }
   }
   public void display(PrintStream obj)
   {
      for(int i = 0; i < 9; i++)
      {
         for(int j = 0; j < 9; j++)
         {
            obj.print(this.grid[i][j] + " ");
         }
         obj.println();
      }
   }
   public void display()
   {
      for(int i = 0; i < 9; i++)
      {
         for(int j = 0; j < 9; j++)
         {
            System.out.print((this.grid[i][j] == 0 ? "_" : this.grid[i][j]) + " ");
         }
         System.out.println();
      }
   }
   private int countNumberInRow(int number, int rowIndex)
   {
      int count = 0;
      for(int i = 0; i < 9; i++)
      {
         if(this.grid[rowIndex][i] == number)
         {
            count++;
         }
      }
      return count;
   }
   private int countNumberInColumn(int number, int columnIndex)
   {
      int count = 0;
      for(int i = 0; i < 9 ; i++)
      {
         if(this.grid[i][columnIndex] == number)
         {
            count++;
         }
      }
      return count;
   }
   private int countNumberInBox(int number, int rowIndex, int columnIndex)
   {
      int count = 0;
      int baseRow = rowIndex / 3 * 3;
      int baseCol = columnIndex / 3 * 3;

      for(int i = baseRow; i < baseRow + 3; i++)
      {
         for(int j = baseCol; j < baseCol + 3; j++)
         {
            if(this.grid[i][j] == number)
            {
               ++count;
            }
         }
      }
      return count;
   }
   private boolean isValidRow(int rowIndex)
   {
      for(int i = 0; i < 9; i++)
      {
         if(this.grid[rowIndex][i] != 0 && countNumberInRow(grid[rowIndex][i], rowIndex) > 1)
         {
            return false;
         }
      }
      return false;
   }
   private boolean isValidColumn(int columnIndex)
   {
      for(int i = 0; i < 9; i++)
      {
         if(this.grid[i][columnIndex] != 0 && countNumberInRow(grid[i][columnIndex], columnIndex) > 1)
         {
            return false;
         }
      }
      return true;
   }
   private boolean isValidBox(int rowIndex, int columnIndex)
   {
      for(int i = rowIndex/3; i < (rowIndex + 3); i++)
      {
         for(int j = columnIndex/3; j < (columnIndex + 3); j++)
         {
            if(grid[i][j] != 0 && countNumberInBox(grid[i][j], rowIndex, columnIndex) > 1)
            {
               return false;
            }
         }
      }
      return true;
   }
   public boolean isValidGrid()
   {
      boolean isValid = true;
      for(int i = 0; (i < 9); i++)
      {
         for(int j = 0; j < 9; j++)
         {
            if(i == j)
            {
               System.out.println("Valid row: " +isValidRow(i));
               System.out.println("Valid column: " +isValidColumn(i));
               isValid = (isValidRow(i) && isValidRow(i));
            }
            if(i % 3 == 0 || j % 3 == 0)
            {
               System.out.println("Vlaid box: " + isValidBox(i, j));
               isValid = isValidBox(i, j);
            }
         }
      }
      return isValid;
   }
   public boolean add(int number, int rowIndex, int columnIndex)
   {
      return (number >= 1 && number <= 9 && rowIndex >= 0 && rowIndex <= 8 && columnIndex >=0 && columnIndex <= 8
             && countNumberInRow(number, rowIndex) == 0 && countNumberInColumn(number, columnIndex) == 0 
             && countNumberInBox(number, rowIndex, columnIndex) == 0);
   }
   public boolean isComplete()
   {
      for(int i = 0; i < 9; i++)
      {
         for(int j = 0; j < 9; j++)
         {
            if(this.grid[i][j] == 0)
            {
               return false;
            }
         }
      }
      return true;
   }  
}
