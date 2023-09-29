import java.util.Scanner;
class Demo1{
	public static void main(String args[]){
		//int a= 10;
		//int b= 20;
		//int c= a+b;
		//System.out.println(c);
		//System.out.println('c'+50);
		//System.out.println("c"+50);
		//System.out.println(a+"+"+b+"="+ c);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int _a = sc.nextInt();
		System.out.println("Enter second number: ");	
		int _b = sc.nextInt();
		System.out.println("sum of the given numbers is: "+(_a+_b));
	}
}