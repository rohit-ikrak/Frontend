class WhileArmstrong1{
	public static void main(String[] args){
		int i =100;
		while(i<1000){
			int temp = i, soc = 0, digit = 0;
			while(temp>0){
				digit = temp%10;
				soc = soc + digit*digit*digit;
				temp = temp/10;
			}
			if(i == soc){
				System.out.println(i);
			}
			 i++;
		}
	}	
}