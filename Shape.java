interface Shape{
	abstract void findArea();
{
	class Rentagle implements Shape
	{
		double l,b;
		
		public void findArea(){
			System.out.println("findArea() method is execute from Rentagle");
			System.out.println("Rentagle Area:"+ (l*b));
	}
}

class Square implements Shape{
	double s;
	public void findArea(){
		System.out.println("findArea() method is execute from Square");
			System.out.println("Sqare Area:"+ (s*s));
	}
}
class Square implements Circle{
 static final double PI=3.14;
	public void findArea(){
		System.out.println("findArea() method is execute from Square");
			System.out.println("Circle Area:"+ (PI*r*r));
	}
}
