class RecursiveArmstrong{
	int cubesum = 0, x=153, temp = x;
	void sumofcube(){
		int rem;
		if(x>0){
			rem = x%10;
			cubesum = cubesum + rem*rem*rem;
			x = x/10;
			sumofcube();
			System.out.println(" ");
		}		
		else{
			if(temp == cubesum){
				System.out.println(temp + " is an Armstrong Number.");
			}
			else{
				System.out.println(temp + " is not an Armstrong Number.");
			}
		}
	}
	
	public static void main(String[] args){
		RecursiveArmstrong r = new RecursiveArmstrong();
		r.sumofcube();
	}
}