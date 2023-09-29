import java.util.Scanner;
class WhileDigitSum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int temp = a;
		int i=2;
		int s=0;
		while(a>0){
			int r = a%10;
			//s=s+r;
//			s=s*r;
			s=s*10 + r;
			a/=10;
		}		
//		System.out.println("The sum of all digits is: " + s);
//		System.out.println("The product of all digits is: " + s);
//		System.out.println("The reverse of the number is: " + s);
		if(temp == s){
			System.out.println(temp + " is a PALINDROME number.");
		}
		else{
			System.out.println(temp + " is NOT a PALINDROME number.");
		}
	}
}          

//a=123	 123	12		1
//s=0					
//r=a%	10	3	2		1
//s=s+r*r*r	27	27+8=35	1+35=36
//a=a/10	12	1		0		