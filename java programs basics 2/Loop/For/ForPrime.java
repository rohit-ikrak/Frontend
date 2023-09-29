import java.util.Scanner;
class ForPrime{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		int c=0;
		for(int i=1;i<11;i++){
			if(a%2 == 0){
				c++;
			}	
		}
		if(c==0){
			System.out.println(a + " is Prime.");
		}
		else{
			System.out.println(a +" is NOT Prime.");
		}

		
	}
}          