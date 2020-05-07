import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;

	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}

	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName
			+ 	"\nID: " + idNumber);
	}

}

class Student extends Person{
	private int[] testScores;
    public Student(String firstName, String lastName, int id, int[] testScores){
        super(firstName,lastName,id);
        this.testScores = testScores;
    }
    char calculate(){
        int n=0;
        int avg;
        for(int i=0; i<testScores.length;i++){
            n = n + testScores[i];
        }
        avg = n/testScores.length;
        char grade;
        if(avg<=100 && avg>=90){
            grade ='O';
        }else if (avg<90 && avg >=80){
            grade = 'E';
        }else if ( avg<80 && avg >=70){
            grade = 'A';
        }else if ( avg<70 && avg >=55){
            grade = 'P';
        }else if (avg <55 && avg >=40){
            grade = 'D';
        }else{ grade = 'T';}
         return grade;

    }



}

class Solution {
