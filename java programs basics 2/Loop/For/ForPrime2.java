import java.util.Scanner;
class ForPrime2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		for(int i = 2; i<51; i++){
			int c = 0;
			for(int j = 2; j<i; j++){
				if(i%j==0){
					c++;
				}
			}
			if(c == 0){
				System.out.println(i);
			}
		}
	}
}          