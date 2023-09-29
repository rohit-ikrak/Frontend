import java.util.Scanner;
class DoArmstrong{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int temp = num;
		int s=0;
		do{
			int r = num%10;
			s=s+r*r*r;
			num/=10;
		}while(num>0);
		if(temp == s){
			System.out.println(temp + " is an Armstrong number.");
		}	
		else{
			System.out.println(temp + " is NOT an Armstrong number.");
		}
	}
}