import java.util.Scanner;
class EvenOddOops{
	Scanner sc = new Scanner(System.in);
	//no arg with no return type
	void evenOdd1(){
		int a, fact=1;
		System.out.println("Enter a number: ");
		a = sc.nextInt();
		if(a%2 == 0){
			System.out.println("Even");
		}
		else{
			System.out.println("Odd");
		}
	}
	//arg with no return type
	void evenOdd2(int a){
		if(a%2 == 0){
			System.out.println("Even");
		}
		else{
			System.out.println("Odd");
		}
	}
	//no arg with return type
	int evenOdd3(){
		int a, fact=1;
		System.out.println("Enter a number: ");
		a = sc.nextInt();
		if(a%2 == 0){
			return 0;
		}
		else{
			return 1;
		}
	}
	//arg with return type
	int evenOdd4(int a){
		
		if(a%2 == 0){
			return 0;
		}
		else{
			return 1;
		}
	}
	public static void main(String[] args){
		EvenOddOops obj1 = new EvenOddOops();
		obj1.evenOdd1();
		
		obj1.evenOdd2(6);
		
		int x = obj1.evenOdd3();
		if(x == 0){
			System.out.println("Even.");
		}
		else{
			System.out.println("Odd.");
		}
		
		int y = obj1.evenOdd4(5);
		if(y == 0){
			System.out.println("Even.");
		}
		else{
			System.out.println("Odd.");
		}
	}
}