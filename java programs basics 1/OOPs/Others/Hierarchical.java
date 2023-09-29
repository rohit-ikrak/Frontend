class A{
	void m1(){
		System.out.print("Hello A ");
	}
}
class B extends A{
	void m2(){
		System.out.print("Hello B ");
	}
}
class C extends A{
	void m3(){
		System.out.print("Hello C ");
	}
}
class D extends C{
	void m4(){
		System.out.print("Hello D ");
	}
}
class E extends C{
	void m5(){
		System.out.print("Hello E ");
	}
	public static void main(String args[]){
		E e = new E();
		e.m5();
		e.m3();
		e.m1();
	}
}