class ArrayOddPlaceSum{
	public static void main(String[] args){
		int[] arr={12,22,31,21,23,45,64,56,89,89,98};
		int oddplacesum = 0;
		for(int i=0; i<arr.length; i++){
			if(i%2 == 1){
				oddplacesum+=arr[i];
			}
		}
		System.out.println(oddplacesum);
	}	
}