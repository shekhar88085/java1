package gfg.stringclass.StringBuilder;

public class ex {
    public static void main(String [] cc){
        StringBuilder sb=new StringBuilder();
        sb.append("chandra shekhar");
        System.out.println(sb.toString());
        System.out.println(sb.capacity());
        System.out.println(sb.appendCodePoint(45));
        sb.setCharAt(0,'O');
        System.out.println(sb.toString());
        System.out.println(sb.subSequence(8,15));
        sb.setLength(10);
        System.out.println(sb.toString());
        int unicode=sb.codePointAt(1);
        System.out.println(unicode);
        System.out.println(sb.append("ekhar"));
        char[] arr=new char[7];
        sb.getChars(0,7,arr,0);
        System.out.println(arr);
    }
}
