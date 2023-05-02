package co.develhope.java10.hellorepositories;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BookRepository extends CrudRepository<Book, Integer> {
    public Collection<Book> findByTitleContaining(String title);
}
