import java.util.Scanner;
class WhileArmstrong{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int temp = a;
		int s=0;
		while(a>0){
			int r = a%10;
			s=s+r*r*r;
			a/=10;
		}		
		System.out.println(s);
		if(temp==s){
			System.out.println(temp + " is an Avogadro number.");
		}
		else{
			System.out.println(temp + " is NOT an Avogadro number.");
		}
	}
}          

//a=123	 	123	12		1                       153	15	1		370	37	3		371	37	3			
//s=0												
//r=a%10	 	3	2		1			3	5	1		0	7	3		1	7	3
//s=s+r*r*r	27	27+8=35	1+35=36		27	152	153		0	343	370 		1	344	371
//a=a/10		 12	1		0			15	1	0		37	3	0		37	3	0



//407		40	4
//7		0	4
//343		343	407
//40		4	0