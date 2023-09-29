// argument with return type
class TestFactorial1{
	int factorial(int x){
		int fact = 1;
		while(x>1){
			fact*=x;
			x--;
		}
		return fact;
	}
	public static void main(String[] args){
		TestFactorial1 t = new TestFactorial1();
		int a = t.factorial(5);
		System.out.println(a);
	}
}