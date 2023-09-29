import java.util.Scanner;
class DoPrime{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int a = sc.nextInt();
		int i = 2, temp = 0, c = 1;
		do{
			if(a%i == 0){
				temp++;
			}
			i++;
		}while(i<a);
		if(temp==0){
			System.out.println(a + " is Prime.");
		}
		else{
			System.out.println(a + " is NOT Prime.");
		}
	}
}          
