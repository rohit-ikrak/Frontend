class MultiArrayPrime{
	public static void main(String[] args){
		int[][] arr={ {1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int oddsum = 0, evensum = 0, sum = 0;
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				int c=0;
				for(int k=2; k<arr[i][j]; k++){
					if(arr[i][j]%k == 0 && arr[i][j] != 1){
						c++;
					}
					
				}
				if(c==0){
					System.out.println(arr[i][j]);
				}	
			}	
		}	
	}
}