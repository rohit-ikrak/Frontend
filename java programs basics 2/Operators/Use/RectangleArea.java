import java.util.Scanner;
class RectangleArea{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the sides of the rectangle: ");
		double side1 = sc.nextInt();
		double side2 = sc.nextInt();
		double area = side1*side2;
		System.out.println("Area of the ractangle is =  " + area);
		
	}
}
