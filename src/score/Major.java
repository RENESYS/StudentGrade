/* ************************************************************
 * 		Major.java		Yunho Kim
 * 
 * 		Check grade the major subject
 * 
 *************************************************************** */

package score;

import manage.IGetGrade;

public class Major implements IGetGrade{
	
	public Major(){}

	public String checkGrade(int score){
		String grade;
		if(score >= 95)
			grade = "S";
		else if(score >= 90 && score < 95)
			grade = "A";
		else if(score >= 80 && score < 90)
			grade = "B";
		else if(score >= 70 && score < 80)
			grade = "C";
		else if(score >= 60 && score < 70)
			grade = "D";
		else
			grade = "F";
		return grade;
	}
}
