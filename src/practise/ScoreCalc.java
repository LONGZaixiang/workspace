package practise;

public class ScoreCalc {

	public int java;
	public int c;
	public int db;
	public int calcTotalScore(){
		return java+c+db;
	}
	public void showTotalScore(){
		
		System.out.println("总成绩是："+calcTotalScore());
	}
	public int calcAvg(){
		
		return calcTotalScore()/3;
	}
	public void showAvg(){
		System.out.println("平均成绩是："+calcAvg());
	}
	
	
	
}
