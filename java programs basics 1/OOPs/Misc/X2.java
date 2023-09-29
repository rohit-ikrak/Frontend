//final class cannot be inherited from super class.
final class A{
    void m1(){
        System.out.println("Hello class A");
    }
}
class X2 extends A {
    void m1(){
        super.m1();
        System.out.println("Hello class X1");
    }
    public static void main(String[] args) {
        X2 a = new X2();
        a.m1();
    }
}
