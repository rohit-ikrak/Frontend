import java.util.Scanner;
class TriangleArea{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the height and base of the triangle: ");
		double height = sc.nextInt();
		double base = sc.nextInt();
		double area = height*base/2;
		System.out.println("Area of the triangle is =  " + area);
		
	}
}
