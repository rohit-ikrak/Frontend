class MultiArraySum{
	public static void main(String[] args){
		int[][] arr={ {1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int oddsum = 0, evensum = 0, sum = 0;
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				if(arr[i][j]%2 == 0){
					evensum += arr[i][j];
				}
				else{
					oddsum += arr[i][j];
				}
			}
		}
		sum = evensum + oddsum;
		System.out.println("sum of the elements is : " + sum);
		System.out.println("sum of the odd elements is : " + oddsum);
		System.out.println("sum of the even elements is : " + evensum);
		
	}	
}