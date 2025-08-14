class LCU{
    void sound(){
        System.out.println("Movies Under LCU");
    }
}
class kaithi extends LCU{
    void sound(){
        System.out.println("Kaithi");
    }
}
class vikram extends LCU{
    void sound(){
        System.out.println("Vikram");
    }
}
class leo extends LCU{
    void sound(){
        System.out.println("Leo");
    }
}
public class Main{
    public static void main(String[]args){
        LCU a;
        a=new LCU();
        a.sound();
        
        a=new kaithi();
        a.sound();
        
        a=new vikram();
        a.sound();
        
        a=new leo();
        a.sound();
    }
}



import java.util.Scanner;
class Fam{
    static Scanner data=new Scanner(System.in);
    void sound(){
        System.out.println("Family detail");
    }
}
class gf extends Fam{
    void sound(){
        System.out.println("GF Name:");
        String gf=data.nextLine();
        System.out.println("GrandFather Name:"+gf);
    }
}
class gm extends Fam{
    void sound(){
        System.out.println("GM name:");
        String gm=data.nextLine();
        System.out.println("GrandMother Name:"+gm);
    }
}
class f extends Fam{
    void sound(){
        System.out.println("F name:");
        String f=data.nextLine();
        System.out.println("Father Name:"+f);
    }
}
class m extends Fam{
    void sound(){
        System.out.println("M name:");
        String m=data.nextLine();
        System.out.println("Mother Name:"+m);
    }
}
class myn extends Fam{
    void sound(){
        System.out.println("MY name:");
        String myn=data.nextLine();
        System.out.println("My Name:"+myn);
    }
}
public class Main{
    public static void main(String[]args){
        Fam a;
        a=new Fam();
        a.sound();
        
        a=new gf();
        a.sound();
        
        a=new gm();
        a.sound();
        
        a=new f();
        a.sound();
        
        a=new m();
        a.sound();
        
        a=new myn();
        a.sound();
    }
}
