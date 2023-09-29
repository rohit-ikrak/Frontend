class RecursivePOD{
	int prod = 1;
	void productofdigits(int x){
		int temp = x , rem;
		if(x>0){
			rem = x%10;
			prod = prod * rem;
			x = x/10;
			productofdigits(x);
			if(x == 0){
				System.out.println(prod);
			}
		}		
	}
	
	public static void main(String[] args){
		RecursivePOD r = new RecursivePOD();
		r.productofdigits(1298);
	}
}