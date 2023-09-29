import java.util.Scanner;
class DoTable{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int a = sc.nextInt();
		int i=1;
		do{
			System.out.println(a + " * " + i + " = " +  a*i);
			i++;
		}while(i<11);
	}
}          
