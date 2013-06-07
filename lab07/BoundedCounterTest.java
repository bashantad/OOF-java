public class BoundedCounterTest
{
   public static void main(String[] args)
   {
      // Test1: Create a new counter and display it
      System.out.println("Test1");
      BoundedCounter myCounter = new BoundedCounter();
      System.out.println(myCounter);

      // Test2: Send the next message to the counter a few times
      //        and display the counter each time

      System.out.println("Test2");
      myCounter.next();
      System.out.println(myCounter);
      myCounter.next();
      System.out.println(myCounter);
      myCounter.next();
      System.out.println(myCounter);
      myCounter.next();
      System.out.println(myCounter);
      myCounter.next();
      System.out.println(myCounter);
      myCounter.next();
      System.out.println(myCounter);
      myCounter.next();
      System.out.println(myCounter);
      myCounter.next();
      System.out.println(myCounter);
      myCounter.next();
      System.out.println(myCounter);
      myCounter.next();

      // Test3: Test reset and display the counter
      myCounter.reset();
      System.out.println(myCounter);



      // Test4: Test getCounter
      System.out.println(myCounter.getCounter());


      // Test5: Test the device behaviour near the MAXIMUM and
      // after MAXIMUM is reached.  Hint: write a for loop to
      // increment the counter to around 996.  Then write a for
      // loop that increments the counter 10 more times,
      // displaying the counter each time it is incremented.
      for(int i = 0; i < 996; i++){
         myCounter.next();
      }
      myCounter.next();
      System.out.println(myCounter);
      myCounter.next();
      System.out.println(myCounter);
      myCounter.next();
      System.out.println(myCounter);
      myCounter.next();
      System.out.println(myCounter);
      myCounter.next();
      System.out.println(myCounter);
      myCounter.next();
      System.out.println(myCounter);
      myCounter.next();
      System.out.println(myCounter);
      myCounter.next();
      System.out.println(myCounter);
      myCounter.next();
      System.out.println(myCounter);

   }
}
