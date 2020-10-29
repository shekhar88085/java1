package gfg.biginteger;

import java.math.BigInteger;

public class factorialexample {
    static BigInteger Factorial(int n){
        BigInteger f=new BigInteger("1");
        for (int i=2;i<n;i++){
            f=f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }
    public static void main(String []d){
        System.out.println("factorial :"+Factorial(12345));

    }
}
