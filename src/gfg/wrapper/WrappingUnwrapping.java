package gfg.wrapper;

public class WrappingUnwrapping {
    public static void main(String [] de){
        byte b=10;
        Byte byteobj=new Byte(b);
        short s=12;
        Short shortobj=new Short(s);
        int i=10;
        Integer intobj=new Integer(i);
        long l=12345;
        Long longobj=new Long(l);
        float f=12.23f;
        Float floatobj=new Float(f);
        double d=1234.54321;
        Double double0bj=new Double(d);
        char c='a';
        Character charobj=new Character(c);
        System.out.println("values of wrapper objects");
        System.out.println("byte:"+byteobj);
        System.out.println("short:"+shortobj);
        System.out.println("int:"+intobj);
        System.out.println("long:"+longobj);
        System.out.println("float:"+floatobj);
        System.out.println("double:"+double0bj);
        System.out.println("char:"+charobj);
        byte bv=byteobj;
        short sv=shortobj;
        int iv=intobj;
        long lv=longobj;
        float fv=floatobj;
        double dv=double0bj;
        char cv=charobj;
        System.out.println("unwrapping printed as data types");
        System.out.println("byte:"+bv);
        System.out.println("short:"+sv);
        System.out.println("int:"+iv);
        System.out.println("long:"+lv);
        System.out.println("float:"+fv);
        System.out.println("double:"+dv);
        System.out.println("char:"+cv);
    }
}
