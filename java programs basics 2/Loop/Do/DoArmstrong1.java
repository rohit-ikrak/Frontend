class DoArmstrong1{
	public static void main(String[] args){
		int i =100;
		do{
			int temp = i, soc = 0, digit = 0;
			do{
				digit = temp%10;
				soc = soc + digit*digit*digit;
				temp = temp/10;
			}while(temp>0);
			if(i == soc){
				System.out.println(i);
			}
			 i++;
		}while(i<1000);
	}	
}