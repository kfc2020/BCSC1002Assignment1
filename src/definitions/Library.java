/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

public class Library {
    public Book[] allTheBooksThatAreCurrentlyAvailable;

    public Library(Book[] allTheBooksThatAreCurrentlyAvailable) {
        this.allTheBooksThatAreCurrentlyAvailable = allTheBooksThatAreCurrentlyAvailable;
    }

    public Library() {
        this.allTheBooksThatAreCurrentlyAvailable = new Book[10];
        for (int i = 0; i < allTheBooksThatAreCurrentlyAvailable.length; i++) {
            allTheBooksThatAreCurrentlyAvailable[i] = new Book("Book" + (i + 1), null, 1234567891234l + (i + 1));
        }
    }

    public Book[] getAllTheBooksThatAreCurrentlyAvailable() {
        return allTheBooksThatAreCurrentlyAvailable;
    }

    public void setAllTheBooksThatAreCurrentlyAvailable(Book[] allTheBooksThatAreCurrentlyAvailable) {
        this.allTheBooksThatAreCurrentlyAvailable = allTheBooksThatAreCurrentlyAvailable;
    }
}
