 class Demo{
private int account;
private String name;
private char customer;

public void setAccount(int a){
	this.account= a;
}
public int getAccount(){
	return account;
}
public void setName(String s){
	this.name=s;
}
public String getName(){
	 return name;
}
public void setCustomer(char c){
	this.customer = c;
}
public char getCustomer() {
        return customer;
}
		
public void run(){
	System.out.println(account +" " + name +" " + customer);
}

}

public class Encapsulation{
	public static void main(String []args){
		Demo d1=new Demo();
		d1.setAccount(123);
		d1.setName("HDFC");
		d1.setCustomer('a');
		d1.run();
	}

}



	