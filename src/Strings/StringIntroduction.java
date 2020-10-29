package Strings;

public class StringIntroduction {
    public static void main(String []dc){
        String name="Shekhar";
        String anothername=new String("Vishwakarma");
        System.out.print(name+ " ");
        System.out.println(anothername.charAt(2));
        System.out.println(anothername.substring(2));
        System.out.println(anothername.contains("sh"));
        String student="Akash,Ayush,Avinash,Prashant,Saurabh,Shekhar";
        String friends[]=student.split(",");
        for(String item:friends){
            System.out.print(item+" ");
        }
    }
}
