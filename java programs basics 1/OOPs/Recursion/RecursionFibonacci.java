class RecursionFibonacci{
	int i = 10;
	void fibonacci(int x, int y){
		if(i>0){
			System.out.print((x+y)+" ");
			int temp = x;
			x = y;
			y = temp+x;
			i--;
			fibonacci(x, y);
		}
	}
	
	public static void main(String[] args){
		RecursionFibonacci r = new RecursionFibonacci();
		r.fibonacci(0,1);
	}
}