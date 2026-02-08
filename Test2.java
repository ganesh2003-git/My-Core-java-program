//Below program createing primitive and 
//referenced variable with direct values and assigement
//and also with method calls

class Test2 
{
	public static void main(String[] args) 
	{
		//prmitive variable creation
		int p=50;
		int q=m1();
		
		//referience variable creation
		String s1="HK";
		String s2=new String("NiT");
		
		Example e1=new Example();
		Example e2=m2();
		
		System.out.println(p+""+q);
		System.out.println(s1+""+s2);
		System.out.println(e1+""+e2);
	}
	static int m1(){
		return 60;
	}
	static Example m2(){
		return new Example();
	}
}
