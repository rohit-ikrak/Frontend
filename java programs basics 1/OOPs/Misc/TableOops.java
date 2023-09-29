import java.util.Scanner;
class TableOops{
	Scanner sc = new Scanner(System.in);
	//no arg with no return type
	void table1(){
		int a;
		System.out.println("Enter a number: ");
		a = sc.nextInt();
		for(int i = 1; i<11; i++){
			System.out.println(a + " * " + i + " = " + a*i);
		}
	}
	//arg with no return type
	void table2(int a){
		for(int i = 1; i<11; i++){
			System.out.println(a + " * " + i + " = " + a*i);
		}
	}
	//no arg with return type
	int[] table3(){
		int[] x = new int[10];
		int a;
		System.out.println("Enter a number: ");
		a = sc.nextInt();
		
		for(int i = 0; i<10; i++){
			x[i]= a*(i+1);
		}
		return x;
	}
	//arg with return type
	int[] table4(int a){
		int[] x = new int[10];
		
		for(int i = 0; i<10; i++){
			x[i]= a*(i+1);
		}
		return x;	
	}
	public static void main(String[] args){
		TableOops obj1 = new TableOops();
		obj1.table1();
		
		int[] y = new int[10];
		System.out.println("The table below is printed using argument with no return type.");
		y = obj1.table4(5);
		System.out.println("The table below is printed using argument with return type.");
		for(int i=0;i<10;i++){
			System.out.println(y[i]);
		}
		System.out.println("The table below is printed using argument with no return type.");		
		obj1.table2(6);
		System.out.println("The table below is printed using no argument with return type.");		
		int[] x = new int[10];
		x = obj1.table3();
		for(int i=0;i<10;i++){
			System.out.println(x[i]);
		}
	}
}