import java.util.*;
public class PhysicsCalc
{
   public static void main (String [] args)
   {
      double time =3.0;
      double initialVelocity=4.5;
      double acceleration=9.5;
      double finalVelocity=0;
      double displacement=0;


      //equation 1
      //add code
      //

      displacement= (initialVelocity*time);
      System.out.println("Equation 1: " + displacement);
      //equation 1 
      //
      displacement=(initialVelocity*time + 0.5*acceleration*Math.pow(time,2.0));
      System.out.println("Equation 2 " + displacement);
      // equation 2
      //
      finalVelocity= initialVelocity + acceleration*time;
      System.out.println("Equqation 3 " + finalVelocity);


      //
      //
      finalVelocity = Math.sqrt (Math.pow(initialVelocity, 2.0 ) + 2*acceleration*displacement);
      System.out.println("Equation 4" + finalVelocity);


   }
}


