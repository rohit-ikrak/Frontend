import java.util.Scanner;
class SimpleInterest{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the principle amount: ");
		double p = sc.nextInt();
		System.out.println("Enter the rate of interest: ");
		double r = sc.nextInt();
		System.out.println("Enter the time limit: ");
		double t = sc.nextInt();
		
		double si = p*r*t/100;
		System.out.println("Simple Interest  is =  " + si);
		
	}
}
