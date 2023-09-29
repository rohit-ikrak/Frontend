import java.util.Scanner;
class ForDigitProduct{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		int product =1;
		int temp = a;
		for( ; a>0; ){
			int digit = a%10;
			product = product*digit;
			a = a/10;
		}	
		System.out.println("Product of digits of " + temp +" is: " + product);	
	}
}          