//Abstraction is implemented using abstract keyword 
//Abstract class is a class which has a abstract method inside it.
//Abstract method is a method that has no definition, and is only 
//used to name the method.
abstract class A4{
	void m1(){
		System.out.println("Hello Java");
	}
	abstract void m2();
	abstract void m3();
	}
class B extends A4{
	void m2(){
		System.out.println("Hello Python");
	}
	void m3(){
		// the method can be blank but must exist in child class.
	}
	
	public static void main(String[] args){
		B ob = new B();
		ob.m1();
		ob.m2();
		ob.m3();
	}
}