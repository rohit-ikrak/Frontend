class RecursiveEx{
	int f = 1;
	void msg(int x){

		if(x>0){
			f=f*x;
			x--;
			msg(x);
		}
		else{
			System.out.println("Factorial = " + f);
		}
	}
	
	public static void main(String[] args){
		RecursiveEx r = new RecursiveEx();
		r.msg(5);
	}
}