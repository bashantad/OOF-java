public class VintageCar
{
   private String make;
   private String model;
   private int year;
   private boolean originalBody;
   private CarCategory carCategory;
   public VintageCar(String make, String model, int year, boolean originalBody)
   {
      this.make = make;
      this.model = model;
      this.year = year;
      this.originalBody = originalBody;
      setCarCategory();
   }
   private void setCarCategory()
   {
      if(year < 1919){
         carCategory = CarCategory.HISTORIC;
      }else if(year >= 1919 && year <= 1930){
         carCategory = CarCategory.VINTAGE;
      }else if(year >=1931 && year <= 1939){
         carCategory = CarCategory.POSTVINTAGE;
      }else{
         carCategory = CarCategory.OTHER;
      }
   }
   public String getMake()
   {
      return make;
   }
   public String getModel()
   {
      return model;
   }
   public int getYear()
   {
      return year;
   }
   public boolean getOriginalBody()
   {
      return originalBody;
   }
   public CarCategory getCarCategory()
   {
      return carCategory;
   }
   public void setOriginalBody(boolean originalBody)
   {
      this.originalBody = originalBody;
   }
   public boolean isEligibleCar()
   {
      if(carCategory == CarCategory.OTHER){
         return false;
      }else{
         return true;
      }
   }
   public int compareAge(VintageCar obj)
   {
      return  year - obj.year;
   }
   public boolean sameType(VintageCar obj)
   {
      return (make.equals(obj.make) && model.equals(obj.model));
   }
   public String toString()
   {
      return "VintageCar[make: " + make + ", model: " + model + ", year: " + year + ", originalBody: " + originalBody + ", carCategory: " + carCategory + "]";
   }
}
