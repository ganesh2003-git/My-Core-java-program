class Example2 
{
	static int a=10;
	int   x=20;
	static void m1(){
		System.out.println("m1 method is executed");
		System.out.println("a:"+a);
		System.out.println("x:"+ new Example().x);
	}
	void m2(){
		System.out.println("m2 method is executed");
		System.out.println("a:"+a);
		System.out.println("x:"+x);
	}
}


class Test4 
{
	public static void main(String[] args) 
	{
		Example2.m1();
		Example2 e1=new Example2();
		e1.m2();
	}
}
