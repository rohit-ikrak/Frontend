import java.util.Scanner;
class ForExample{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		
		for(int i=1;i<11;i++){
			System.out.println(a*i);	
		}
	}
}          