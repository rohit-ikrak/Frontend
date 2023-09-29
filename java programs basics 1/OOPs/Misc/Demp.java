class Demp{
	int a = 10;
	
	static int b = 100;
	
	static void m1(){
		System.out.println("this is a static method.");
	}
	
	void m2(){
		System.out.println(b);
	}
	
	public static void main(String[] args){
		Demp ob = new Demp();
		System.out.println(ob.a);
		ob.m2();
		System.out.println(b);
		m1();	
	}
}

//static method
// If we write anything inside a static function/ block, it becomes static automatically.
//We can only access static values inside static method/block.
//Static variable
