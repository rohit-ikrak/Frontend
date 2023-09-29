class AreaPoly{
	void Area(double radius){
		double area = 3.14*radius*radius;
		System.out.println("Area of circle = "+ area);
	}
	void Area(int length, int breadth){
		int area = length*breadth;
		System.out.println("Area of rectangle = "+ area);
	}
	void Area(double height, double base){
		double area = height*base/2;
		System.out.println("Area of triangle = "+ area);
	}
	public static void main(String[] args){
		AreaPoly obj = new AreaPoly();
		obj.Area(3.5);
		obj.Area(2,8);
		obj.Area(5.0,4.5);
		
	}
}