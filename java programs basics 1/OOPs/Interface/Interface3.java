// hybrid inheritance using interface
interface A{
    void m1();
}
interface B extends A{
    void m2();
}
interface C extends A{
    void m3();
}
interface D extends C{
    void m4();
}
interface E extends C{
    void m5();
}
public class Interface3 implements E{
    public void m1(){
        System.out.println("m1");
    }
    public void m2(){
        System.out.println("m2");
    }
    public void m3(){
        System.out.println("m3");
    }
    public void m4(){
        System.out.println("m4");
    }
    public void m5(){
        System.out.println("m5");
    }
    public static void main(String[] args){
        Interface3 a = new Interface3();
        a.m1();
        a.m2();
        a.m3();
        a.m4();
        a.m5();
    }
}
