package practise;

import java.util.Scanner;

public class exercise05 {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		ScoreCalc sc=new ScoreCalc();
		
		System.out.println("请输入java成绩：");
		sc.java=scan.nextInt();
		System.out.println("请输入C#成绩：");
		sc.c=scan.nextInt();
		System.out.println("请输入DB成绩：");
		sc.db=scan.nextInt();
		
		sc.calcTotalScore();
		sc.showTotalScore();
		sc.calcAvg();
		sc.showAvg();
		
		scan.close();
		
		
		
		
		
	}
	
	
	
	
	
}
