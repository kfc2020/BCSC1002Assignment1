/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {

    private static final int ISSUE_BOOK = 1;
    private static final int RETURN_BOOK = 2;
    private static final int SHOW_ALL_ISSUES_BOOK = 3;
    private static final int INVENTORY_LIST = 4;
    private static final int EXIT = 5;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        int clientInput;
        Student student = new Student();

    }
}
