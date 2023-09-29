import java.util.Scanner;
class ForPalindrome2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		
		for(int i = 10; i<101; i++){
			int rev = 0, rem = 0, temp = i;
			for( ; temp>0; ){
				rem = temp%10;
				rev = rev*10 + rem;
				temp = temp/10;
			}
			if(i == rev){
				System.out.println(i);
			}
			
		}
	}
}          