/*  Created by IntelliJ IDEA.
 *  User: Karan faujdar (kfc2020)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

public class Book {
    private String nameOfTheBook;
    private String nameOfTheAuthorOfTheBook;
    private String isbnNumberOfTheBook;

    public Book(String nameOfTheBook, String nameOfTheAuthorOfTheBook, String isbnNumberOfTheBook) {
        this.nameOfTheBook = nameOfTheBook;
        this.nameOfTheAuthorOfTheBook = nameOfTheAuthorOfTheBook;
        this.isbnNumberOfTheBook = isbnNumberOfTheBook;
    }

    public String getNameOfTheBook() {
        return nameOfTheBook;
    }

    public void setNameOfTheBook(String nameOfTheBook) {
        this.nameOfTheBook = nameOfTheBook;
    }

    public String getNameOfTheAuthorOfTheBook() {
        return nameOfTheAuthorOfTheBook;
    }

    public void setNameOfTheAuthorOfTheBook(String nameOfTheAuthorOfTheBook) {
        this.nameOfTheAuthorOfTheBook = nameOfTheAuthorOfTheBook;
    }

    public String getIsbnNumberOfTheBook() {
        return isbnNumberOfTheBook;
    }

    public void setIsbnNumberOfTheBook(String isbnNumberOfTheBook) {
        this.isbnNumberOfTheBook = isbnNumberOfTheBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameOfTheBook='" + nameOfTheBook + '\'' +
                ", nameOfTheAuthorOfTheBook='" + nameOfTheAuthorOfTheBook + '\'' +
                ", isbnNumberOfTheBook='" + isbnNumberOfTheBook + '\'' +
                '}';
    }
}
