package Competitive;

public class reverseString {
    public static void main(String [] sc){
        String k="the sky is blue";
        System.out.println(k);
        String l=reverse(k);
        System.out.println(l);
    }
  static   public String reverse(String s){
        int i=s.length()-1;
        String ans="";
        while (i>=0){
            while(i>=0&&s.charAt(i)==' ')i--;
            int j=i;
            if(i<0)break;
            while (i>=0&&s.charAt(i)!=' ')i--;
            if(ans.isEmpty()){
                ans=ans.concat(s.substring(i+1,j+1));
            }else {
                ans=ans.concat(" "+s.substring(i+1,j+1));
            }
        }
        return ans;
    }
}
