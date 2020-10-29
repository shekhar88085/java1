package gfg.For_Each;

public class foreach {
    public static void main(String [] d){
        int[] marks={1,2,3,4,5,6,7,8,9};
       // int maximum=m
        System.out.println(maxi(marks));
    }
    public static int  maxi(int[] numbers){
        int maxsofar=numbers[0];
        for(int num:numbers){
            if(num>maxsofar){
                maxsofar=num;
            }
        }
        return maxsofar;
    }
}
