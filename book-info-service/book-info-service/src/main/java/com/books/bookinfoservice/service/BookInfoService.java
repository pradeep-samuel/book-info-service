/**
 * 
 */
package com.books.bookinfoservice.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.books.bookinfoservice.data.Book;

/**
 * @author pradeepsamuel
 * Date : Jul 23, 2019
 */
@RestController
@RequestMapping("/books")
public class BookInfoService {

    @RequestMapping("/{id}")
    public Book getBookInfo(@PathVariable("id") long id) {
        return new Book(id, "Give and Take", "Adam Grant");
    }
}
