class ArrayPrime{
	public static void main(String[] args){
		int[] arr={12,22,31,21,23,45,64,56,89,89,98};
		int primesum = 0;
		for(int i=0; i<arr.length; i++){
			int c=0;
			for(int j=2; j<arr[i]; j++){
				if(arr[i]%j == 0){
					c++;
				}
			}
			if(c==0){
				System.out.println(arr[i]);
				primesum+=arr[i];
			}	
		}
		System.out.println(primesum);
		
	}	
}