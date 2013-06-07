public class BoundedCounter
{
   final int MAXMUM = 999;
   int counter;
   public BoundedCounter(){
      counter = 0;
   }
   public void next(){
      if(counter < MAXMUM){
         counter++;
      }
   }
   public void reset(){
      counter = 0;   
   }
   public int getCounter(){
      return counter;
   }
   public String toString(){
      return "BoundedCounter[counter: " + counter + "]";      
   }
}
