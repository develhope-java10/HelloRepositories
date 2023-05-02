package co.develhope.java10.hellorepositories;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookRepository bookRepository; 

    @GetMapping
    public Collection<Book> getAll() {
        return bookRepository.findAll();
    }

    @PostMapping
    public Book insert(@RequestBody Book book) {
        return bookRepository.save(book);
    }
}
