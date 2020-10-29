package others;

public class appendCodePoint {
    public static void main(String [] d){
        StringBuffer sbf=new StringBuffer("chandra shekha");
        System.out.println("String Buffer ="+sbf);
        sbf.appendCodePoint(114);
        System.out.println("after append coding ="+sbf);
    }
}
