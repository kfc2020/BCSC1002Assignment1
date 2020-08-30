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

    public Student() {
        this.nameOfBooks = new Book[5];
    }

    public Book[] getNameOfBooks() {
        return nameOfBooks;
    }

    public void setNameOfBooks(Book[] nameOfBooks) {
        this.nameOfBooks = nameOfBooks;
    }

    /**
     * This method helps us to issue the book.
     */

    public void doIssue() {
        if (numberOfBookIssued == 0) {
            System.out.print("Please enter your name: ");
            studentName = scanner.nextLine();
            System.out.print("enter your university number : ");
            universityRollNumber = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.print("enter book name: ");
        String bookName = scanner.nextLine();
        System.out.print("enter the author name of the book: ");
        String authorName = scanner.nextLine();
        System.out.print("enter the ISBN number of book which write on the book: ");
        long ISBNNumber = scanner.nextInt();
        scanner.nextLine();
        nameOfBooks[getNumberOfBookIssued()] = new Book(bookName, authorName, ISBNNumber);
        System.out.println(bookName + " " + "book issued!");
        System.out.println("---Press ENTER button for go to FrontDesk.--- ");
        scanner.nextLine();
    }

    /**
     * this method helps us to return the book.
     */

    public void doReturn() {
        if (numberOfBookIssued == 0) {
            System.out.println("No book available for return. ");
        } else {
            numberOfBookIssued = 0;
            this.nameOfBooks = new Book[5];
            System.out.println("Book returned successfully!");
        }
        System.out.println("---Press ENTER button for go to FrontDesk.--- ");
        scanner.nextLine();
    }

    /**
     * This method show a list of all the issued book.
     */

    public void showIssuesBook() {
        System.out.println("Student name: " + studentName);
        System.out.println("University roll no.: " + universityRollNumber);
        for (int i = 0; i < numberOfBookIssued; i++) {
            System.out.println(nameOfBooks[i]);
        }
        if (numberOfBookIssued == 0) {
            System.out.println("no any book issued!");
        }
        System.out.println("---Press ENTER button for go to FrontDesk.--- ");
        scanner.nextLine();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    public int getNumberOfBookIssued() {
        return numberOfBookIssued;
    }

    public void setNumberOfBookIssued(int numberOfBookIssued) {
        this.numberOfBookIssued = numberOfBookIssued;
    }
}
