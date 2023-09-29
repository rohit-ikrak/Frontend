import java.util.Scanner;
class WhilePrime{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int i=2;
		int c=0;
		while(i<a){
			if(a%i == 0){
				c++;
			}
			i++;
		}	
		if(c == 0){
			System.out.println("Number is PRIME");
		}
		else {
			System.out.println("Number is NOT PRIME");
		}	
	}
}          