import java.util.Scanner;
class ForDigitSum2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		int sum =0;
		for(; a>0; a=a/10){
			int r = a%10;
			sum = sum+r; 
		}	
		System.out.println("Sum of digits of " + a +" is: " + sum);	
	}
}          