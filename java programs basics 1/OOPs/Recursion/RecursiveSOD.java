class RecursiveSOD{
	int sum = 0;
	void sumofdigits(int x){
		int temp = x , rem;
		if(x>0){
			rem = x%10;
			sum = sum + rem;
			x = x/10;
			sumofdigits(x);
			if(x == 0){
				System.out.println(sum);
			}
		}		
	}
	
	public static void main(String[] args){
		RecursiveSOD r = new RecursiveSOD();
		r.sumofdigits(1298);
	}
}