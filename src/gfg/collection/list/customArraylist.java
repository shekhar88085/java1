package gfg.collection.list;

import java.util.ArrayList;

public class customArraylist {
    int n=4;
    class Data{
        int roll;
        String name;
        int marks;
        long phone;
        Data(int roll,String name,int marks,long phone){
            this.roll=roll;
            this.name=name;
            this.marks=marks;
            this.phone=phone;
        }
    }
    public static void main(String [] ddd){
        int roll[]={1,2,3,4};
        String name[]={"A","B","C","D"};
        int marks[]={2,6,8,9};
        long phone[]={8181925841l,7068683250l,7619930644l,9412423055l};
        customArraylist custom=new customArraylist();
        custom.addValues(roll,name,marks,phone);
    }
    public void addValues(int roll[],String name[],int marks[],long phone[]){
        ArrayList<Data> list=new ArrayList<>();
        for (int i=0;i<n;i++){
            list.add(new Data(roll[i],name[i],marks[i],phone[i]));
    }
        printValues(list);
}
public void printValues(ArrayList<Data> list) {
    for (int i = 0; i <n; i++) {
        Data data = list.get(i);
        System.out.println(data.roll+" "+data.name+" "+data.marks+" "+data.phone);
    }
}
}