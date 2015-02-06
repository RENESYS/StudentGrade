/* ************************************************************
 * 		NotMajor.java		Yunho Kim
 * 
 * 		Check grade the not major subjects
 * 
 *************************************************************** */

package score;

import manage.IGetGrade;

public class NotMajor implements IGetGrade{
	
	public NotMajor(){}

	public String checkGrade(int score){
		String grade;
		if(score >= 90)
			grade = "A";
		else if(score >= 80 && score < 90)
			grade = "B";
		else if(score >= 70 && score < 80)
			grade = "C";
		else if(score >= 55 && score < 70)
			grade = "D";
		else
			grade = "F";
		return grade;
	}
}
