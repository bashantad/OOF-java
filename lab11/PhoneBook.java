public class PhoneBook
{
   private static final int MAX_SIZE = 10;
   private Person[] entries;
   private int count;
   public PhoneBook()
   {
      count = 0;
      entries = new Person[MAX_SIZE];
   }
   public void insert(String name, String phoneNumber)
   {
      if(count < MAX_SIZE){
         entries[count] = new Person(name, phoneNumber);
         ++count;
      }else{
         System.out.println("Contact address book is already full");
      }
   }
   public String searchByName(String targetName)
   {
      for(int i = 0; i < count; i++)
      {
         if(entries[i].getName().equalsIgnoreCase(targetName)){
            return entries[i].getPhone();
         }
      }
      return "Not Found";
   }
   public String searchByPhone(String targetPhone)
   {
      for(int i = 0; i < count; i++)
      {
         if(entries[i].getPhone().equalsIgnoreCase(targetPhone))
         {
            return entries[i].getName();
         }
      }
      return "Not Found";
   }
   public void deleteEntry(String targetName)
   {
      boolean found = false;
      int i;
      for(i = 0; i < count; i++)
      {
         if(entries[i].getName().equalsIgnoreCase(targetName))
         {
            found = true;
            break;
         }
      }
      if(found){
         while(i < count)
         {
            entries[i] = entries[i+1];
            ++i;
         }
         entries[i] = null;
         --count;
      }else
      {  
         System.out.println(targetName + " doesn't exist in phonebook");
      }
   }
   public String toString()
   {
      String allEntries = "PhoneBook[\n";
      for(int i = 0; i < count; i++)
      {
         allEntries += "\t" + (i+1) + " " + entries[i] + "\n";
      }
      return allEntries + "]";
   }
}
