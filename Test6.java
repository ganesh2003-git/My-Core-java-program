
/*
class  Emp
{
	int eno;
	String ename;
	double esal;
	String dept;
	
}
class Company 
{
	void display (Emp e){
		System.out.println(" e.eno\t:"+e.eno);
		System.out.println(" e.ename\t:"+e.ename);
		System.out.println(" e.esal\t:"+e.sal);
		System.out.println(" e.dept\t:"+e.dept);
	}
	void annSal(Emp e){
		System.out.println(e.ename+"s annual salary is:"+(e.sal  * 12));
	}
	void increaseSal(Emp e,int perc){
		e.sal=e.sal+(e.sal*perc/100);
	}
}
*/
class Test6 
{
	public static void main(String[] args) 
	{
		Emp e1=new Emp();
		e1.eno =101;
		e1.ename ="HK";
		e1.esal =1000;
		e1.dept ="CJ";
		System.out.println("Emp object is create and inialized with HK value");
		
		Company c1=new Company();
		System.out.println("e1 object value");
		c1.annSal(e1);
		
		System.out.println(e1.ename+"s old monthly salary:"+e1.esal);
		c1.increaseSal(e1,20);
		System.out.println(e1.ename+"s updated monthly salary:"+e1.esal);
		
	}
}
