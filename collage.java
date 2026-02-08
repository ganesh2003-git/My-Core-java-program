 //collage.java
 class Collage 
{
	public static void main(String[] args) 
	{
		//two instances are create from class Student
		Student s1 =new Student();
		Student s2 =new Student();
		System.out.println("Two instances are create for Hk and BK object");
		
		//storing object hk and bk valus in above instance
		
		
		s1.sno     =101;
		s1.sname   ="HK";
		s1.cource  ="CJ";
		s1.fee     =1000;
		System.out.println("\n s1 instance is initialized with HK value");
		s2.sno     =101;
		s2.sname   ="BK";
		s2.cource  ="C";
		s2.fee     =2000;
		System.out.println("s2 instance is initialized with BK value");
		System.out.println("---------------------------------------");
		
		System.out.println("\ns1 oject value");
		System.out.println("s1.sno:"+s1.sno);
		System.out.println("s1.sname:"+s1.sname);
		System.out.println("s1.cource:"+s1.cource);
		System.out.println("s1.fee:"+s1.fee);
		
		
		System.out.println("-----------------------------------------");
		
		System.out.println("\ns2 oject value");
		System.out.println("s2.sno:"+s2.sno);
		System.out.println("s2.sname:"+s2.sname);
		System.out.println("s2.cource:"+s2.cource);
		System.out.println("s2.fee:"+s2.fee);
		
		
	}
}
