public class PhoneBookTester
{
   public static void main(String[] args)
   {
      PhoneBook pb = new PhoneBook();
      pb.insert("Cal", "12345677");
      pb.insert("Brandon", "2384848844");
      pb.insert("Sarun", "923932923932");
      pb.insert("Richard", "9393494934");
      pb.insert("Mary", "9943993329");
      System.out.println(pb);
      System.out.println(pb.searchByName("Brandon"));
      System.out.println(pb.searchByPhone("12345677"));
      pb.deleteEntry("Mary");
      System.out.println(pb);
      pb.insert("Eric", "9393293932");
      System.out.println(pb);
   }
}

