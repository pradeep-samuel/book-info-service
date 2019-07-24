/**
 * 
 */
package com.books.bookinfoservice.data;

/**
 * @author pradeepsamuel
 *         Date : Jul 23, 2019
 */

public class Book {

    private long id;
    private String title;
    private String author;

    /**
     * @param id
     * @param title
     * @param author
     */
    public Book(long id, String title, String author) {
        super();
        this.id = id;
        this.title = title;
        this.author = author;
    }

    /**
     * 
     */
    public Book() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
