// no argument with return type
class TestFactorial1{
	int factorial(){
		int x = 5;
		int fact = 1;
		while(x>1){
			fact*=x;
			x--;
		}
		return fact;
	}
	public static void main(String[] args){
		TestFactorial1 t = new TestFactorial1();
		int a = t.factorial();
		System.out.println(a);
	}
}