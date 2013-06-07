import java.util.*;
public class CarTester
{
   public static void main(String[] args)
   {
      VintageCar car1 = new VintageCar("Ford", "Model T", 1907, true); 
      String car1make = car1.getMake();
      System.out.println("Category test: make");
      System.out.println("   Make should be set to Ford");
      System.out.println("   Make is set to " + car1make);
      System.out.println("   Test: " + 
         (car1make.equals("Ford") ? "SUCCESSFUL" : "FAILED"));

      String car1model = car1.getModel();
      System.out.println("Category test: model");
      System.out.println("   Model should be set to Model T");
      System.out.println("   Model is set to " + car1model);
      System.out.println("   Test: " + 
         (car1model.equals("Model T") ? "SUCCESSFUL" : "FAILED"));

      int car1year = car1.getYear();
      System.out.println("Category test: year");
      System.out.println("   Year should be set to 1907");
      System.out.println("   Year is set to " + car1year);
      System.out.println("   Test: " + 
         (car1year == 1907 ? "SUCCESSFUL" : "FAILED"));

      boolean car1originalBody = car1.getOriginalBody();
      System.out.println("Category test: originalBody - true");
      System.out.println("   OriginalBody should be set to true");
      System.out.println("   OriginalBody is set to " + car1originalBody);
      System.out.println("   Test: " + 
         (car1originalBody == true ? "SUCCESSFUL" : "FAILED"));

      VintageCar car2 = new VintageCar("Chevrolet", "Master", 1937, false);
      boolean car2originalBody = car2.getOriginalBody();
      System.out.println("Category test: originalBody - false");
      System.out.println("   OriginalBody should be set to false");
      System.out.println("   OriginalBody is set to " + car2originalBody);
      System.out.println("   Test: " + 
         (car2originalBody == false ? "SUCCESSFUL" : "FAILED"));

      CarCategory car1carCategory = car1.getCarCategory();
      System.out.println("Category test: carCategory - Historic Category");
      System.out.println("   CarCategory should be set to HISTORIC");
      System.out.println("   CarCategory is set to " + car1carCategory);
      System.out.println("   Test: " + 
         (car1carCategory == CarCategory.HISTORIC ? "SUCCESSFUL" : "FAILED"));

      VintageCar car3 = new VintageCar("Chrysler", "Roadster", 1925, true);
      CarCategory car3carCategory = car3.getCarCategory();
      System.out.println("Category test: carCategory - Vintage Category");
      System.out.println("   CarCategory should be set to VINTAGE");
      System.out.println("   CarCategory is set to " + car3carCategory);
      System.out.println("   Test: " + 
         (car3carCategory == CarCategory.VINTAGE ? "SUCCESSFUL" : "FAILED"));

      CarCategory car2carCategory = car2.getCarCategory();
      System.out.println("Category test: carCategory - Post Vintage Category");
      System.out.println("   CarCategory should be set to POSTVINTAGE");
      System.out.println("   CarCategory is set to " + car2carCategory);
      System.out.println("   Test: " + 
        (car2carCategory == CarCategory.POSTVINTAGE ? "SUCCESSFUL" : "FAILED"));

      VintageCar car4 = new VintageCar("Austin", "Sheerline", 1949, true);
      CarCategory car4carCategory = car4.getCarCategory();
      System.out.println("Category test: carCategory - Other Category");
      System.out.println("   CarCategory should be set to OTHER");
      System.out.println("   CarCategory is set to " + car4carCategory);
      System.out.println("   Test: " + 
         (car4carCategory == CarCategory.OTHER ? "SUCCESSFUL" : "FAILED"));

      VintageCar car5 = new VintageCar("Ford", "Model T", 1918, true); 
      CarCategory car5carCategory = car5.getCarCategory();
      System.out.println("Boundary test: carCategory - 1918/1919 boundary");
      System.out.println("   CarCategory should be set to HISTORIC");
      System.out.println("   CarCategory is set to " + car5carCategory);
      System.out.println("   Test: " + 
         (car5carCategory == CarCategory.HISTORIC ? "SUCCESSFUL" : "FAILED"));

      VintageCar car6 = new VintageCar("Ford", "Model T", 1919, true); 
      CarCategory car6carCategory = car6.getCarCategory();
      System.out.println("Boundary test: carCategory - 1918/1919 boundary");
      System.out.println("   CarCategory should be set to OTHER");
      System.out.println("   CarCategory is set to " + car6carCategory);
      System.out.println("   Test: " + 
         (car6carCategory == CarCategory.VINTAGE ? "SUCCESSFUL" : "FAILED"));

      VintageCar car7 = new VintageCar("Ford", "Model T", 1930, true); 
      CarCategory car7carCategory = car7.getCarCategory();
      System.out.println("Boundary test: carCategory - 1930/1931 boundary");
      System.out.println("   CarCategory should be set to VINTAGE");
      System.out.println("   CarCategory is set to " + car7carCategory);
      System.out.println("   Test: " + 
         (car7carCategory == CarCategory.VINTAGE ? "SUCCESSFUL" : "FAILED"));

      VintageCar car8 = new VintageCar("Ford", "Model T", 1931, true); 
      CarCategory car8carCategory = car8.getCarCategory();
      System.out.println("Boundary test: carCategory - 1930/1931 boundary");
      System.out.println("   CarCategory should be set to POSTVINTAGE");
      System.out.println("   CarCategory is set to " + car8carCategory);
      System.out.println("   Test: " + 
        (car8carCategory == CarCategory.POSTVINTAGE ? "SUCCESSFUL" : "FAILED"));

      VintageCar car9 = new VintageCar("Ford", "Model T", 1939, true); 
      CarCategory car9carCategory = car9.getCarCategory();
      System.out.println("Boundary test: carCategory - 1939/1940 boundary");
      System.out.println("   CarCategory should be set to POSTVINTAGE");
      System.out.println("   CarCategory is set to " + car9carCategory);
      System.out.println("   Test: " + 
        (car9carCategory == CarCategory.POSTVINTAGE ? "SUCCESSFUL" : "FAILED"));

      VintageCar car10 = new VintageCar("Ford", "Model T", 1940, true); 
      CarCategory car10carCategory = car10.getCarCategory();
      System.out.println("Boundary test: carCategory - 1939/1940 boundary");
      System.out.println("   CarCategory should be set to OTHER");
      System.out.println("   CarCategory is set to " + car10carCategory);
      System.out.println("   Test: " + 
         (car10carCategory == CarCategory.OTHER ? "SUCCESSFUL" : "FAILED"));

      car1.setOriginalBody(false);
      car1originalBody = car1.getOriginalBody();
      System.out.println("Category test: setOriginalBody - true -> false");
      System.out.println("   OriginalBody should be set to false"); 
      System.out.println("   OriginalBody is set to " + car1originalBody);
      System.out.println("   Test: " + 
         (car1originalBody == false ? "SUCCESSFUL" : "FAILED"));
      
      car3.setOriginalBody(true);
      boolean car3originalBody = car3.getOriginalBody();
      System.out.println("Category test: setOriginalBody - true -> true");
      System.out.println("   OriginalBody should be set to true"); 
      System.out.println("   OriginalBody is set to " + car3originalBody);
      System.out.println("   Test: " + 
         (car3originalBody == true ? "SUCCESSFUL" : "FAILED"));

      car2.setOriginalBody(true);
      car2originalBody = car2.getOriginalBody();
      System.out.println("Category test: setOriginalBody - false -> true");
      System.out.println("   OriginalBody should be set to true"); 
      System.out.println("   OriginalBody is set to " + car2originalBody);
      System.out.println("   Test: " + 
         (car2originalBody == true ? "SUCCESSFUL" : "FAILED"));

      VintageCar car11 = new VintageCar("Chrysler", "Roadster", 1928, false);
      car11.setOriginalBody(false);
      boolean car11originalBody = car11.getOriginalBody();
      System.out.println("Category test: setOriginalBody - false -> false");
      System.out.println("   OriginalBody should be set to false"); 
      System.out.println("   OriginalBody is set to " + car11originalBody);
      System.out.println("   Test: " + 
         (car11originalBody == false ? "SUCCESSFUL" : "FAILED"));

      boolean car1isEligibleCar = car1.isEligibleCar();
      System.out.println("Category test: isEligibleCar");
      System.out.println("   isEligibleCar should be set to true");
      System.out.println("   isEligibleCar is set to " + car1isEligibleCar);
      System.out.println("   Test: " + 
         (car1isEligibleCar == true ? "SUCCESSFUL" : "FAILED"));

      boolean car4isEligibleCar = car4.isEligibleCar();
      System.out.println("Category test: isEligibleCar");
      System.out.println("   isEligibleCar should be set to false");
      System.out.println("   isEligibleCar is set to " + car4isEligibleCar);
      System.out.println("   Test: " + 
         (car4isEligibleCar == false ? "SUCCESSFUL" : "FAILED"));

      boolean car9isEligibleCar = car9.isEligibleCar();
      System.out.println("Boundary test: isEligibleCar - 1939/1940 boundary");
      System.out.println("   isEligibleCar should be set to true");
      System.out.println("   isEligibleCar is set to " + car9isEligibleCar);
      System.out.println("   Test: " + 
         (car9isEligibleCar == true ? "SUCCESSFUL" : "FAILED"));

      boolean car10isEligibleCar = car10.isEligibleCar();
      System.out.println("Boundary test: isEligibleCar - 1939/1940 boundary");
      System.out.println("   isEligibleCar should be set to false");
      System.out.println("   isEligibleCar is set to " + car10isEligibleCar);
      System.out.println("   Test: " + 
         (car10isEligibleCar == false ? "SUCCESSFUL" : "FAILED"));

      int car1compareAge = car1.compareAge(car2);
      System.out.println("Category test: compareAge");
      System.out.println("   compareAge should be negative");
      System.out.println("   compareAge is set to " + car1compareAge);
      System.out.println("   Test: " + 
         (car1compareAge < 0 ? "SUCCESSFUL" : "FAILED"));

      int car4compareAge = car4.compareAge(car2);
      System.out.println("Category test: compareAge");
      System.out.println("   compareAge should be positive");
      System.out.println("   compareAge is set to " + car4compareAge);
      System.out.println("   Test: " + 
         (car4compareAge > 0 ? "SUCCESSFUL" : "FAILED"));

      VintageCar car12 = new VintageCar("Chrysler", "Roadster", 1928, true);
      int car12compareAge = car12.compareAge(car11);
      System.out.println("Category test: compareAge");
      System.out.println("   compareAge should be zero");
      System.out.println("   compareAge is set to " + car12compareAge);
      System.out.println("   Test: " + 
         (car12compareAge == 0 ? "SUCCESSFUL" : "FAILED"));

      VintageCar car13 = new VintageCar("Chrysler", "Roadster", 1927, true);
      int car13compareAge = car13.compareAge(car12);
      System.out.println("Boundary test: compareAge");
      System.out.println("   compareAge should be negative");
      System.out.println("   compareAge is set to " + car13compareAge);
      System.out.println("   Test: " + 
         (car13compareAge < 0 ? "SUCCESSFUL" : "FAILED"));

      VintageCar car14 = new VintageCar("Chrysler", "Roadster", 1929, true);
      int car14compareAge = car14.compareAge(car12);
      System.out.println("Boundary test: compareAge");
      System.out.println("   compareAge should be positive");
      System.out.println("   compareAge is set to " + car14compareAge);
      System.out.println("   Test: " + 
         (car14compareAge > 0 ? "SUCCESSFUL" : "FAILED"));

      boolean car1sameType = car1.sameType(car5);
      System.out.println("Category test: sameType - make same, model same");
      System.out.println("   sameType should be set to true");
      System.out.println("   sameType is set to " + car1sameType);
      System.out.println("   Test: " + 
         (car1sameType == true ? "SUCCESSFUL" : "FAILED"));

      VintageCar car15 = new VintageCar("Ford", "Model A", 1930, false);
      boolean car15sameType = car15.sameType(car1);
      System.out.println("Category test: sameType - make same, model diff");
      System.out.println("   sameType should be set to false");
      System.out.println("   sameType is set to " + car15sameType);
      System.out.println("   Test: " + 
         (car15sameType == false ? "SUCCESSFUL" : "FAILED"));

      VintageCar car16 = new VintageCar("Buick", "Roadster", 1939, true);
      boolean car16sameType = car16.sameType(car11);
      System.out.println("Category test: sameType - make diff, model same");
      System.out.println("   sameType should be set to false");
      System.out.println("   sameType is set to " + car16sameType);
      System.out.println("   Test: " + 
         (car16sameType == false ? "SUCCESSFUL" : "FAILED"));

      boolean car12sameType = car12.sameType(car1);
      System.out.println("Category test: sameType - make diff, model diff");
      System.out.println("   sameType should be set to false");
      System.out.println("   sameType is set to " + car12sameType);
      System.out.println("   Test: " + 
         (car12sameType == false ? "SUCCESSFUL" : "FAILED"));

      VintageCar car17 = new VintageCar("Ford", "Model T", 1907, true); 
      String car17state = car17.toString();
      String expectedState = "VintageCar[make: Ford, model: Model T, year: " +
                             "1907, originalBody: true, carCategory: HISTORIC]";
      System.out.println("Category test: toString - description of state");
      System.out.println("   String should be set to " + expectedState);
      System.out.println("   String is set to " + car17state);
      System.out.println("   Test: " + 
         (car17state.equals(expectedState) ?  "SUCCESSFUL" : "FAILED"));
   }
}
