/* ************************************************************
 * 		GradeTester.java	Yunho Kim
 * 
 * 		Main file of this program
 * 
 *************************************************************** */


package manage;

import java.util.ArrayList;

import score.Score;
import student.Student;

public class GradeTester {

	public static void main(String[] args) {
		Define def = new Define();
		ArrayList<Student> student = new ArrayList<Student>();
		ArrayList<ArrayList<Score>> scores = new ArrayList<ArrayList<Score>>();
		for(int i = 0; i < def.SUBJECTNUM; i++){
			ArrayList<Score> temp = new ArrayList<Score>();
			scores.add(temp);
		}
		
		//read data from file
		ReadWrite rw = new ReadWrite();
		rw.ReadData(student, scores);
		
		//check the grade
		for(int i = 0; i < def.STUDENTNUM; i++){
			for(int j = 0; j < def.SUBJECTNUM; j++){
				scores.get(j).get(i).makeGrade();
			}
		}
		
		//print all data
		//if you want to add new subjects, you have to modify here.
		System.out.println("Name     ID     Major     Math   English");
		System.out.println("============================");
		for(int i = 0; i < def.STUDENTNUM; i++){
			System.out.print(student.get(i).printStudent());
			for(int j = 0; j < def.SUBJECTNUM; j++){
				System.out.print("    " + scores.get(j).get(i).getGrade() + "      ");
			}
			System.out.println("\n----------------------------------------------");
		}
	}

}
