public class Quadratic
{
   private int A;
   private int B;
   private int C;
   public Quadratic(int a, int b, int c)
   {
      A = a;
      B = b;
      C = c;
   }
   public String toString()
   {
      return "Quadratic[" + getRoot1() + "][" + getRoot2() + "]";
   }
   private boolean hasRealRoots()
   {
      return (getInner() >= 0);
   }
   public String getRoot1()
   {  
      double root1 = (-B + Math.sqrt(getInner()))/(2 * A);
      return "root1: " + root1;
   }
   public String getRoot2()
   {
      double root2 = (-B - Math.sqrt(getInner()))/(2 * A);
      return "root2: " + root2;
   }
   private int getInner()
   {
      return B * B - 4 * A * C;
   }
}
