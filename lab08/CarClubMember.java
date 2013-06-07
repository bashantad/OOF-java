public class CarClubMember
{
   private String name;
   private String phone;
   private VintageCar car1;
   private VintageCar car2;
   public CarClubMember(String name, String phone)
   {
      this.name = name;
      this.phone = phone;
      car1 = null;
      car2 = null;
   }
   public String getName()
   {
      return name;  
   }
   public String getPhone()
   {
      return phone;
   }
   public String getCar1Details()
   {
      if(car1 == null){
         return "none";
      }else{
         return car1.toString();
      }
   }
   public String getCar2Details()
   {
      if(car2 == null){
         return "none";
      }else{
         return car2.toString();
      }
   }
   public void setPhone(String phone)
   {
      this.phone = phone;
   }
   public boolean addCar(VintageCar objVintageCar)
   {
      if(car1 == null){
         car1 = objVintageCar;
         return true;
      }else if(car2 == null){
         car2 = objVintageCar;
         return true;
      }else{
         return false;
      }
   }
   public boolean changeOriginalBody(int carNumber, boolean status)
   {
      if(carNumber == 1 && car1 != null){
         car1.setOriginalBody(status);
         return true;
      }else if(carNumber == 2 && car2 != null){
         car2.setOriginalBody(status);
         return true;
      }else{
         return false;
      }
   }
   public boolean canVote()
   {
      return (car1.isEligibleCar() || car2.isEligibleCar());
   }
   public String toString()
   {
      return this.getClass().getName() + "[name: " + this.name + ", phone: " + this.phone + ", car1: " + this.getCar1Details() + ", car2: " + this.getCar2Details() + "]";
   }
}
