interface A{
    void m1();
}
interface B{ 
    void m2();
}
public class Interface2 implements A, B{
    public void m1(){
        System.out.println("XYZ");
    }
    public void m2(){
        System.out.println("ABC");
    }
    public static void main(String[] args){
        Interface2 a = new Interface2();
        a.m1();
        a.m2();
    }    
}
