package repositories;

import models.Book;
import play.db.jpa.JPAApi;
import services.DatabaseExecutionContext;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.concurrent.CompletableFuture.supplyAsync;

/**
 * Created by greenlucky on 6/3/17.
 */
public class BookRepositoryImpl implements BookRepository{

    private final JPAApi jpaApi;
    private final DatabaseExecutionContext executionContext;

    @Inject
    public BookRepositoryImpl(JPAApi jpaApi, DatabaseExecutionContext executionContext) {
        this.jpaApi = jpaApi;
        this.executionContext = executionContext;
    }

    @Override
    public CompletionStage<Book> add(Book book) {
        return supplyAsync(() -> insert(jpaApi.em("book"), book), executionContext);
    }

    @Override
    public CompletionStage<Stream<Book>> list() {
        return supplyAsync(() -> list(jpaApi.em("book")), executionContext);
    }

    @Override
    public CompletionStage<Boolean> delete(long id) {
        return supplyAsync(() -> remove(jpaApi.em("book"), id), executionContext);
    }

    private Book insert(EntityManager em, Book book) {
        em.persist(book);
        return book;
    }

    private boolean remove(EntityManager em, long id) {
        try {
            em.remove(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private Stream<Book> list(EntityManager em) {
        List<Book> lstBook = em.createQuery("select b from Book b", Book.class).getResultList();
        return lstBook.stream();
    }
}
