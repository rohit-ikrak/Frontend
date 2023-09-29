import java.util.Scanner;
class DoReverse{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		int temp = a;
		int s=0;
		int rem;
		do{
			rem = temp%10;
			s = s*10 + rem;
			temp = temp/10; 
		}while(temp>0);
		
		System.out.println(" reverse of " +a +" is " + s);

		}
}          