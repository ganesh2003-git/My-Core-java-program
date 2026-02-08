class Company 
{
	void display (Emp e){
		System.out.println(" e.eno\t:"+e.eno);
		System.out.println(" e.ename\t:"+e.ename);
		System.out.println(" e.esal\t:"+e.esal);
		System.out.println(" e.dept\t:"+e.dept);
	}
	void annSal(Emp e){
		System.out.println(e.ename+"s annual salary is:"+(e.esal  * 12));
	}
	void increaseSal(Emp e,int perc){
		e.esal=e.esal+(e.esal * perc /100);
	}
}
