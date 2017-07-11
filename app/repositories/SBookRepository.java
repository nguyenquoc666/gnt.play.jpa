package repositories;

import com.google.inject.ImplementedBy;
import models.Book;

import java.util.stream.Stream;

/**
 * Created by greenlucky on 6/3/17.
 */
@ImplementedBy(SBookRepositoryImpl.class)
public interface SBookRepository {

    Book add(Book book);

    Stream<Book> list();

    Boolean delete(long id);
}
