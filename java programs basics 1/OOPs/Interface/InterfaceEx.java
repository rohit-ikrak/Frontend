interface A{
    int a = 5;  // public static final int a = 5
    void m1(); // public abstract void m1()
}
class InterfaceEx implements A{
    public void m1(){
        int b = a+10;
        System.out.println(b);
        System.out.println("Hello Abstract class");
    }
    public static void main(String[] args){
        InterfaceEx ob = new InterfaceEx();
        ob.m1();
    }
}