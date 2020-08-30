/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Scanner;

public class Student {
    Scanner scanner = new Scanner(System.in);
    private String studentName;
    private long universityRollNumber;
    private Book[] nameOfBooks;
    private int numberOfBookIssued = 0;

    public Student(String studentName, long universityRollNumber, Book[] nameOfBooks, int numberOfBookIssued) {
        this.studentName = studentName;
        this.universityRollNumber = universityRollNumber;
        this.nameOfBooks = nameOfBooks;
        this.numberOfBookIssued = numberOfBookIssued;
    }
}
