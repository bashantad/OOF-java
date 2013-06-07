public class MyShapesTester
{
   public static void main(String[] args)
   {
      MyShapes shape = new MyShapes();
      System.out.println(MyShapes.volume(5));
      System.out.println(MyShapes.volume(4.0));
      System.out.println(MyShapes.volume(5, 2, 3));
      System.out.println(MyShapes.volume(5, 4));
   }
}
