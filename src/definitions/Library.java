/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

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

    @Override
    public String toString() {
        return "Library{" +
                "allTheBooksThatAreCurrentlyAvailable=" + Arrays.toString(allTheBooksThatAreCurrentlyAvailable) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(getAllTheBooksThatAreCurrentlyAvailable(), library.getAllTheBooksThatAreCurrentlyAvailable());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getAllTheBooksThatAreCurrentlyAvailable());
    }
}
