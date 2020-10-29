package sorting;

public class BubbleSort {
    public static void main(String [] dsc){
        int a[]={9,8,7,6,5,4,3,2,1,0};
        int n=a.length;
        boolean sorted=true;
        for (int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(a[j+1]<a[j]){
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                    sorted=false;
                }
            }
            if(sorted) break;
        }
        for(int item:a){
            System.out.print(item+" ");
        }
    }
}
