class RecursionTable{
	int temp = 1;
	void table(int x){
		if(temp < 11){
			System.out.println(x + " * " + temp + " = " + x*temp);
			temp++;
			table(x);
		}
	}
	
	public static void main(String[] args){
		RecursionTable r = new RecursionTable();
		r.table(7);
	}
}