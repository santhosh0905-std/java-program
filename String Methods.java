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
