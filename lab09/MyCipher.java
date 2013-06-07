public class MyCipher
{
   public static char encode(char ch, int key)
   {
      key = key % 26;
      if(key < 0)
      {
         key += 26;
      }
      if(ch >= 'a' && ch <= 'z')
      {
         return (char)((ch - 'a' + key) % 26 + 'a');
      }
      else if(ch >= 'A' && ch <= 'Z')
      {
         return (char)((ch - 'A' + key) % 26 + 'A');
      }
      else
      {
         return ch;
      }
   }
   public static char decode(char ch, key)
   {
     return encode(ch, -key);
   }
}
