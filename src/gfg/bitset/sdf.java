package gfg.bitset;

import java.util.BitSet;

public class sdf {
    public static void main(String [] sss){
        BitSet bs1=new BitSet();
        BitSet bs2=new BitSet();
        bs1.set(1);
        bs1.set(2);
        bs1.set(3);
        bs1.set(4);
        bs1.set(4);
        bs2.set(0);
        bs2.set(9);
        bs2.set(8);
        bs2.set(7);
        System.out.println(bs1);
        System.out.println(bs2);
        bs1.xor(bs2);
        System.out.println(bs1);
    }
}
