class BitwiseLogical{
	public static void main(String args[]){
		
		//LOGICAL OPERATOR

		//boolean a=true, b=false;
		
		//System.out.println(a&&b);	//(logocal AND)  False
		
		//System.out.println(a&&a);	 //True
		
		//System.out.println(b&&b);	//False
		
		//System.out.println(a||b);	//(logical OR) True
		
		//System.out.println(a||a);	//True
		
		//System.out.println(b||b);	//False
		
		//System.out.println(!a);		//(Logical NOT) False	
		
		//System.out.println(!b);		//True
		
		//BITWISE OPERATOR

		int x=3, y=4, u=35, z=2;

		System.out.println(x&y);	//BITWISE AND
		System.out.println(x|y);	//BITWISE OR
		System.out.println(x^y);	//BITWISE XOR	
		System.out.println(~z);	//Complement
		System.out.println(~u);	//Complement
		System.out.println(x<<y);	//Left shift	
		System.out.println(u>>z);	//Right Shift

	}
}