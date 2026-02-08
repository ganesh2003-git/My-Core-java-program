class Example1 
{
	static int a=10;
	
	static{
		System.out.println("From SB");
		System.out.println("a:"+a);
		//System.out.println("b:"+ b);
		System.out.println("b:"+Example1. b);
	}
	
		
		
	public static void main(String[] args) 
	{
		System.out.println("From MM");
		System.out.println("a:"+a);
		//System.out.println("b:"+Example1. b);
	}
	static int b=20;
	static{
		System.out.println("Ex SB2");
}
static int c=30;
}

