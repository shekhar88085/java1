package oops.interfaces;

public class Person implements Student,YouTuber {
    public static void main(String [] d){
        Person obj=new Person();
        obj.study();
        obj.makeVideo();
    }
   public void study(){
       System.out.println("Person is Studying");
    }
    public void makeVideo(){
        System.out.println("Person is making video");
    }

    @Override
    public void editVideos() {

    }
}
