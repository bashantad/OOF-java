public class Identity
{
   public static char getGender(String identityCode)
   {
      return identityCode.charAt(0);
   }
   public static String getIdNumber(String identityCode)
   {
      return identityCode.substring(1,4);
   }
   public static char getClassification(String identityCode)
   {
      return identityCode.charAt(4);
   }
   /**
    *This class method returns firstAidLevel: 
    *a numeric character at fifth position of input string 
    *@param identityCode the input to get firstAidLevel
    *@return the value as an integer  
    */
   public static int getFirstAidLevel(String identityCode)
   {
      return Character.getNumericValue(identityCode.charAt(5));
   }
   public static String getLicences(String identityCode)
   {
      return identityCode.substring(6);
   }
   /**
    *This method updates level in identityCode if valid level is provided
    *@param level the value to be updated in identityCode
    *@return updated string that contains new level if level is valid
    *otherwise it returns old level
    */
   public static String updateFirstAidLevel(String identityCode, int level)
   {
      if(level >= 0 && level <= 2)
      {
         identityCode = identityCode.substring(0,5) + level + identityCode.substring(6);
      }
      return identityCode;
   }
   /**
    *This method return updated identityCode with new licencesets assuming licenceSets are valid
    *@param licenceSets the string containig lincenceSets
    *@return updated identityCode with new sets of licences.
    */
   public static String updateLicences(String identityCode, String licenceSets)
   {
      return identityCode.substring(0,6) + licenceSets;
   }
   /**
    *This method return whether an identityCode is valid or not based upon length of input and 
    *valid characters at respective positions.
	 *At first it checks if the length of input string lies between 5 and 7 or not
    *If it does it checks if inputCode has valid set of licences or not making sure
    *it doesn't contain any duplicate set of licences
    *then, it gets idNumber, classification and gender and checks their validity to prescribed set of rules
    *if everything is valid it returns boolean true otherwise it returns false    
	 *@param identityCode String that needs to be checked
    *@return boolean true if identityCode is valide ortherwise false
    */
   public static boolean checkIdentity(String identityCode)
   {
      if(identityCode.length() < 7 || identityCode.length() > 9)
      {
         return false;
      }else{
         String licences = getLicences(identityCode);
         boolean isValidLicence = true;
         if(licences.length() >=1 && licences.length() <= 3){
            //checks if all the characters contain C, R or H or not
            for(int i = 0; i < licences.length(); i++)
            {
               if(!(licences.charAt(i) == 'C' || licences.charAt(i) == 'R' || licences.charAt(i) == 'H')){
                  isValidLicence = false;
                  break;
               }
            }
            if(isValidLicence)
            {
               //checks whether licence sets contain duplicates or not
               for(int i = 1; i < licences.length(); i++)
               {
                  for(int j = 0; j < i; j++)
                  {
                     if(licences.charAt(i) == licences.charAt(j))
                     {
                        isValidLicence = false;
                     }
                  }
               }
            }
         }else{
            isValidLicence = false;
         }
         String id = getIdNumber(identityCode);
         char classification = getClassification(identityCode);
         return (getGender(identityCode) == 'M' || getGender(identityCode) == 'F') &&
            ((id.length() == 3) && Integer.parseInt(id) >= 0 && Integer.parseInt(id) <= 999) &&
            (classification == 'A' || classification == 'S' || classification == 'V') &&
            (getFirstAidLevel(identityCode) >= 0 && getFirstAidLevel(identityCode) <= 2) && 
            isValidLicence;
      }
   }
}
