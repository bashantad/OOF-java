import java.util.*;
public class MyCipherTester
{
   public static void main(String[] args)
   {
      String alphabetLC = "abcdefghijklmnopqrstuvwxyz";
      String alphabetUC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String nonAlpha = ".'?/  \"@$ %&";

      System.out.println();
      System.out.println("Rotating Characters Tests (encode and decode)");
      System.out.println("*****************");
      // Test1: Rotate all alpha lowercase characters right 3
      System.out.println("Test1 +3");
      for (int i = 0; i < alphabetLC.length(); ++i)
      {
         System.out.print(MyCipher.encode(alphabetLC.charAt(i), 3));
      }
      System.out.println();
      for (int i = 0; i < alphabetLC.length(); ++i)
      {
         System.out.print(MyCipher.decode(alphabetLC.charAt(i), 3));
      }
      System.out.println();

      // Test2: Rotate all alpha uppercase characters right 3
      System.out.println("Test2 +3");
      for (int i = 0; i < alphabetUC.length(); ++i)
      {
         System.out.print(MyCipher.encode(alphabetUC.charAt(i), 3));
      }
      System.out.println();
      for (int i = 0; i < alphabetUC.length(); ++i)
      {
         System.out.print(MyCipher.decode(alphabetUC.charAt(i), 3));
      }
      System.out.println();

      // Test3: Check non-alpha characters are not affected right 3
      System.out.println("Test3 +3 (should have no effect)");
      for (int i = 0; i < nonAlpha.length(); ++i)
      {
         System.out.print(MyCipher.encode(nonAlpha.charAt(i), 3));
      }
      System.out.println();
      System.out.println("Test3 +3 (should have no effect)");
      for (int i = 0; i < nonAlpha.length(); ++i)
      {
         System.out.print(MyCipher.decode(nonAlpha.charAt(i), 3));
      }
      System.out.println();
  
      // Test4: Rotate all alpha lowercase characters left 5
      System.out.println("Test4 -5");
      for (int i = 0; i < alphabetLC.length(); ++i)
      {
         System.out.print(MyCipher.encode(alphabetLC.charAt(i), -5));
      }
      System.out.println();
      for (int i = 0; i < alphabetLC.length(); ++i)
      {
         System.out.print(MyCipher.decode(alphabetLC.charAt(i), -5));
      }
      System.out.println();

      // Test5: Rotate all alpha uppercase characters left 5
      System.out.println("Test5 -5");
      for (int i = 0; i < alphabetUC.length(); ++i)
      {
         System.out.print(MyCipher.encode(alphabetUC.charAt(i), -5));
      }
      System.out.println();
      for (int i = 0; i < alphabetUC.length(); ++i)
      {
         System.out.print(MyCipher.decode(alphabetUC.charAt(i), -5));
      }
      System.out.println();
  
      // Test6: Rotate all alpha lowercase characters right 30
      System.out.println("Test6 +30");
      for (int i = 0; i < alphabetLC.length(); ++i)
      {
         System.out.print(MyCipher.encode(alphabetLC.charAt(i), 30));
      }
      System.out.println();
      for (int i = 0; i < alphabetLC.length(); ++i)
      {
         System.out.print(MyCipher.decode(alphabetLC.charAt(i), 30));
      }
      System.out.println();

      // Test7: Rotate all alpha uppercase characters right 30
      System.out.println("Test7 +30");
      for (int i = 0; i < alphabetUC.length(); ++i)
      {
         System.out.print(MyCipher.encode(alphabetUC.charAt(i), 30));
      }
      System.out.println();
      for (int i = 0; i < alphabetUC.length(); ++i)
      {
         System.out.print(MyCipher.decode(alphabetUC.charAt(i), 30));
      }
      System.out.println();
  
      // Test8: Rotate all alpha lowercase characters left -28
      System.out.println("Test8 -28");
      for (int i = 0; i < alphabetLC.length(); ++i)
      {
         System.out.print(MyCipher.encode(alphabetLC.charAt(i), -28));
      }
      System.out.println();
      for (int i = 0; i < alphabetLC.length(); ++i)
      {
         System.out.print(MyCipher.decode(alphabetLC.charAt(i), -28));
      }
      System.out.println();

      // Test9: Rotate all alpha uppercase characters left -28
      System.out.println("Test9 -28");
      for (int i = 0; i < alphabetUC.length(); ++i)
      {
         System.out.print(MyCipher.encode(alphabetUC.charAt(i), -28));
      }
      System.out.println();
      for (int i = 0; i < alphabetUC.length(); ++i)
      {
         System.out.print(MyCipher.decode(alphabetUC.charAt(i), -28));
      }
      System.out.println();

      System.out.println();
      System.out.println("Alternative Rotating Characters Test");
      System.out.println("__________________________");
      String codeWord = "AbC-dEf!";
      System.out.println("code word: " + codeWord);

      String codedWord = ""; 
      String decodedWord = "";
      System.out.println("Test1 +2 encode, +2 decode");
      for (int i = 0; i < codeWord.length(); ++i)
      {
         codedWord += MyCipher.encode(codeWord.charAt(i), 2);
      }
      for (int i = 0; i < codedWord.length(); ++i)
      {
         decodedWord += MyCipher.decode(codedWord.charAt(i), 2);
      }
      System.out.println("coded: " + codedWord + " decoded " + decodedWord);

      codedWord = ""; 
      decodedWord = "";
      System.out.println("Test2 +28 encode, +28 decode");
      for (int i = 0; i < codeWord.length(); ++i)
      {
         codedWord += MyCipher.encode(codeWord.charAt(i), 28);
      }
      for (int i = 0; i < codedWord.length(); ++i)
      {
         decodedWord += MyCipher.decode(codedWord.charAt(i), 28);
      }
      System.out.println("coded: " + codedWord + " decoded " + decodedWord);

      codedWord = "";
      decodedWord = "";
      System.out.println("Test3 -2 encode, -2 decode");
      for (int i = 0; i < codeWord.length(); ++i)
      {
         codedWord += MyCipher.encode(codeWord.charAt(i), -2);
      }
      for (int i = 0; i < codedWord.length(); ++i)
      {
         decodedWord += MyCipher.decode(codedWord.charAt(i), -2);
      }
      System.out.println("coded: " + codedWord + " decoded " + decodedWord);

      codedWord = "";
      decodedWord = "";
      System.out.println("Test4 -28 encode, -28 decode");
      for (int i = 0; i < codeWord.length(); ++i)
      {
         codedWord += MyCipher.encode(codeWord.charAt(i), -28);
      }
      for (int i = 0; i < codedWord.length(); ++i)
      {
         decodedWord += MyCipher.decode(codedWord.charAt(i), -28);
      }
      System.out.println("coded: " + codedWord + " decoded " + decodedWord);

      System.out.println();
      System.out.println("Caesar Cipher Test");
      System.out.println("__________________________");
      String secret = "Beware the Ides of March";
      String caesarCoded = MyCipher.encode(secret, 12);
      String caesarDecoded = MyCipher.decode(caesarCoded, 12);
      System.out.println(secret);
      System.out.println(caesarCoded);
      System.out.println(caesarDecoded);

      System.out.println();
      System.out.println("ROT13 Test");
      System.out.println("__________________________");
      String myWord = "Ah, curse your sudden but inevitable betrayal!";
      System.out.println(myWord);
      String myWordCoded = MyCipher.encode(myWord);
      System.out.println(myWordCoded);
      String myWordDecoded = MyCipher.decode(myWordCoded);
      System.out.println(myWordDecoded);

      myWord = "Patients were cynical and not responding";
      System.out.println(myWord);
      myWordCoded = MyCipher.encode(myWord);
      System.out.println(myWordCoded);
      myWordDecoded = MyCipher.decode(myWordCoded);
      System.out.println(myWordDecoded);

      System.out.println();
      System.out.println("Vignere Test");
      System.out.println("__________________________");
      myWord = "Nobody has Margaritas with Pizza";
      System.out.println(myWord);
      myWordCoded = MyCipher.encode(myWord, "Aeryn");
      System.out.println(myWordCoded);
      myWordDecoded = MyCipher.decode(myWordCoded, "Aeryn");
      System.out.println(myWordDecoded);

      myWord = "I hate it when villains quote Shakespeare.";
      System.out.println(myWord);
      myWordCoded = MyCipher.encode(myWord, "Crichton");
      System.out.println(myWordCoded);
      myWordDecoded = MyCipher.decode(myWordCoded, "Crichton");
      System.out.println(myWordDecoded);

      myWord = "I try to save a life a day... usually it's mine.";
      System.out.println(myWord);
      myWordCoded = MyCipher.encode(myWord, "farscape");
      System.out.println(myWordCoded);
      myWordDecoded = MyCipher.decode(myWordCoded, "farscape");
      System.out.println(myWordDecoded);
   }
}
