class ConstructorEx{
	int x = 10;
	ConstructorEx(){
		System.out.println("Hello KVCH");
		this.x = 100;
	}
	
	ConstructorEx(int x){
		if(x%2==0){
			System.out.println("even");
		}
		else{
			System.out.println("odd");
		}
	}
	
	ConstructorEx(int x, int y){
		if(x>y){
			System.out.println("x is larger");
		}
		else if(x<y){
			System.out.println("y is larger");
		}
		else{
			System.out.println("both are equal");
		}
	}
	
	void m1(){
		System.out.println("Hello JAVA.");
		System.out.println(x);
	}
	
	public static void main(String[] args){
		ConstructorEx a = new ConstructorEx();
		a.m1();
		new ConstructorEx();
		new ConstructorEx(6);
		new ConstructorEx(3,4);
	}
}