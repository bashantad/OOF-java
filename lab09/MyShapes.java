import java.util.*;
public class MyShapes
{
   public static int volume(int side)
   {
      return side * side * side;
   }
   public static double volume(double r)
   {
      return 4/3 * (Math.PI) * (Math.pow(r, 3));
   }
   public static double volume(double length, double width, double height)
   {
      return length * height * width;
   }
   public static double volume(double radius, double height)
   {
      return Math.PI * Math.pow(radius, 2) * height;
   }
}
