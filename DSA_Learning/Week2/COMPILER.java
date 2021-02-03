package DSA_Learning.Week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class COMPILER {    static class FastReader{
    BufferedReader br;
    StringTokenizer st;
    public FastReader(){
        br=new BufferedReader(new InputStreamReader(System.in));
    }
    String next(){
        while (st==null||!st.hasMoreElements()){
            try {
                st=new StringTokenizer(br.readLine());
            }catch (IOException e){
                e.printStackTrace();
            }
        }return st.nextToken();
    }
    int nextInt(){
        return Integer.parseInt(next());
    }
    long nextLong(){
        return Long.parseLong(next());
    }
    double nextDouble(){
        return Double.parseDouble(next());
    }
    String nextLine(){
        String str="";
        try {
            str=br.readLine();
        }catch (IOException e){
            e.printStackTrace();
        }return str;
    }
}
    public static void main(String []sdf){
    FastReader sc=new FastReader();
    int t=sc.nextInt();
    while (t-->0){
        String s=sc.next();
        int sb=0,ub=0,sum=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='<'){
                sb++;
            }else if(sb>0){
                sb--;
                ub++;
                if (sb==0){
                    sum+=ub;
                    ub=0;
                }
            }else break;
        }
        System.out.println(sum*2);
    }
    }
}
