import java.util.Scanner;
class WhilePalindrome2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		int i = 10;
		while(i<101){
			int rev = 0;
 			int temp = i;
			int rem = 0;
			while(temp>0){
				rem = temp%10;
				rev = rev*10 + rem;
				temp = temp/10;
			}
			if(i == rev){
				System.out.println(i);
			}
			i++;	
		}
	}
}          