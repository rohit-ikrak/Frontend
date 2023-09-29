import java.util.Scanner;
class DoPalindrome2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		int i = 10;
		do{
			int rev = 0;
 			int temp = i;
			int rem = 0;
			do{
				rem = temp%10;
				rev = rev*10 + rem;
				temp = temp/10;
			}while(temp>0);
			if(i == rev){
				System.out.println(i);
			}
			i++;	
		}while(i<101);
	}
}          