// multilevel inheritance in interface
interface A{
    void abc();
}
interface B extends A{
    void bcd();
}
class Interface1 implements B{
    public void abc(){
        System.out.println("abcd");
    }
    public void bcd(){
        System.out.println("bcder");
    }
    public static void main(String[] args){
        Interface1 a = new Interface1();
        a.abc();
        a.bcd();
    }
}