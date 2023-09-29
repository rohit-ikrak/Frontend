import java.util.Scanner;
class MultiArrayPrimeNo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[][] arr=new int[3][3];
		int sum = 0;
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				arr[i][j] = sc.nextInt();	
			}
		}
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				int c = 0;
				for(int k = 2; k<arr[i][j]; k++){
					if(arr[i][j]%k == 0){
						c++;
					}
				}
				if(c == 0){
					sum+=arr[i][j];
					System.out.println(arr[i][j] + " is Prime.");
				}
			}		
		}	
		System.out.println("Sum of all the prime numbers is : " + sum);
	}
}