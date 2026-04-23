package com.the703.basic010;

public class Score {

	private String name;
	private int kor, eng, math , total;
	private double aver;
	private String p  , s  , rank;
	
	public Score(String name, int kor, int eng, int math) 
	{ super(); this.name = name; this.kor = kor; this.eng = eng; this.math = math; }
	public Score() { super();  }
	public Score(String name, int kor, int eng, int math, int total, double aver, String p, String s, String rank) 
	{ super(); this.name = name; this.kor = kor; this.eng = eng; this.math = math; this.total = total; 
	this.aver = aver; this.p = p; this.s = s; this.rank = rank; }
	@Override 	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", total=" + total
				+ ", aver=" + aver + ", p=" + p + ", s=" + s + ", rank=" + rank + "]";  }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getKor() { return kor; }
	public void setKor(int kor) { this.kor = kor; }
	public int getEng() { return eng; }
	public void setEng(int eng) { this.eng = eng; }
	public int getMath() { return math; }
	public void setMath(int math) { this.math = math; }
	public int getTotal() { return total; }
	public void setTotal(int total) { this.total = total; }
	public double getAver() { return aver; }
	public void setAver(double aver) { this.aver = aver; }
	public String getP() { return p; }
	public void setP(String p) { this.p = p; }
	public String getS() { return s; }
	public void setS(String s) { this.s = s; }
	public String getRank() { return rank; }
	public void setRank(String rank) { this.rank = rank; }
	public static void info() {
		System.out.print(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\r\n"
				+ "이름\t국어\t영어\t수학\t총점\t평균\t합격여부\t\t장학생\t랭킹\r\n"
				+ ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\r\n");	}
	   
	public void show() {
		total (); 
		//aver ();
		aver = (total/3.0);
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%s\t%s\t%s\n", name,kor,eng,math,total,aver,p,s,rank);	}
    public void total () { total = kor + eng + math ;}
    public void aver () {double ave = (total/3.0) ;}
    
}
/*
::::::::::::::::::::::::::::::::::::::::::::::::::::::::
이름   국어   영어   수학   총점   평균   합격여부   장학생   랭킹
::::::::::::::::::::::::::::::::::::::::::::::::::::::::
iron   100   100   100   300   100.00   합격   장학생   **********
hulk   20   50   30   100   33.33   불합격      ***
*/
