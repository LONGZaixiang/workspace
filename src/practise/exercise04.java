package practise;

import java.util.Scanner;

public class exercise04 {
public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	
	Customer cus=new Customer();
	System.out.println("请输入您的积分");
	cus.sc=scan.nextInt();
	System.out.println("请输入卡的类型 p为普卡 g为金卡");
	cus.cardType=scan.next();
	
	switch (cus.cardType){
	
	case "p":
		if(cus.sc>5000)
		System.out.println("回馈积分：500分");
		else
			System.out.println("对不起 普卡需要大于5000分才有回馈");
		break;
	case "g":
		if(cus.sc>1000)
			System.out.println("回馈积分：500分");
			else
				System.out.println("对不起 金需要大于1000分才有回馈");
			break;
	default:
		System.out.println("请输入正确的卡类型");
	}
	
	scan.close();
}
}
