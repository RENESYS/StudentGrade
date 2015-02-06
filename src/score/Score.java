/* ************************************************************
 * 		Score.java		Yunho Kim
 * 
 * 		Data class of student's score & grade
 * 
 *************************************************************** */

package score;

import manage.IGetGrade;

public class Score{
	private int score;
	private String grade;
	private IGetGrade inter;
	
	public Score(){}
	public Score(int score) {
		this.score = score;
		this.grade = "X";
		this.inter = null;
	}
	
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public IGetGrade getInter() {
		return inter;
	}
	public void setInter(IGetGrade inter) {
		this.inter = inter;
	}
	
	public void makeGrade(){
		grade = inter.checkGrade(score);
	}
}
