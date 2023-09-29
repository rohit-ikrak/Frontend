class ArraySum{
	public static void main(String[] args){
		int[] arr={12,22,31,21,23,45,64,56,89,89,98};
		int evensum = 0, oddsum = 0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]%2 == 0){
				evensum+=arr[i];
			}
			else if(arr[i]%2 != 0){
				oddsum+=arr[i];
			}
		}
		System.out.println(evensum + oddsum);
	}	
}