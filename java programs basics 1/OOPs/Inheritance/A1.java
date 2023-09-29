//this and super keywords donot work with non-static methods and variables.
class A1{
	static int x = 10; 
	static void m1(){
		int x = 100;
		this.x = 50;
		System.out.println(x);
		System.out.println(this.x);
	}
}
class B extends A1{
	static int x = 20;
	static void m2(){
		int x = 200;
		System.out.println(this.x);
		System.out.println(x);
		System.out.println(super.x);		
	}
	
	public static void main(String[] args){
		B ob = new B();
		ob.m1();
		ob.m2();
	}
}
