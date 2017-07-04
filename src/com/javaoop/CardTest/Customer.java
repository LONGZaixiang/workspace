package com.javaoop.CardTest;

public class Customer {

	public int score;
	public CardType cardType;
	
	
	public void changeScore(){
		
		switch(this.cardType.typeId){
		case 1:
			if(this.score>5000){
				this.score+=500;
				System.out.println("回馈500积分");
			}
			else
				System.out.println("对不起 普卡需要大于5000分");
			break;
		case 2:
			if(this.score>1000){
				
				this.score+=500;
				System.out.println("回馈500积分");
			}
			else
				System.out.println("对不起 金卡需要大于1000分");
				break;
			default:
		}
		
		
	}
	
	public void showMe(){
		System.out.println("我的卡类型是："+this.cardType.typeName+"\t我现在的积分是"+this.score);
		
		
	}
}
