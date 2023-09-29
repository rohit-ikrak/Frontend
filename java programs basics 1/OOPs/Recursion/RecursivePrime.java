import java.util.Scanner;
class RecursivePrime{
	int i = 2, count = 0;
	void prime(int x){
		int temp = x;
		if(i<x){
			if(temp%i == 0){
				count++;
			}
			i++;
			prime(x);
		}
		if(count==0){
			System.out.println("The given value is Prime.");
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		RecursivePrime r = new RecursivePrime();
		System.out.println("Enter a number to check whether it is prime or not? ");
		int x = sc.nextInt();
		r.prime(x);
	}
}