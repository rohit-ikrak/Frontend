//final method cannot be overridden by derived classes.
class A{
    final void m1(){
        System.out.println("Hello class A");
    }
}
public class X1 extends A {
    // void m1(){
    //     super.m1();
    //     System.out.println("Hello class X1");
    // }
    public static void main(String[] args) {
        X1 a = new X1();
        a.m1();
    }
}
