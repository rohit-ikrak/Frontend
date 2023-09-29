class ForArmstrong1{
	public static void main(String[] args){
		for(int i =100; i<1000; i++){
			int temp = i, soc = 0, digit = 0;
			for( ; temp>0; ){
				digit = temp%10;
				soc = soc + digit*digit*digit;
				temp = temp/10;
			}
			if(i == soc){
				System.out.println(i);
			}
		}
	}	
}