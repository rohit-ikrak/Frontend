// super keyword can be used to access parent class method with the same name
// this keyword is used to access class variable outside method.
class A{
	int x = 10; 
	void m1(){
		int x = 100;
		this.x = 50;
		System.out.println(x);
		System.out.println(this.x);
	}
}
class B extends A{
	int x = 20;
	void m2(){
		int x = 200;
		System.out.println(this.x);
		System.out.println(x);
		System.out.println(super.x);		
	}
	
	public static void main(String[] args){
		B ob = new B();
		ob.m2();
	}
}
