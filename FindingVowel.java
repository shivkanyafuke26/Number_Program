class FindingVowel
{
   public static void main(String[] args) {
      String str="HI I AM SHIVANI";

      for(int i=0;i<str.length();i++)
      {
         if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
         {
            System.out.println("str contains vowel "+str.charAt(i)+" at position "+i);
         }
      }
   }
}