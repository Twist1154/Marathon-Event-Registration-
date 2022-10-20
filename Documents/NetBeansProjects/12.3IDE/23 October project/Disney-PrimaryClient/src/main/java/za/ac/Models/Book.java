
/**
 *Book.java
 * @author Cwenga Dlova(214310671)
 * This is the worker class for Book.
 * 19/10/2022
 * It has been pushed to Git.
 */
package za.ac.Models;

public class Book {
    
    private String bookIsbn;
    private String bookTitle;
    private String bookAuthor;
    private String category;
    private int shelfNumber;
    private int quantity;

    public Book() {
    }

    public Book(String bookIsbn, String bookTitle, String bookAuthor, String category, int shelfNumber, int noOfBooks) {
        this.bookIsbn = bookIsbn;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.category = category;
        this.shelfNumber = shelfNumber;
        this.quantity = noOfBooks;
    }

    public String getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(String bookIsbn) {
        this.bookIsbn = bookIsbn;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getShelfNumber() {
        return shelfNumber;
    }

    public void setShelfNumber(int shelfNumber) {
        this.shelfNumber = shelfNumber;
    }

    public int getNoOfBooks() {
        return quantity;
    }

    public void setNoOfBooks(int noOfBooks) {
        this.quantity = noOfBooks;
    }

    @Override
    public String toString() {
        return "Book{" + "bookIsbn=" + bookIsbn + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor + ", category=" + category + ", shelfNumber=" + shelfNumber + ", noOfBooks=" + quantity + '}';
    }
    
    
}