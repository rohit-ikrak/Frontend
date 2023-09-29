import java.util.Scanner;
class Factorialoops{
	Scanner sc = new Scanner(System.in);
	//no arg with no return type
	void fact1(){
		int a, fact=1;
		System.out.println("Enter a number to find its factorial.");
		a = sc.nextInt();
		for(int i=a; i>1; i--){
			fact *= i;
		}
		System.out.println("Factorial of " + a + " is " + fact);
	}
	//arg with no return type
	void fact2(int a){
		int fact = 1;
		for(int i=a; i>1; i--){
			fact *= i;
		}
		System.out.println("Factorial of " + a + " is " + fact);
	}
	//no arg with return type
	int fact3(){
		int a, fact=1;
		System.out.println("Enter a number to find its factorial.");
		a = sc.nextInt();
		for(int i=a; i>1; i--){
			fact *= i;
		}
		return fact;
	}
	//arg with return type
	int fact4(int a){
		
		int fact=1;
		for(int i=a; i>1; i--){
			fact *= i;
		}
		return fact;
	}
	public static void main(String[] args){
		Factorialoops obj1 = new Factorialoops();
		obj1.fact1();
		obj1.fact2(6);
		int x = obj1.fact3();
		System.out.println("Factorial = " + x);
		int y = obj1.fact4(5);
		System.out.println("Factorial = " + y);
	}
}