package gfg.stringclass;

public class tut {
    public static void main(String [] sd){
        String s="Chandra Shekhar";
        String s2=new String(" Vishwakarma");
        System.out.print(s);
        System.out.println(s2);
        byte a[]=new byte[]{1,2,3,4,5,6};
        String s_byte=new String(a);
        System.out.println(s_byte);
        //length();
        System.out.println(s.length());
        //substring();
        System.out.println(s.substring(2,5));
        //concat();
        System.out.println(s.concat(s2).concat(s));
        //indexof();
        System.out.println("inex");
        System.out.println(s.indexOf("kh",4));
        //equalsIgnoreCase();
        System.out.println(s.equalsIgnoreCase("shekhar"));
        //comparreTo();
        System.out.println("compare "+s.compareTo(s2));
        System.out.println(s2);
        s2=s.concat(s2);
        //trim();
        System.out.println(s.concat(s2.trim()));
        System.out.println(s2.toString());
        //subSequence();
        CharSequence sc=s2.subSequence(8,15);
        System.out.println(sc);
        //contains();
        System.out.println(s2.contains(sc));
        //startsWith();
        //endsWith();
        String ends=s2.substring(16,27);
        String start=s2.substring(0,7);
        System.out.println("s2 starts with: "+start+" "+s2.startsWith(start));
        System.out.println("s2 ends with: "+ends+" "+s2.endsWith(ends));
        //toCharArray();
        char[] arr=s2.toCharArray();
        System.out.println("String to toCharArray");
        for (char i:arr)
            System.out.print(i+" ");
        System.out.println();
        //getChars();
        s.getChars(4,7,arr,0);
        for (char i:arr) System.out.print(i+" ");
        //intern();
        String aa="geeks";
        String b=new String("geeks");
        String c=b.intern();
        System.out.println();
        System.out.println(aa==b);
        System.out.println(b==c);
        System.out.println(c==aa);
        //isEmpty();
        System.out.println(b.isEmpty());
        //format();
        String g="geeks";
        String g1=String.format("%s:%d",g,67);
        System.out.println(g1);
        String g2=String.format("%s:%f","value of pi:",Math.PI);
        System.out.println(g2);
        //matches();
        System.out.println(s2);
        System.out.println("match 1:"+s2.matches("(.*)karma"));
        System.out.println("match 2:"+s2.matches("(.*)Shekhar(.*)"));
        System.out.println("match 3:"+s2.matches(".*a"));
        //case insensitive
        System.out.println("match 2:"+s2.matches("(?i)(.*)shekhar(.*)"));
        //regionMatches();
        System.out.println(s);
        System.out.println("region matching:"+s2.regionMatches(0,s,0,6));
        //split();
        g="geeks for geeks";
        System.out.println(g);
      //  System.out.println(s.split("//s+"));
        String[] geek=g.split("\\s+");
        for (String i:geek)
            System.out.println(i);
        //lenghth is limited now
        geek=g.split("\\s+",2);//this will print in 2 lines
        for (String i:geek)
            System.out.println(i);
        geek=g.split("\\s+",1);//this will print in 1 line
        for (String i:geek)
            System.out.println(i);
        //join();
        CharSequence cse=g;
        System.out.println(String.join(", ","geeks","for","geeeks"));
        //replaceAll();
        g1=g.replaceAll("geeks","fools");
        System.out.println(g1);
        //replaceFirst();
        g1=g.replaceFirst("geeks","fools");
        System.out.println(g1);
    }
}
