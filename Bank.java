class Bank 
{
	public static void main(String[] args) 
	{
		Account g1=new Account();
		Account g2=new Account();
		
		System.out.println("Two instances are create for Hk and BK object");
		
		g1. bName = "HDFC";
		g1.  ifsc = "HDFC2403";
		g1. branch = "Pune";
	    g1.  aNum = 123412341234L;
	    g1. hName= "HK";
	    g1. blance= 500.12;
		System.out.println("\n s1 instance is initialized with HK value");
		
		g2. bName = "SBI";
		g2.  ifsc = "SBI00043";
		g2. branch = "Pune";
	    g2.  aNum = 000000124L;
	    g2. hName= "BK";
	    g2. blance= 4000;
		System.out.println("acc1 is create");
		System.out.println("\n g1 instance is initialized with HK value");
		System.out.println("--------------------------------");
		System.out.println("\ng1 oject value");
		System.out.println("g1.bName\t\t:"+g1.bName);
		System.out.println("g1.ifsc\t\t\t:"+g1.ifsc);
		System.out.println("g1.branch\t\t:"+g1.branch);
		System.out.println("g1.aNUm\t\t\t:"+g1.aNum);
		System.out.println("g1.hName\t\t:"+g1.hName);
		System.out.println("g1.blanc\t\t:"+g1.blance);
		
		System.out.println("\n g2 instance is initialized with HK value");
		System.out.println("--------------------------------");
		System.out.println("acc1 is create");
		System.out.println("\ng2 oject value");
		System.out.println("g2.bName\t\t:"+g1.bName);
		System.out.println("g2.ifsc\t\t\t:"+g1.ifsc);
		System.out.println("g2.branch\t\t:"+g1.branch);
		System.out.println("g2.aNUm\t\t\t:"+g1.aNum);
		System.out.println("g2.hName\t\t:"+g1.hName);
		System.out.println("g2.blance\t\t:"+g1.blance);
		
	}
}
