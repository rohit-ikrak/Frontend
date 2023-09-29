import java.util.Scanner;
class ArraySearch{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr={1, 34, 89, 0, 7, 65, 54, 43, 43, 56, 8, 32};
		System.out.println("Enter the number to search in the array : ");
		int num = sc.nextInt();
		for(int i=0; i<arr.length; i++){
			if(arr[i] == num){
				System.out.println("Element found at " + (i+1) +"th position.");
				break;
			}
		}
		
	}	
}