class PolymorphismEx{
	void m1(){
		System.out.println("Hello World.");
	}
	void m1(int x){
		for(int i=1;i<10;i++){
			System.out.println(x*i);
		}
	}
	void m1(int x, int y){
		System.out.println("Sum = " + (x+y));
	}
	public static void main(String[] args){
		PolymorphismEx ob =  new PolymorphismEx();
		ob.m1();
		ob.m1(5);
		ob.m1(2,3);
		
	}
}