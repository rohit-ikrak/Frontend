class OOPS{
	//No argument with no return type.
	void msg(){
		System.out.println("HELLO JAVA");
	}
	//Argument with no return type.
	void sum(int x, int y){
		int z = x + y;
		System.out.println("sum = " + z);
	}
	//No Argument with return type.
	String kvch(){
		return "Hello KVCH";
	}
	//Argument with return type.
	int osum(int x, int y){
		int z = x + y;
		return z;
	}
	static void m2(){
		//Just an Example.
	}
	void m1(){
		//Just another Example.
	}
	public static void main(String[] args){
		OOPS obj = new OOPS();
		obj.msg();
		obj.sum(12, 28);
		String kvch = obj.kvch();
		int s = obj.osum(13,27);
		System.out.println(kvch);
		System.out.println(s);
		m2();
		OOPS obj1 = new OOPS();
		obj1.m1();
		System.out.println("asdf");
		
		obj.m2();
		System.out.println("afsddsg");
		
		
	}
	
}