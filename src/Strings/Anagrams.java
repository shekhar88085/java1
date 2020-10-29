package Strings;

public class Anagrams {
    public static void main(String []fd){
      String a="cgfhat";
         String b="act";
         boolean isAnagram=false;
        /* for (int i=0;i<a.length();i++){
             isAnagram=false;
             char c=a.charAt(i);
             for (int j=0;j<b.length();j++){
                 if(b.charAt(j)==c){
                     isAnagram=true;
                     break;
                 }
              }
             if(!isAnagram){
                 break;
             }
         }*/
         int al[]=new int[256];
         int bl[]=new int[256];

         for(char c: a.toCharArray()){
             int index=(int) c;
             al[index]++;
         }
         if(isAnagram==true){
             System.out.println("Anagram");
         }else {
             System.out.println("Not Anagram");
         }
    }
}
