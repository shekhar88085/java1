package gfg.stringclass.Stringbuffer;

public class ex {
    public static void main(String [] d){
        StringBuffer sb=new StringBuffer("Chandra Shekhar");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        StringBuffer s=new StringBuffer();
        System.out.println(s.capacity());
        sb.append(" Vishwakarma");
        System.out.println(sb);
        sb.insert(8,"mannu ");
        System.out.println(sb);
        System.out.println(sb.reverse());
        sb.reverse();
        sb.delete(8,13);
        System.out.println(sb);
        System.out.println(sb.replace(0,7,"mannu"));
        System.out.println(sb.toString());
        int N = 456778889;
       // System.out.println(Math.log10(N));
        double K=Math.log10(N);
        System.out.println(K);
        K-=Math.floor(K);
        System.out.println(K);
        int X=(int)Math.pow(10,K);
        System.out.println(X);
        System.out.println(Math.floor(Math.log10(N)) + 1);
    }
}
