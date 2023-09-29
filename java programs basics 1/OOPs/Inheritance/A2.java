// we can also use super keyword to access method in parent class with the same name 
class A2{
	 
	void m1(){
		System.out.println("Hello ");
	}
}
class B extends A2{
	
	void m1(){
		super.m1();
		System.out.println(" JAVA");		
	}
	
	public static void main(String[] args){
		B ob = new B();
		ob.m1();
	}
}
