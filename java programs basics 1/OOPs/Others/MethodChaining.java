class MethodChaining{

	MethodChaining(){
		method3();
	}

	void method1(){
		method2();
		System.out.println("inside method1");
	}
	void method2(){
		System.out.println("inside method2");
	}
	void method3(){
		method1();
		System.out.println("inside method3");		
	}
	
	public static void main(String[] args){
		MethodChaining m = new MethodChaining();
		
	}
}