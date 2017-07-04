package practise;

public class exercise02 {
public static void main(String[] args) {
	
	Administrator admin=new Administrator();
	admin.name="admin1";
	admin.password="111111";
	
	System.out.println("姓名:"+admin.name+"密码："+admin.password);
	
	Customer cus=new Customer();
	cus.cardType="普卡";
	cus.sc=1000;
	
	cus.show();
	
}
}
