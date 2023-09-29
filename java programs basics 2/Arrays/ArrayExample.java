class ArrayExample{
	public static void main(String[] args){
		int[] arr={1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6};
		System.out.println(arr[2]);
		System.out.println(arr[4]);
		System.out.println(arr[7]);
		System.out.println(arr[12]);
		int i=0;
		while(i<arr.length){
			System.out.print(arr[i] + "  ");
			i++;
		}

		System.out.println();
		i = 0;
		do{
			System.out.print(arr[i] + "  ");
			i++;
		}while(i<arr.length);

		System.out.println();
		
		for(i=0; i<arr.length; i++){
			System.out.print(arr[i] + "  ");
		}
	}	
}