import java.util.Scanner;
class WhilePrime2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		int i = 2;
		while(i<51){
			int j = 2;
			int c = 0;
			while(j<i){
				if(i%j==0){
					c++;	
				}	
				j++;
			}
			if(c == 0){
				System.out.println(i);
			}
			i++;	
		}
	}
}          