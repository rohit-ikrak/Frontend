import java.util.Scanner;
class ArmstrongOops{
	Scanner sc = new Scanner(System.in);
	//no arg with no return type
	void method1(){
		int a, cubesum = 0;
		System.out.println("Enter a number: ");
		a = sc.nextInt();
		int temp = a;
		int b;
		while(temp>0){
			b = temp%10;
			cubesum += b*b*b; 
			temp = temp/10;
		}
		if(cubesum == a){
			System.out.println("Armstrong Number.");
		}
		else{
			System.out.println("Not an Armstrong number.");
		}
	}
	//arg with no return type
	void method2(int a){
		int temp = a;
		int b, cubesum = 0;
		while(temp>0){
			b = temp%10;
			cubesum += b*b*b; 
			temp = temp/10;
		}
		if(cubesum == a){
			System.out.println("Armstrong Number.");
		}
		else{
			System.out.println("Not an Armstrong number.");
		}
	}
	//no arg with return type
	int method3(){
		int a, cubesum = 0;
		System.out.println("Enter a number: ");
		a = sc.nextInt();
		int temp = a;
		int b;
		while(temp>0){
			b = temp%10;
			cubesum += b*b*b; 
			temp = temp/10;
		}
		if(cubesum == a){
			return 0;
		}
		else{
			return 1;
		}
	}
	//arg with return type
	int method4(int a){
		int temp = a;
		int b, cubesum = 0;
		while(temp>0){
			b = temp%10;
			cubesum += b*b*b; 
			temp = temp/10;
		}
		if(cubesum == a){
			return 0;
		}
		else{
			return 1;
		}
	}
	public static void main(String[] args){
		ArmstrongOops obj1 = new ArmstrongOops();
		obj1.method1();
		
		obj1.method2(6);
		
		int x = obj1.method3();
		if(x == 0){
			System.out.println("Armstrong Number.");
		}
		else{
			System.out.println("Not an Armstrong number.");
		}
		
		int y = obj1.method4(5);
		if(y == 0){
			System.out.println("Armstrong Number.");
		}
		else{
			System.out.println("Not an Armstrong number.");
		}
	}
}