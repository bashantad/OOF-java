public class Battery
{
   private String location;
   private int monthsOfLife;
   private int currentAge;
   /**
    *constructor takes two argument 
    *@param first argument should be string and contain value of location
    *where as second argument should be int which stores months battery life
    *
    *
    */
   public Battery(String location, int monthsOfLife)
   {
      this.location = location;
      this.monthsOfLife = (monthsOfLife <= 0 || monthsOfLife >= 60) ? monthsOfLife : 60;
      this.currentAge = 0;
   }
   /**
    * accessor method to get location of battery
    *@return returns string which contains the value of location
    */
   public String getLocation()
   {
      return this.location;
   }
   /**
    *accessor method to get battery life
    *@return int value which contains the life of battery in number of months
    */
   public int getMonthsOfLife()
   {
      return this.monthsOfLife;
   }
   /**
    *accessor method to get the current age of battery
    *@return int value which contains current age of battery
    */
   public int getCurrentAge()
   {
      return this.currentAge;
   }
   /**
    *increment the current age of battery life by 1
    */
   public void incrementAge()
   {
      this.currentAge++;
   }
   /**
    *@return return boolean true if life span remaining is less than one or less otherwise false
    */
   public boolean replaceBattery()
   {
      return (1 < (monthsOfLife - currentAge));
   }
   /**
    *@return return string representation of an object
    */
   public String toString()
   {
      return "Battery[location: " + location + ", monthsOfLife: " + monthsOfLife + ", currentAge: " + currentAge + "]"; 
   }
}
