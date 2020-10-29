package gfg.stringclass;

public class conversionOfAll {
    public static void main(String [] wsdfg){
        String str="shekhar";
        System.out.println(str.toString());
        //string to stringbuilder
        StringBuilder sb=new StringBuilder(str);
        System.out.println(sb.toString());
        //string to stringbuffer
        StringBuffer sf=new StringBuffer(str);
        System.out.println(sf.toString());
        StringBuilder sb1=new StringBuilder("chandra");
        System.out.println(sb1.toString());
        //sb to string
        str=sb1.toString();
        System.out.println(str);
        //sf to string
        StringBuffer sf1=new StringBuffer("edar");
        str=sf.toString();
    }
}
