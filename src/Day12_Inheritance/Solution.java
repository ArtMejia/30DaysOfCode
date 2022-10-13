package Day12_Inheritance;

import java.util.*;

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

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here
    String firstname;
    String lastname;
    int id;
    int[] score;
    int sum=0,avarage = 0;

    Student(String firstname, String lastname, int sid, int[] score){
        super(firstname,lastname,sid);

        for(int i : score){
            sum+=i;
        }
        avarage = sum/score.length;}

    /*
     *   Method Name: calculate
     *
     *
     *   @return A character denoting the grade.
     */
// Write your method here
    public char calculate(){
        if(avarage>=90&&avarage<=100){
            return 'O';
        } else if (avarage>=80&&avarage<=90) {
            return 'E';
        } else if (avarage>=70&&avarage<=80) {
            return 'A';
        } else if (avarage>=55&&avarage<=70) {
            return 'P';
        } else if (avarage>=40&&avarage<=55) {
            return 'D';
        }else {
            return 'T';
        }
    }
}

