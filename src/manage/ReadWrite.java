/* ************************************************************
 * 		ReadWrite.java		Yunho Kim
 * 
 * 		Read & Write from File
 * 		Define major subject of students
 * 
 *************************************************************** */

package manage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import score.Major;
import score.NotMajor;
import score.Score;
import student.Student;

public class ReadWrite{
	
	
	public ReadWrite(){}
	
	public void ReadData(ArrayList<Student> stu, ArrayList<ArrayList<Score>> subjects){
		try{
			FileReader fr = new FileReader("data.txt");
			BufferedReader inFile = new BufferedReader(fr);
			String data;
			StringTokenizer st;
			Define def = new Define();
			
			String name;
			int id;
			String major;
			int score;
			
			//read Student's data from file
			for(int i = 0; i < def.STUDENTNUM; i++){
				data = inFile.readLine();
				st = new StringTokenizer(data);
				
				name = st.nextToken();
				id = Integer.parseInt(st.nextToken());
				major = st.nextToken();
				stu.add(new Student(id, name, major));
				
				//read student's score from file
				for(int j = 0; j < def.SUBJECTNUM ; j++){
					score = Integer.parseInt(st.nextToken());
					subjects.get(j).add(new Score(score));
					subjects.get(j).get(i).setInter(new NotMajor());
				}
				
				//define the major subject
				//if you want to add new subjects, you have to modify here.
				if(stu.get(i).getMajor().equals("Math"))
					subjects.get(def.MATH).get(i).setInter(new Major());
				else if(stu.get(i).getMajor().equals("Eng"))
					subjects.get(def.ENG).get(i).setInter(new Major());
					
			}
			inFile.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
