package com.javaoop.CardTest;



public class Test {
public static void main(String[] args) {
	
	CardType ct=new CardType();
	
	
	ct.typeId=2;
	ct.typeName="金卡";
	
	Customer cus=new Customer();
	
	cus.score=2000;
	cus.cardType=ct;
	
	cus.showMe();
	
	cus.changeScore();
	
	cus.showMe();
	
	
	
	
	
}
}
