package Class;

class VaTest1 {
    static void vaTest(int... v) {
        System.out.println("int...v" + " Number of Varargs:" + v.length + " Contents ");
        for (int i : v) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    static void vaTest(boolean...v){
        System.out.println("boolean...v:"+" Number of Varargs:"+v.length+" Contents");
        for(boolean i:v)
            System.out.println(i+" ");
    }
}

public class Varargs {
    public static void main(String[] b){
        VaTest1.vaTest(7,8,9);
        VaTest1.vaTest(true,false);
    }
}
