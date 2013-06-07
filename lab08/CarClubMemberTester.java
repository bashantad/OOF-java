public class CarClubMemberTester
{
   public static void main(String[] args)
   {
      VintageCar car1 = new VintageCar("Buick", "Roadster", 1939, true);
      VintageCar car2 = new VintageCar("Hummer", "H3", 1931, false);
      VintageCar car3 = new VintageCar("Ford", "Mirraj", 1920, true);
      CarClubMember member = new CarClubMember("Henry", "948538488");

      System.out.println(member);
      member.addCar(car1);
      System.out.println(member);
      member.addCar(car2);
      System.out.println(member.addCar(car3));
      member.setPhone("84838488484");
      member.changeOriginalBody(1, false);
      System.out.println(member);
      
   }
}
