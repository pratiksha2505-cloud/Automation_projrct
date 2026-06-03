//Create a student result system using marks from @DataProvider.
package DataProvider_Programs;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StudentResult_System {
	@DataProvider(name="Student_Marks")
	public Object[][] StudentData(){
		return new Object[][]
				{
			{"Mihir",79,80,91,82,94},
			{"Zalak",67,78,56,70,68},
			{"Nidhi",55,60,65,78,67},
			{"Rishi",35,26,30,40,35}
				};
	}
	
	@Test(dataProvider = "Student_Marks")
	public void Student_Result(String name,int math,int sci, int ss,int eng,int guj)
	{
		int total=math+sci+ss+eng+guj;
		double per=total/5.0;
		String grade,result;
		
		//pass or fail logic
		if(math<35 || sci<35 || ss<35 || eng<35 || guj<35)
		{
			grade="F";
			result="FAIL";
		}
		else
		{
			//Result is Pass. Logic for find grade
			result="PASS";
			if(per>=90)
				grade="A+";
			else if(per>=75 && per<=89)
				grade="A";
			else if(per>=60 && per<=74)
				grade="B";
			else if(per>=50 && per<=59)
				grade="C";
			else
				grade="D";
		}
		
		// Output
        System.out.println("-----------------------------------");
        System.out.println("Student Name   : " + name);
        System.out.println("Mathamatics    : " + math);
        System.out.println("Science        : " + sci);
        System.out.println("Social Science : " + ss);
        System.out.println("English        : " + eng);
        System.out.println("Gujarati       : " + guj);
        System.out.println("Total Marks    : " + total);
        System.out.println("Percentage     : " + per);
        System.out.println("Grade          : " + grade);
        System.out.println("Result         : " + result);
	}
}
