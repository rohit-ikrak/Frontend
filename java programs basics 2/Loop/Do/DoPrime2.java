import java.util.Scanner;
class DoPrime2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		int i = 2;
		do{
			int j = 2;
			int c = 0;
			do{
				if(i%j==0){
					c++;	
				}	
				j++;
			}while(j<i);
			if(c == 0){
				System.out.println(i);
			}
			i++;	
		}while(i<51);
	}
}          