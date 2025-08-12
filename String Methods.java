import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner data=new Scanner(System.in);
        System.out.println("String:");
        String s=data.nextLine();
        char so=s.charAt(0);
        System.out.println("charAt():"+so);
        int s1=s.codePointAt(0);
        System.out.println("codePointAt():"+s1);
        int s2=s.codePointBefore(1);
        System.out.println("codePointBefore():"+s2);
        
    }
}
import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner data=new Scanner(System.in);
        System.out.println("String:");
        String s=data.nextLine();
        int so=s.codePointCount(0,4);
        System.out.println("codePointCount():"+so);
        System.out.println("String2:");
        String so1=data.nextLine();
        int sr=s.compareTo(so1);
        System.out.println(sr);
        
        
    }
}

import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner data=new Scanner(System.in);
        System.out.println("String1:");
        String s1=data.nextLine();
        System.out.println("String2:");
        String s2=data.nextLine();
        int so=s1.compareToIgnoreCase(s2);
        System.out.println("compareToIgnoreCase():"+so);
        String sr=s1.concat(s2);
        System.out.println("concat():"+sr);
        
        
    }
}

import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner data=new Scanner(System.in);
        System.out.println("original string(os):");
        String os=data.nextLine();
        System.out.println("copy of os:");
        String cs=data.nextLine();
        System.out.println(os.contains(cs));
        System.out.println(os.contentEquals(cs));
    }
}

import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner data=new Scanner(System.in);
        System.out.println("original string(os):");
        String os=data.nextLine();
        System.out.println("copy of os(cs):");
        String cs=data.nextLine();
        System.out.println("equalsIgnoreCase():"+os.equalsIgnoreCase(cs));
        String f ="This is %s I'm %d years old.";
        System.out.println("sname:");
        String sn=data.nextLine();
        System.out.println("sage:");
        int sa=data.nextInt();
        String result = String.format(f,sn,sa);
        System.out.println("format():"+result);
    }
}

import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner data=new Scanner(System.in);
        String n="Santhosh";
        byte[]b=n.getBytes();
        System.out.println("Avalue:”+b[1]);
        System.out.println("Hashcode:"+n.hashCode());
    }
}

class Main{
    public static void main(String[]args){
        String s="santhosh";
        System.out.println(s.indexOf("h"));
    }
}

class Main{
    public static void main(String[]args){
        String n=String.join("Anbu"," ","Sotta");
        System.out.println(n);
    }
}
