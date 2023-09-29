// argument with no return type
class TestFactorial1{
	void factorial(int x){
		int fact = 1;
		while(x>1){
			fact*=x;
			x--;
		}
		System.out.println(fact);
	}
	public static void main(String[] args){
		TestFactorial1 t = new TestFactorial1();
		t.factorial(5);
		
	}
}