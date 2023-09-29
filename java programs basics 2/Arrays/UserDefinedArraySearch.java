import java.util.Scanner;
class UserDefinedArraySearch{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];

		for(int i=0; i< 10; i++){
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the value to search in the array.");
		int num = sc.nextInt();

		for(int i=0; i< 10; i++){
			if(arr[i] == num){
				System.out.println("Element found");	
				return;
			}
		}
	}
}