//the values of the classes of parent classes will automatically be initialized 
// when we initialize the child class. ie. the constructor of parent class is created.
class A3{
	A3(){
		System.out.println("Hello A");
	}
}
class B extends A3{
	B(){
		System.out.println("Hello B");
	}
}
class C extends B{
	C(){
		System.out.println("Hello C");
	}
	public static void main(String[] args){
		new C();
	}
}